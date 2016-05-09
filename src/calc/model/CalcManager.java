package calc.model;

import java.text.DecimalFormat;

import calc.view.CalculatorTextView;

public class CalcManager {
	// check if the state is pre or post calculation.
	boolean isPostCalculation = false;
	double firstValue;
	OperationType operationType;
	int operationCount;
	
	private static CalcManager instance = new CalcManager();
	CalculatorTextView calculatorTextView = CalculatorTextView.getInstance();
	
	private CalcManager() {
		// TODO Auto-generated constructor stub
	}
	
	public static CalcManager getInstance() {
		return instance;
	}
	
	public boolean isPostCalculation(){
		return isPostCalculation;
	}
	
	// Set the first value to be what ever is on the screen.
	public void setFistValue(){
		firstValue = calculatorTextView.getDouble();
	}
	
	public double calculate(OperationType type){
		DecimalFormat dFormat = new DecimalFormat("#.#######");
		double secondValue = calculatorTextView.getDouble();
		double total;
		
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
		
		isPostCalculation = false;
		calculatorTextView.resetText();
		
		calculatorTextView.addText(dFormat.format(total));
		firstValue = total;
		return total;	
	}

	public void reset() {
		firstValue = 0;
		isPostCalculation = false;
		operationCount = 0;
	}
	
	public void setOperationType(OperationType operationType) {
		this.operationType = operationType;
	}
	
	public OperationType getOperationType() {
		return operationType;
	}
	
	public void incrementCount() {
		operationCount++;
	}
	
	public int getOperationCount() {
		return operationCount;
	}
	
	public void postCalculation(){
		isPostCalculation = true;
	}
}
