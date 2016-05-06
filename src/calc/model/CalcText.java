package calc.model;

public class CalcText {
	private String calcString;
	private static CalcText calcText = new CalcText();
	
	private CalcText() {
		calcString = "";
	}
	
	public static CalcText getInstance(){
		return calcText;
	}
	
	public String getCalcString() {
		return calcString;
	}
	
	public void setText(String s) {
		calcString = s;
	}
	
	public void addText(String s) {
		calcString = calcString + s;
	}
	
	public void printText() {
		System.out.println(calcString);
	}
}

