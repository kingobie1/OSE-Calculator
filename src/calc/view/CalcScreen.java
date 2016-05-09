package calc.view;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import javax.swing.LayoutStyle.ComponentPlacement;

import calc.controller.ControllerButtonCalculate;
import calc.controller.ControllerButtonClear;
import calc.controller.ControllerButtonOperation;
import calc.controller.ControllerNumButton;
import calc.util.ColorManager;
import calc.util.ColorType;
import calc.util.OperationType;

/**
 * Screen that you use to calculate.
 * @author Obatola Seward-Evans
 *
 */
public class CalcScreen extends JPanel {
	ColorManager colorManager = ColorManager.getInstance();
	public static final int BUTTONSIZE = 53;

	/**
	 * Create the panel.
	 */
	public CalcScreen() {
		setBackground(colorManager.getColor(ColorType.BACKGROUND));
		setBounds(0, 0, 237, 373);
		
		// initialize number buttons.
		NumButton numButton0 = new NumButton("0");
		NumButton numButton1 = new NumButton("1");
		NumButton numButton2 = new NumButton("2");
		NumButton numButton3 = new NumButton("3");
		NumButton numButton4 = new NumButton("4");
		NumButton numButton5 = new NumButton("5");
		NumButton numButton6 = new NumButton("6");
		NumButton numButton7 = new NumButton("7");
		NumButton numButton8 = new NumButton("8");
		NumButton numButton9 = new NumButton("9");
		NumButton numButtonDecimal = new NumButton(".");
		
		// add controller to number buttons.
		numButton0.addActionListener(new ControllerNumButton("0"));
		numButton1.addActionListener(new ControllerNumButton("1"));
		numButton2.addActionListener(new ControllerNumButton("2"));
		numButton3.addActionListener(new ControllerNumButton("3"));
		numButton4.addActionListener(new ControllerNumButton("4"));
		numButton5.addActionListener(new ControllerNumButton("5"));
		numButton6.addActionListener(new ControllerNumButton("6"));
		numButton7.addActionListener(new ControllerNumButton("7"));
		numButton8.addActionListener(new ControllerNumButton("8"));
		numButton9.addActionListener(new ControllerNumButton("9"));
		numButtonDecimal.addActionListener(new ControllerNumButton("."));
		
		// non number buttons.
		CalcButton calculateButton = new CalcButton("=");
		CalcButton calcButtonDivision = new CalcButton("÷");
		CalcButton calcButtonMultiplication = new CalcButton("x");
		CalcButton calcButtonSubtraction = new CalcButton("-");
		CalcButton calcButtonAddition = new CalcButton("+");
		CalcButton calcButtonClear = new CalcButton("ac");
		CalcButton calcButtonBrackL = new CalcButton("(");
		calcButtonBrackL.setEnabled(false);
		CalcButton calcButtonBracR = new CalcButton(")");
		calcButtonBracR.setEnabled(false);
		CalcButton calcButtonPercentage = new CalcButton("%");
		calcButtonPercentage.setEnabled(false);
		
		// set calculate button color.
		calculateButton.setBackground(colorManager.getColor(ColorType.calculateBUTTON));

		// add controllers to non number buttons.
		calculateButton.addActionListener(new ControllerButtonCalculate());
		calcButtonAddition.addActionListener(new ControllerButtonOperation(OperationType.ADDITION));
		calcButtonSubtraction.addActionListener(new ControllerButtonOperation(OperationType.SUBTRACTION));
		calcButtonMultiplication.addActionListener(new ControllerButtonOperation(OperationType.MULTIPLICATION));
		calcButtonDivision.addActionListener(new ControllerButtonOperation(OperationType.DIVISION));
		calcButtonClear.addActionListener(new ControllerButtonClear());
		
		// screen that views the calculation numbers.
		CalculatorTextView calculatorTextView = CalculatorTextView.getInstance();
//		JPanel calculatorTextView = new JPanel();
		calculatorTextView.refresh();
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addGap(9)
							.addComponent(calculatorTextView, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addGap(8)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(numButton4, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
									.addGap(3)
									.addComponent(numButton5, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
									.addGap(3)
									.addComponent(numButton6, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
									.addGap(3)
									.addComponent(calcButtonMultiplication, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(numButton1, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
											.addGap(3)
											.addComponent(numButton2, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(numButton0, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
											.addGap(3)
											.addComponent(numButtonDecimal, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)))
									.addGap(3)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(calculateButton, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
											.addGap(3)
											.addComponent(calcButtonAddition, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(numButton3, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
											.addGap(3)
											.addComponent(calcButtonSubtraction, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE))))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(numButton7, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
											.addGap(3)
											.addComponent(numButton8, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
											.addGap(3)
											.addComponent(numButton9, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(calcButtonBrackL, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
											.addGap(3)
											.addComponent(calcButtonBracR, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
											.addGap(3)
											.addComponent(calcButtonPercentage, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)))
									.addGap(3)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(calcButtonClear, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
										.addComponent(calcButtonDivision, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE))))))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addGap(14)
					.addComponent(calculatorTextView, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(calcButtonBrackL, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
							.addComponent(calcButtonBracR, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
							.addComponent(calcButtonPercentage, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE))
						.addComponent(calcButtonClear, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE))
					.addGap(3)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(numButton7, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
						.addComponent(numButton8, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
						.addComponent(numButton9, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
						.addComponent(calcButtonDivision, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE))
					.addGap(3)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(numButton4, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
						.addComponent(numButton5, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
						.addComponent(numButton6, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
						.addComponent(calcButtonMultiplication, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE))
					.addGap(3)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(numButton1, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
						.addComponent(numButton2, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
						.addComponent(numButton3, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
						.addComponent(calcButtonSubtraction, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE))
					.addGap(3)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(calcButtonAddition, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
						.addComponent(numButton0, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
						.addComponent(calculateButton, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
						.addComponent(numButtonDecimal, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE))
					.addGap(11))
		);
		setLayout(groupLayout);
	}
}
