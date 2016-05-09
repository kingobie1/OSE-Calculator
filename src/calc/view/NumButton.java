package calc.view;

import java.awt.Color;

import javax.swing.JButton;

/**
 * Buttons that hold the numbers 0-9 and the decimal point.
 * @author ObaSewardEvans
 *
 */
public class NumButton extends JButton {
	public NumButton(String text) {
		this.setText(text);
		this.setBackground(Color.white);
	}
}
