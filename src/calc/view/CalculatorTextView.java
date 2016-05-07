package calc.view;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;

public class CalculatorTextView extends JPanel {
	private static CalculatorTextView instance = new CalculatorTextView();
	JLabel lblText;
	
	/**
	 * Create the panel.
	 */
	private CalculatorTextView() {
		setBounds(0, 0, 218, 55);
		setBackground(Color.white);
		setBorder(BorderFactory.createLineBorder(Color.gray));
		
		lblText = new JLabel("");

		lblText.setHorizontalAlignment(SwingConstants.RIGHT);
		lblText.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 20));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(lblText, GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(lblText, GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
		);
		setLayout(groupLayout);
	}
	
	public static CalculatorTextView getInstance() {
		return instance;
	}
	
	public String getText() {
		return lblText.getText();
	}
	
	public double getDouble() {
		if (lblText.getText() == null) { return 0; }
		return Double.parseDouble(lblText.getText());
	}
	
	public void resetText() {
		lblText.setText("");
	}
	
	public void addText(String s){
		String tempString = lblText.getText();
		tempString = tempString.concat(s);
		lblText.setText(tempString);
	}
}
