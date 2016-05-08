package calc.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import calc.model.CalcManager;
import calc.model.OperationType;

// have calculator manager calculate on button press.
public class ControllerButtonCalculate implements ActionListener{
	CalcManager calcManager = CalcManager.getInstance();
	
	public void actionPerformed(ActionEvent e) {
		OperationType type = calcManager.getOperationType();
		calcManager.calculate(type);
	}

}
