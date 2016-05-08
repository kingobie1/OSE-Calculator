package calc.model;

import calc.view.CalculatorTextView;

public class CalcManager {
	// check if the state is pre or post calculation.
	boolean isPreCalculation = true;
	double firstValue;
	OperationType operationType;
	
	private static CalcManager instance = new CalcManager();
	CalculatorTextView calculatorTextView = CalculatorTextView.getInstance();
	
	private CalcManager() {
		// TODO Auto-generated constructor stub
	}
	
	public static CalcManager getInstance() {
		return instance;
	}
	
	public boolean isPreCalculation(){
		return isPreCalculation;
	}
	
	// Set the first value to be what ever is on the screen.
	public void setFistValue(){
		firstValue = calculatorTextView.getDouble();
	}
	
	public double calculate(OperationType type){
		double secondValue = calculatorTextView.getDouble();
		double total;
		
		isPreCalculation = false;
		
		switch (type) {
			case ADDITION:
				total = firstValue + secondValue;
				break;
	
			case SUBTRACTION:
				total = firstValue - secondValue;
				break;
				
			case MULTIPLICATION:
				total = firstValue * secondValue;
				break;
				
			case DIVISION:
				total = firstValue / secondValue;
				break;
				
			default:
				total = 0;
				break;
		}
		
		System.out.println(firstValue + " " + " " +  type + " " + secondValue + ".");
		
		calculatorTextView.resetText();
		calculatorTextView.addText(total + "");
		firstValue = total;
		return total;	
	}

	public void reset() {
		firstValue = 0;
		isPreCalculation = true;	
	}
	
	public void setOperationType(OperationType operationType) {
		this.operationType = operationType;
	}
	
	public OperationType getOperationType() {
		return operationType;
	}
	
	public void postOperation(){
		isPreCalculation = false;
	}
}
