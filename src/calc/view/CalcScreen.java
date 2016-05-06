package calc.view;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JButton;

/**
 * Screen that you use to calculate.
 * @author ObaSewardEvans
 *
 */
public class CalcScreen extends JPanel {
	private JTextField txtCalculation;

	/**
	 * Create the panel.
	 */
	public CalcScreen() {
		
		txtCalculation = new JTextField();
		txtCalculation.setText("Calculation");
		txtCalculation.setColumns(10);
		
		JButton btnCalculate = new JButton("calculate");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(126)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(txtCalculation, GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(39)
							.addComponent(btnCalculate)))
					.addContainerGap(125, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(114)
					.addComponent(txtCalculation, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnCalculate)
					.addContainerGap(113, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}
}
