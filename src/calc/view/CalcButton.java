package calc.view;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JButton;

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
		super.setContentAreaFilled(false);
		setForeground(colorManager.getColor(ColorType.TEXT));
		setBorderPainted(false);
		setFocusPainted(false);
		this.setText(text);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		Color color = colorManager.getColor(ColorType.operationBUTTON);
		g.setColor(color);
		
		if (getModel().isPressed()) {
			color = colorManager.getColor(ColorType.buttonPRESSED);
			g.setColor(color);
		}
		
		g.fillRect(0, 0, getWidth(), getHeight());
		super.paintComponent(g);
	}
}