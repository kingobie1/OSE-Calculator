package calc.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import calc.view.CalculatorTextView;

/**
 * Controller that handles the press of a number button.
 * @author ObaSewardEvans
 *
 */
public class ControllerNumButton implements ActionListener {
	CalculatorTextView calculatorTextView = CalculatorTextView.getInstance();
	int num;
	
	public ControllerNumButton(int n) {
		num = n;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		calculatorTextView.addText(num + "");
	}

}
