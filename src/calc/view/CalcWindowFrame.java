package calc.view;

import java.awt.BorderLayout;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import calc.util.ColorManager;
import calc.util.ColorMode;

/**
 * The window in which the calculator is viewed on.
 * @author Obatola Seward-Evans
 *
 */
public class CalcWindowFrame extends JFrame {

	private static JPanel contentPane;
	private static CalcWindowFrame calcWindowFrame = new CalcWindowFrame();

	/**
	 * Create the frame.
	 */
	private CalcWindowFrame() {
		// unable to resize window.
		setResizable(false);
		
		try {
			UIManager.setLookAndFeel( UIManager.getCrossPlatformLookAndFeelClassName() );
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 230, 397);
		contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
        KeyboardFocusManager manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
        manager.addKeyEventDispatcher(new MyDispatcher());
		
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
	
	/**
	 * Gets key input for the entire app.
	 * @author http://stackoverflow.com/questions/286727/unresponsive-keylistener-for-jframe
	 *
	 */
	 private class MyDispatcher implements KeyEventDispatcher {
	        @Override
	        public boolean dispatchKeyEvent(KeyEvent e) {
	        
	        	// When `Command` + `t` is pressed, change the theme.
	        	if (e.getKeyCode() == KeyEvent.VK_T && e.isMetaDown() && e.getID() == KeyEvent.KEY_PRESSED) {
//	                System.out.println("key pressed");
	                ColorManager.getInstance().alternateTheme();
	                CalcWindowFrame.getInstace().swapPanel(new CalcScreen());
	            }
	        		
	            return false;
	        }
	 }
}
