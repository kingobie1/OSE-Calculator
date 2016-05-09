package calc.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;

/**
 * The window in which the calculator is viewed on.
 * @author ObaSewardEvans
 *
 */
public class CalcWindowFrame extends JFrame {

	private static JPanel contentPane;
	private static CalcWindowFrame calcWindowFrame = new CalcWindowFrame();

	/**
	 * Create the frame.
	 */
	private CalcWindowFrame() {
		
		try {
			UIManager.setLookAndFeel( UIManager.getCrossPlatformLookAndFeelClassName() );
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 237, 400);
		contentPane = new JPanel();
//		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		swapPanel(new CalcScreen());
	}
	
	public static CalcWindowFrame getInstace(){
		return calcWindowFrame;
	}

	public void swapPanel(JPanel panel){
        contentPane = panel;
		this.getContentPane().removeAll();
		this.getContentPane().add( panel );

		validate();
	}

}
