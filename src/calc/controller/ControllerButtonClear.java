package calc.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import calc.view.CalculatorTextView;

public class ControllerButtonClear implements ActionListener{
	CalculatorTextView calculatorTextView = CalculatorTextView.getInstance();

	@Override
	public void actionPerformed(ActionEvent e) {
		calculatorTextView.resetText();
	}

}
