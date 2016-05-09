package tests;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseWheelEvent;

import calc.controller.ControllerButtonCalculate;
import calc.controller.ControllerButtonClear;
import calc.controller.ControllerButtonOperation;
import calc.controller.ControllerNumButton;
import calc.model.CalcManager;
import calc.util.OperationType;
import calc.view.CalcButton;
import calc.view.CalcWindowFrame;
import calc.view.CalculatorTextView;
import calc.view.NumButton;
import junit.framework.TestCase;

/**
 * Tests for the calculator
 * @author ObaSewardEvans
 *
 */
public class testCalculations extends TestCase {
	String clickType;
	CalcManager calcManager = CalcManager.getInstance();
	CalcWindowFrame game = CalcWindowFrame.getInstace();
	CalculatorTextView calcText = CalculatorTextView.getInstance();
	
	NumButton oneButton;
	NumButton twoButton;
	NumButton threeButton;
	NumButton decimalButton;
	
	CalcButton calculateButton;
	CalcButton calcButtonDivision;
	CalcButton calcButtonMultiplication;
	CalcButton calcButtonSubtraction;
	CalcButton calcButtonAddition;
	CalcButton calcButtonClear;
	
	public void startUp(){
		
		/* *** Initialize Operation Button and Controllers *** */		
		ControllerButtonOperation addController = new ControllerButtonOperation(OperationType.ADDITION);
		ControllerButtonOperation subtractionController = new ControllerButtonOperation(OperationType.SUBTRACTION);
		ControllerButtonOperation multiplyController = new ControllerButtonOperation(OperationType.MULTIPLICATION);
		ControllerButtonOperation divisionController = new ControllerButtonOperation(OperationType.DIVISION);
		ControllerButtonCalculate calculateController = new ControllerButtonCalculate();
		ControllerButtonClear clearController = new ControllerButtonClear();
		
		calculateButton = new CalcButton("=");
		calcButtonDivision = new CalcButton("÷");
		calcButtonMultiplication = new CalcButton("x");
		calcButtonSubtraction = new CalcButton("-");
		calcButtonAddition = new CalcButton("+");
		calcButtonClear = new CalcButton("ac");
		
		calculateButton.addActionListener(calculateController);
		calcButtonDivision.addActionListener(divisionController);
		calcButtonMultiplication.addActionListener(multiplyController);
		calcButtonSubtraction.addActionListener(subtractionController);
		calcButtonAddition.addActionListener(addController);
		calcButtonClear.addActionListener(clearController);
		
		/* *** Initialize Number Button and Controllers *** */
		ControllerNumButton oneController = new ControllerNumButton("1");
		ControllerNumButton twoController = new ControllerNumButton("2");
		ControllerNumButton threeController = new ControllerNumButton("3");
		ControllerNumButton decimalController = new ControllerNumButton(".");
		
		oneButton = new NumButton("1");
		twoButton = new NumButton("2");
		threeButton = new NumButton("3");
		decimalButton = new NumButton(".");
		
		oneButton.addActionListener(oneController);
		twoButton.addActionListener(twoController);
		threeButton.addActionListener(threeController);
		decimalButton.addActionListener(decimalController);
		
		// reset all fields.
		calcButtonClear.doClick();
	}
	
	public void testDecimal() {
		startUp();
		
		oneButton.doClick();
		twoButton.doClick();
		decimalButton.doClick();
		twoButton.doClick();
		
		assertEquals(12.2, calcText.getDouble());	
	}
	
	public void testClear(){
		startUp();
		assertEquals("", calcText.getText());
		
		oneButton.doClick();
		twoButton.doClick();
		
		calcButtonClear.doClick();
		assertEquals("", calcText.getText());
	}
	
	public void testAddition(){
		startUp();
		
		oneButton.doClick();
		twoButton.doClick();
		decimalButton.doClick();
		twoButton.doClick();
		
		calcButtonAddition.doClick();
		
		twoButton.doClick();
		twoButton.doClick();

		// 12.2 + 22
		calculateButton.doClick();
		
		// 12.2 + 22 = 34.2
		assertEquals(34.2, calcText.getDouble());
	}
	
	public void testSubtraction(){
		startUp();
		
		oneButton.doClick();
		twoButton.doClick();
		decimalButton.doClick();
		twoButton.doClick();
		
		calcButtonSubtraction.doClick();
		
		twoButton.doClick();
		twoButton.doClick();

		// 12.2 - 22
		calculateButton.doClick();
		
		// 12.2 - 22 = -9.8
		assertEquals(-9.8, calcText.getDouble());
	}
	
	public void testMultiplication(){
		startUp();

		
		oneButton.doClick();
		twoButton.doClick();
		decimalButton.doClick();
		twoButton.doClick();
		
		calcButtonMultiplication.doClick();
		
		twoButton.doClick();

		// 12.2 * 2
		calculateButton.doClick();
		
		// 12.2 * 2 = 24.4
		assertEquals(24.4, calcText.getDouble());
	}
	
	public void testDivision(){
		startUp();
		
		oneButton.doClick();
		twoButton.doClick();
		decimalButton.doClick();
		twoButton.doClick();
		
		calcButtonDivision.doClick();
		
		twoButton.doClick();

		// 12.2 / 2
		calculateButton.doClick();
		
		// 12.2 / 2 = 6.1
		assertEquals(6.1, calcText.getDouble());
	}
	
	public void testCalculationOnCalculation(){
		startUp();
		
		oneButton.doClick();
		twoButton.doClick();
		decimalButton.doClick();
		twoButton.doClick();
		
		calcButtonAddition.doClick();
		
		twoButton.doClick();
		twoButton.doClick();

		// 12.2 + 22 = 34.2
		calculateButton.doClick();

		calcButtonMultiplication.doClick();
		
		threeButton.doClick();
		calculateButton.doClick();
		
		// 34.2 * 3 = 102.6 
		assertEquals(102.6, calcText.getDouble());	
	}
	
	public void testSequenceOfCalculations(){
		startUp();
		
		oneButton.doClick();
		twoButton.doClick();
		decimalButton.doClick();
		twoButton.doClick();
		
		calcButtonAddition.doClick();
		
		twoButton.doClick();
		twoButton.doClick();

		// 12.2 + 22 = 34.2
		
		calcButtonDivision.doClick();
		
		twoButton.doClick();
		
		//  34.2 / 2 = 17.1
		
		calcButtonSubtraction.doClick();
		
		threeButton.doClick();
		
		calculateButton.doClick();
		
		// 17.1 - 3 = 14.1
		assertEquals(14.1, calcText.getDouble());
		
		
	}

}
