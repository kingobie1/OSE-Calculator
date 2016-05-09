package calc.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import calc.model.CalcManager;
import calc.util.OperationType;

/**
 * Have calculator manager calculate on button press.
 * @author Obatola Seward-Evans
 *
 */
public class ControllerButtonCalculate implements ActionListener{
	CalcManager calcManager = CalcManager.getInstance();
	
	public void actionPerformed(ActionEvent e) {
		if (!calcManager.isValid()) { return; }
		
		OperationType type = calcManager.getOperationType();
		calcManager.calculate(type);
		calcManager.postCalculation();
	}

}
