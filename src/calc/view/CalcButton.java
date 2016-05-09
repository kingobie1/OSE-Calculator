package calc.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.border.EmptyBorder;

import calc.model.ColorManager;
import calc.model.ColorType;

/**
 * Buttons on the calculator screen.
 * used for non number buttons.
 * @author Obatola Seward-Evans
 *
 */
public class CalcButton extends JButton {
	ColorManager colorManager = ColorManager.getInstance();
	
	public CalcButton(String text) {
		setBackground(colorManager.getColor(ColorType.operationBUTTON));
		setForeground(colorManager.getColor(ColorType.TEXT));
		setBorderPainted(false);
		this.setText(text);
	}
}