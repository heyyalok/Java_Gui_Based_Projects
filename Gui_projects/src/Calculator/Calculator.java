package Calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator {

	private JFrame frmCalculator;
	private JTextField textField;
	double first;
	double second;
	double result;
	String operation;
	String ans;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setTitle("Calculator");
		frmCalculator.setAlwaysOnTop(true);
		frmCalculator.setBounds(100, 100, 352, 370);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 25));
		textField.setBounds(10, 10, 314, 42);
		frmCalculator.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnBackspace = new JButton(" \uF0E7 ");// used this unicode for button icon present on backspace button
		btnBackspace.setFont(new Font("Wingdings", Font.BOLD, 25));
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace = null;
				if (textField.getText().length()>0)
				{
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace= str.toString();
					textField.setText(backSpace);
				}
			}
		});
		btnBackspace.setBounds(10, 62, 76, 53);
		frmCalculator.getContentPane().add(btnBackspace);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn7.setBounds(10, 114, 76, 53);
		frmCalculator.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn4.setBounds(10, 167, 76, 53);
		frmCalculator.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn1.getText();
				textField.setText(number);
				
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn1.setBounds(10, 221, 76, 53);
		frmCalculator.getContentPane().add(btn1);
		
		JButton btnZero = new JButton("0");
		btnZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnZero.getText();
				textField.setText(number);
			}
		});
		btnZero.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnZero.setBounds(10, 274, 76, 53);
		frmCalculator.getContentPane().add(btnZero);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnDot.getText();
				textField.setText(number);
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnDot.setBounds(88, 274, 76, 53);
		frmCalculator.getContentPane().add(btnDot);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second= Double.parseDouble(textField.getText());
				if (operation == "+")
				{
					result = first+second;
					answer = String.format("%.2f",result);
					textField.setText(answer);
				}
				else if (operation == "-") 
				{
					result = first-second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if (operation == "*") 
				{
					result = first*second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if (operation == "/") 
				{
					result = first/second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnEqual.setBounds(166, 274, 76, 53);
		frmCalculator.getContentPane().add(btnEqual);
		
		JButton btnPercentage = new JButton("%");
		btnPercentage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "%";
			}
		});
		btnPercentage.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnPercentage.setBounds(248, 274, 76, 53);
		frmCalculator.getContentPane().add(btnPercentage);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn2.setBounds(88, 221, 76, 53);
		frmCalculator.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn3.setBounds(166, 221, 76, 53);
		frmCalculator.getContentPane().add(btn3);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "/";
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnDiv.setBounds(248, 221, 76, 53);
		frmCalculator.getContentPane().add(btnDiv);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn5.setBounds(88, 167, 76, 53);
		frmCalculator.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn6.setBounds(166, 167, 76, 53);
		frmCalculator.getContentPane().add(btn6);
		
		JButton btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "*";
			}
		});
		btnMul.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnMul.setBounds(248, 167, 76, 53);
		frmCalculator.getContentPane().add(btnMul);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn8.setBounds(88, 114, 76, 53);
		frmCalculator.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn9.setBounds(166, 114, 76, 53);
		frmCalculator.getContentPane().add(btn9);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "-";
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnSub.setBounds(248, 114, 76, 53);
		frmCalculator.getContentPane().add(btnSub);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnClear.setBounds(88, 62, 76, 53);
		frmCalculator.getContentPane().add(btnClear);
		
		JButton btnDoublezero = new JButton("00");
		btnDoublezero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnDoublezero.getText();
				textField.setText(number);
			}
		});
		btnDoublezero.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnDoublezero.setBounds(166, 62, 76, 53);
		frmCalculator.getContentPane().add(btnDoublezero);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "+";
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnPlus.setBounds(248, 62, 76, 53);
		frmCalculator.getContentPane().add(btnPlus);
	}
}