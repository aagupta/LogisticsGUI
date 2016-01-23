import javax.swing.JApplet;
import java.awt.Panel;
import java.awt.Canvas;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GUI2 extends JApplet {
	private JTextField textField;

	/**
	 * Create the applet.
	 */
	public GUI2() {
		getContentPane().setLayout(null);
		
		Panel panel = new Panel();
		panel.setBounds(94, 10, 250, 143);
		getContentPane().add(panel);
		
		Canvas canvas = new Canvas();
		panel.add(canvas);
		
		JLabel lblOptimizedResult = new JLabel("Optimized Result: ");
		lblOptimizedResult.setBounds(66, 216, 127, 16);
		getContentPane().add(lblOptimizedResult);
		
		JTextField textField = new JTextField();
		textField.setBounds(192, 210, 134, 28);
		textField.setEditable(false);
		getContentPane().add(textField);
		textField.setColumns(10);

	}
}
