package calc.view;

import java.awt.Color;

import javax.swing.JButton;

import calc.model.ColorManager;
import calc.model.ColorType;

/**
 * Buttons that hold the numbers 0-9 and the decimal point.
 * @author Obatola Seward-Evans
 *
 */
public class NumButton extends JButton {
	ColorManager colorManager = ColorManager.getInstance();

	public NumButton(String text) {
		setBackground(colorManager.getColor(ColorType.numberBUTTON));
		setForeground(Color.white);
		setBorderPainted(false);
		this.setText(text);
	}
}
