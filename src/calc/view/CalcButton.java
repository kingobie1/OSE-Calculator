package calc.view;

import java.awt.Color;

import javax.swing.JButton;

public class CalcButton extends JButton {
	public CalcButton(String text) {
		this.setText(text);
		this.setBackground(Color.lightGray);
	}
}