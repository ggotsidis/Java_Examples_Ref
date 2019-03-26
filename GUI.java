package referenceAll;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class GUI {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(94, 39, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		//ENTER (ASCII) key makes an action
		textField.addKeyListener(new KeyAdapter() {
	            @Override
	            public void keyPressed(KeyEvent arg0) {
	                System.out.println(arg0.getKeyCode());
	                if(arg0.getKeyCode()==10) {
	                    String name = textField.getText();
	                    JOptionPane.showMessageDialog(null, name);
	                    //xromatise kai to background
	                    frame.getContentPane().setBackground(Color.BLUE);
	                }
	            }
	        });
		 
	}
}
