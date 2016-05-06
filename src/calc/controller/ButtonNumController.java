package calc.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import calc.model.CalcText;
import calc.view.CalcScreen;

public class ButtonNumController implements ActionListener{
	private CalcText calcText;
	private String numString;
	JTextField textField;
	private int num;
	
	public ButtonNumController(int num, JTextField textField) {
		this.num = num;
		this.numString = num + "";
		this.textField = textField;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		calcText = CalcText.getInstance();
		calcText.addText(numString);
		textField.setText(calcText.getCalcString());
		
	}

}
