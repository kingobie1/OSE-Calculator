package calc.view;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JButton;

import calc.util.ColorManager;
import calc.util.ColorType;

/**
 * Buttons that hold the numbers 0-9 and the decimal point.
 * @author Obatola Seward-Evans
 *
 */
public class NumButton extends JButton {
	ColorManager colorManager = ColorManager.getInstance();

	public NumButton(String text) {
		super.setContentAreaFilled(false);
		setForeground(colorManager.getColor(ColorType.TEXT));
		setBorderPainted(false);
		setFocusPainted(false);
		this.setText(text);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		Color color = colorManager.getColor(ColorType.numberBUTTON);
		g.setColor(color);
		
		if (getModel().isPressed()) {
			color = colorManager.getColor(ColorType.buttonPRESSED);
			g.setColor(color);
		}
		
		g.fillRect(0, 0, getWidth(), getHeight());
//		g.fillOval(6, 6, 40, 40);
		super.paintComponent(g);
	}
}
