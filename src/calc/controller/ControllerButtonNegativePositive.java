package calc.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import calc.view.CalculatorTextView;

public class ControllerButtonNegativePositive implements ActionListener{
	CalculatorTextView calculatorTextView = CalculatorTextView.getInstance();
	
	public ControllerButtonNegativePositive() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		calculatorTextView.negPosSwitch();	
	}
}
