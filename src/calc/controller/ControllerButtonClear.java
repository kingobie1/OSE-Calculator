package calc.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import calc.model.CalcManager;
import calc.util.SoundManager;
import calc.util.SoundType;
import calc.view.CalcButton;
import calc.view.CalculatorTextView;

/**
 * Controller that handles clearing the screen.
 * @author Obatola Seward-Evans
 *
 */
public class ControllerButtonClear implements ActionListener{
	CalculatorTextView calculatorTextView = CalculatorTextView.getInstance();
	CalcManager calcManager = CalcManager.getInstance();
	CalcButton button;

	@Override
	public void actionPerformed(ActionEvent e) {
		SoundManager.getInstance().playSound(SoundType.BUTTONSOUND);
		
		if (calculatorTextView.getText().equals("0") || calculatorTextView.getText().equals("")) {
			// Clear text and manager
			calculatorTextView.hardReset();
			calcManager.reset();
		} else {
			// clear text
			calculatorTextView.resetText();
		}
		
		calculatorTextView.refreshClearButton();
	}

}
