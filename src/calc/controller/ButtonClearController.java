package calc.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import calc.model.CalcText;

public class ButtonClearController implements ActionListener {
	CalcText calcText;
	JTextField txtCalculation;
	
	public ButtonClearController(JTextField txtCalculation) {
		calcText = CalcText.getInstance();
		this.txtCalculation = txtCalculation;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		calcText.setText("");
		txtCalculation.setText(calcText.getCalcString());
	}
	
}
