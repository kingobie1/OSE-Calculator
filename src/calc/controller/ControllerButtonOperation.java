package calc.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import calc.model.CalcManager;
import calc.model.OperationType;
import calc.view.CalculatorTextView;

public class ControllerButtonOperation implements ActionListener {
	CalcManager calcManager = CalcManager.getInstance();
	CalculatorTextView calculatorTextView = CalculatorTextView.getInstance();

	OperationType type;
	
	public ControllerButtonOperation(OperationType type) {
		this.type = type;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		calcManager.setOperationType(type);
		
		if (calcManager.isPreCalculation()) {
			calcManager.setFistValue();
			
		} else {
			calcManager.calculate(type);
		}
		
		calculatorTextView.resetText();
	}
}
