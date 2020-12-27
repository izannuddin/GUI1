import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class projek {

	private JFrame frame;
	private JTextField textFieldNum1;
	private JTextField textFieldNum2;
	private JTextField textFieldAns;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					projek window = new projek();
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
	public projek() {
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
		
		textFieldNum1 = new JTextField();
		textFieldNum1.setBounds(41, 32, 155, 35);
		frame.getContentPane().add(textFieldNum1);
		textFieldNum1.setColumns(10);
		
		textFieldNum2 = new JTextField();
		textFieldNum2.setBounds(206, 32, 147, 35);
		frame.getContentPane().add(textFieldNum2);
		textFieldNum2.setColumns(10);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int Num1, Num2, Ans;
				try {
					Num1=Integer.parseInt(textFieldNum1.getText());
					Num2=Integer.parseInt(textFieldNum2.getText());
					
					Ans=Num1+Num2;
					textFieldAns.setText(Integer.toString(Ans));
				}catch (Exception e ) {
					JOptionPane.showMessageDialog(null, "please Enter Valid Number");
				}
			}
		});
		btnNewButton.setBounds(41, 78, 155, 40);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Minus");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int Num1, Num2, Ans;
				try {
					Num1=Integer.parseInt(textFieldNum1.getText());
					Num2=Integer.parseInt(textFieldNum2.getText());
					
					Ans=Num1-Num2;
					textFieldAns.setText(Integer.toString(Ans));
				}catch (Exception e ) {
					JOptionPane.showMessageDialog(null, "please Enter Valid Number");
				}
			}
		});
		btnNewButton_1.setBounds(206, 78, 147, 40);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Multiply");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int Num1, Num2, Ans;
				try {
					Num1=Integer.parseInt(textFieldNum1.getText());
					Num2=Integer.parseInt(textFieldNum2.getText());
					
					Ans=Num1*Num2;
					textFieldAns.setText(Integer.toString(Ans));
				}catch (Exception e ) {
					JOptionPane.showMessageDialog(null, "please Enter Valid Number");
				}
				
			}
		});
		btnNewButton_2.setBounds(41, 129, 155, 35);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Divide");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int Num1, Num2, Ans;
				try {
					Num1=Integer.parseInt(textFieldNum1.getText());
					Num2=Integer.parseInt(textFieldNum2.getText());
					
					Ans=Num1/Num2;
					textFieldAns.setText(Integer.toString(Ans));
				}catch (Exception e ) {
					JOptionPane.showMessageDialog(null, "please Enter Valid Number");
				}
			}
		});
		btnNewButton_3.setBounds(206, 135, 147, 29);
		frame.getContentPane().add(btnNewButton_3);
		
		JLabel lblNewLabel = new JLabel("The Answer is");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setBounds(41, 185, 155, 35);
		frame.getContentPane().add(lblNewLabel);
		
		textFieldAns = new JTextField();
		textFieldAns.setBounds(206, 188, 147, 28);
		frame.getContentPane().add(textFieldAns);
		textFieldAns.setColumns(10);
	}

}
