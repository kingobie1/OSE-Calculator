package calc.view;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

<<<<<<< Updated upstream
import calc.controller.ButtonCalculateController;
import calc.controller.ButtonClearController;
import calc.controller.ButtonNumController;
import calc.model.CalcText;
=======
import calc.model.OperationType;
>>>>>>> Stashed changes

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

/**
 * Screen that you use to calculate.
 * @author ObaSewardEvans
 *
 */
public class CalcScreen extends JPanel {
	public JTextField txtCalculation;

	/**
	 * Create the panel.
	 */
	public CalcScreen() {
		setBounds(0, 0, 300, 450);
		
		
		txtCalculation = new JTextField();
		txtCalculation.setHorizontalAlignment(SwingConstants.RIGHT);
		txtCalculation.setFont(new Font("Monospaced", Font.PLAIN, 18));
		txtCalculation.setColumns(10);
		txtCalculation.setEditable(true);
		
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
<<<<<<< Updated upstream
		
		numButton0.addActionListener(new ButtonNumController(0, txtCalculation));
		numButton1.addActionListener(new ButtonNumController(1, txtCalculation));
		numButton2.addActionListener(new ButtonNumController(2, txtCalculation));
		numButton3.addActionListener(new ButtonNumController(3, txtCalculation));
		numButton4.addActionListener(new ButtonNumController(4, txtCalculation));
		numButton5.addActionListener(new ButtonNumController(5, txtCalculation));
		numButton6.addActionListener(new ButtonNumController(6, txtCalculation));
		numButton7.addActionListener(new ButtonNumController(7, txtCalculation));
		numButton8.addActionListener(new ButtonNumController(8, txtCalculation));
		numButton9.addActionListener(new ButtonNumController(9, txtCalculation));
=======
		NumButton numButtonDecimal = new NumButton(".");
>>>>>>> Stashed changes
		
		CalcButton calculateButton = new CalcButton("=");
		CalcButton calcButtonDivision = new CalcButton("÷");
		CalcButton calcButtonMultiplication = new CalcButton("x");
		CalcButton calcButtonSubtraction = new CalcButton("-");
		CalcButton calcButtonAddition = new CalcButton("+");
<<<<<<< Updated upstream
=======
		
>>>>>>> Stashed changes
		CalcButton calcButtonClear = new CalcButton("ac");
		CalcButton calcButtonBrackL = new CalcButton("(");
		CalcButton calcButtonBracR = new CalcButton(")");
		CalcButton calcButtonPercentage = new CalcButton("%");
		
<<<<<<< Updated upstream
		calculateButton.addActionListener(new ButtonCalculateController());
		calcButtonClear.addActionListener(new ButtonClearController(txtCalculation));
		
		
=======
>>>>>>> Stashed changes
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(txtCalculation, GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(41)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(numButton4, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(numButton5, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(numButton6, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(calcButtonMultiplication, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(numButton1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(numButton2, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
										.addComponent(numButton0, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(calculateButton, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(calcButtonAddition, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(numButton3, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(calcButtonSubtraction, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(numButton7, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(numButton8, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(numButton9, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(calcButtonBrackL, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(calcButtonBracR, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(calcButtonPercentage, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(calcButtonClear, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
										.addComponent(calcButtonDivision, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))))))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(txtCalculation, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
					.addGap(30)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(calcButtonBracR, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(calcButtonBrackL, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(calcButtonPercentage, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addComponent(calcButtonClear, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(numButton7, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(numButton8, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(numButton9, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(calcButtonDivision, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(numButton4, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(numButton5, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(numButton6, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(calcButtonMultiplication, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(numButton1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(numButton2, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(numButton3, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(calcButtonSubtraction, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(calcButtonAddition, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(numButton0, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(calculateButton, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(88, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
	}
}
