package calc.view;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.security.auth.Refreshable;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import calc.util.ColorManager;
import calc.util.ColorType;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;

/**
 * JPanel that shows the calculator screen (numbers).
 * @author Obatola Seward-Evans
 *
 */
public class CalculatorTextView extends JPanel {
	ColorManager colorManager = ColorManager.getInstance();
	private static CalculatorTextView instance = new CalculatorTextView();
	JLabel lblText;
	boolean newVal;
	CalcButton clearButton;
	
	/**
	 * Create the panel.
	 */
	private CalculatorTextView() {
		setBackground(colorManager.getColor(ColorType.textVIEW));
		setBorder(getBorder());
		// Currently Does nothing.
		Dimension maximumSize = new Dimension(218, 55);
		setMaximumSize(maximumSize);
		setBounds(0, 0, 218, 55);
		
		lblText = new JLabel("");
		lblText.setForeground(colorManager.getColor(ColorType.textVIEWtext));

		lblText.setHorizontalAlignment(SwingConstants.RIGHT);
		lblText.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 24));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(lblText, GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(lblText, GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
		);
		setLayout(groupLayout);
	}
	
	/**
	 * get the instance of the CalculatorTextView.
	 * @return
	 */
	public static CalculatorTextView getInstance() {
		return instance;
	}
	
	/**
	 * get the text represented on the screen.
	 * @return
	 */
	public String getText() {
		return lblText.getText();
	}
	
	/**
	 * get the double value from the string.
	 * @return
	 */
	public double getDouble() {
//		if (lblText.getText() == null || lblText.getText() == "") { return -0; }
//		return Double.parseDouble(lblText.getText());
		
		double d;
		
		try {
		     d = Double.parseDouble(lblText.getText());
		}
		catch (NullPointerException | NumberFormatException  e) {
			System.out.println("could not parse double");
		     d = -0;
		}
		
		return d;
	}
	
	/**
	 * set the text to 0.
	 */
	public void resetText() {
		lblText.setText("0");
	}
	
	/** 
	 * set the screen blank.
	 */
	public void hardReset() {
		lblText.setText("");
	}
	
	/**
	 * add a number to the screen.
	 * @param s
	 */
	public void addText(String s){
		if (newVal == true) {
			this.resetText();
		}
		
		if (this.getText().equals("0")){
			this.hardReset();
		}
		
		String tempString = lblText.getText();
		tempString = tempString.concat(s);
		lblText.setText(tempString);
		
		refreshClearButton();
		newVal = false;
	}

	/**
	 * new value on the screen.
	 */
	public void newValue() {
		newVal = true;
	}
	
	/**
	 * refresh text view screen.
	 */
	public void refresh(){
		this.revalidate();
		setBackground(colorManager.getColor(ColorType.textVIEW));
		lblText.setForeground(colorManager.getColor(ColorType.textVIEWtext));
		this.refreshClearButton();
	}
	
	/**
	 * get the clear button so that you can switch from 'C' to 'AC'
	 * :( I know bad code :(
	 * @param button
	 */
	public void giveClearButton(CalcButton button) {
		this.clearButton = button;
	}
	
	/**
	 * switch clear button on CalcScreen between AC and C
	 */
	public void refreshClearButton(){
		if (clearButton == null) { return; }
		
		if (this.getText().equals("0") || this.getText().equals("")){
			clearButton.setText("AC");
			clearButton.revalidate();
		} else {
			clearButton.setText("C");
			clearButton.revalidate();
		}
	}

	public void negPosSwitch() {
		if (lblText.getText().equals("")) { return; }
		String tempString = lblText.getText();
		
		if (tempString.substring(0, 1).equals("-")) { // if negative.
			// set positive.
			lblText.setText(tempString.substring(1));
		} else { // if positive.
			// set negative.
			System.out.println(lblText.getText().substring(0, 1));
			lblText.setText("-" + tempString);
		}
	}
}
