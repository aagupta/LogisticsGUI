import javax.swing.JApplet;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.Canvas;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI extends JApplet {
	private JFrame frame = new JFrame();
	private final JPanel panel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Create the applet.
	 */
	public GUI() {
		frame.add(panel);
		getContentPane().setLayout(null);
		panel.setBounds(0, 0, 450, 300);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblDimensionsOfSpace = new JLabel("Length of Space:");
		lblDimensionsOfSpace.setBounds(42, 58, 140, 16);
		panel.add(lblDimensionsOfSpace);
		
		textField = new JTextField();
		textField.setBounds(194, 52, 134, 28);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNumberOfExits = new JLabel("Number of Exits:");
		lblNumberOfExits.setBounds(42, 138, 140, 16);
		panel.add(lblNumberOfExits);
		
		textField_1 = new JTextField();
		textField_1.setBounds(194, 132, 134, 28);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNumberOfObjects = new JLabel("Number of objects: ");
		lblNumberOfObjects.setBounds(42, 178, 125, 16);
		panel.add(lblNumberOfObjects);
		
		textField_2 = new JTextField();
		textField_2.setBounds(194, 172, 134, 28);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnSubmitRequest = new JButton("Submit Request");
		btnSubmitRequest.setBounds(143, 238, 140, 29);
		panel.add(btnSubmitRequest);
		
		JLabel lblWidthOfSpace = new JLabel("Width of Space:");
		lblWidthOfSpace.setBounds(42, 98, 110, 16);
		panel.add(lblWidthOfSpace);
		
		textField_3 = new JTextField();
		textField_3.setBounds(194, 92, 134, 28);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		btnSubmitRequest.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String textFieldValue1 = textField.getText();
				System.out.println(textFieldValue1);
				
				String textFieldValue2 = textField_1.getText();
				System.out.println(textFieldValue2);
				
				String textFieldValue3 = textField_2.getText();
				System.out.println(textFieldValue3);
				
				String textFieldValue4 = textField_3.getText();
				System.out.println(textFieldValue4);
				
				GUI.this.setVisible(false);
				
				getContentPane().setLayout(null);
				
				JPanel panel2 = new JPanel();
				panel.setBounds(86, 6, 275, 212);
				frame.add(panel2);
				
				Canvas canvas = new Canvas();
				canvas.setSize(100,100);
				panel2.add(canvas);
			}
			
		});

		
	}
}
