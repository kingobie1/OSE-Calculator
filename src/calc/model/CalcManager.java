package calc.model;

import java.text.DecimalFormat;

import calc.view.CalculatorTextView;

/**
 * Handles all calculatoions.
 * is a singleton.
 * @author ObaSewardEvans
 *
 */
public class CalcManager {
	
	boolean isPostCalculation = false; // check if the state is pre or post calculation.
	double firstValue; // the first value in the calculation.
	OperationType operationType; // operationType for calculation.
	int operationCount; // count of the amount of operation presses.
	
	private static CalcManager instance = new CalcManager();
	CalculatorTextView calculatorTextView = CalculatorTextView.getInstance();
	
	private CalcManager() { }
	
	/**
	 * get instance of calcManager.
	 * @return instance
	 */
	public static CalcManager getInstance() {
		return instance;
	}
	
	/**
	 * check if the calculation button has been pressed yet.
	 * used when trying to make a calculation from a calculation.
	 * @return isPostCalculation
	 */
	public boolean isPostCalculation(){
		return isPostCalculation;
	}
	
	/**
	 * Set the first value to be what ever is on the screen.
	 */
	public void setFistValue(){
		firstValue = calculatorTextView.getDouble();
	}
	
	/**
	 * make calculation based off of the given operation type.
	 * @param type - the type of calculation to be made.
	 * @return total - the calculated value.
	 */
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

	/**
	 * reset calculation state.
	 */
	public void reset() {
		firstValue = 0;
		isPostCalculation = false;
		operationCount = 0;
	}
	
	/**
	 * set the type of operation to be calculated.
	 * @param operationType
	 */
	public void setOperationType(OperationType operationType) {
		this.operationType = operationType;
	}
	
	/**
	 * get the current operation type.
	 * @return operationType
	 */
	public OperationType getOperationType() {
		return operationType;
	}
	
	/**
	 * increase the operation count by 1.
	 */
	public void incrementCount() {
		operationCount++;
	}
	
	/**
	 * get the current operation count.
	 */
	public int getOperationCount() {
		return operationCount;
	}
	
	/**
	 * tell the manager that a calculation has been from the calculate button.
	 */
	public void postCalculation(){
		isPostCalculation = true;
	}
}
