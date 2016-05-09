package calc.view;

import java.awt.Color;

import javax.swing.JButton;

/**
 * Buttons on the calculator screen.
 * used for non number buttons.
 * @author ObaSewardEvans
 *
 */
public class CalcButton extends JButton {
	public CalcButton(String text) {
		this.setText(text);
		this.setBackground(Color.lightGray);
	}
}