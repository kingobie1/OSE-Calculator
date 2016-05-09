import javax.swing.JFrame;

import calc.view.CalcWindowFrame;


/**
 * Class that starts the calculator application.
 * @author ObaSewardEvans
 *
 */
public class Main {
	static JFrame calcWindowFrame;
	
	public static void main (String[] args){
		// TODO Auto-generated constructor stub
		calcWindowFrame = CalcWindowFrame.getInstace();
		calcWindowFrame.setVisible(true);
	}
}
