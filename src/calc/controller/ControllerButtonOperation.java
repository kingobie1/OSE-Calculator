package calc.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import calc.model.CalcManager;
import calc.util.OperationType;
import calc.util.SoundManager;
import calc.util.SoundType;
import calc.view.CalculatorTextView;

/**
 * Controller that handles the press of an operation button.
 * @author Obatola Seward-Evans
 *
 */
public class ControllerButtonOperation implements ActionListener {
	CalcManager calcManager = CalcManager.getInstance();
	CalculatorTextView calculatorTextView = CalculatorTextView.getInstance();

	OperationType type;
	
	public ControllerButtonOperation(OperationType type) {
		this.type = type;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (!calcManager.isValid()) { return; }
		
		SoundManager.getInstance().playSound(SoundType.BUTTONSOUND);
		
		if (calcManager.getOperationCount() == 0 || calcManager.isPostCalculation()) {
			calcManager.setOperationType(type);
			calcManager.setFistValue();
			calcManager.incrementCount();
			calculatorTextView.hardReset();
			calculatorTextView.newValue();
		} else if (calcManager.getOperationCount() == 1) {
			calcManager.calculate(calcManager.getOperationType());
			calcManager.setOperationType(type);
			calculatorTextView.newValue();
		}
	}
}
