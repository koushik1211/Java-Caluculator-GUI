package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calc {

	private JFrame frame;
	private JTextField textField;
	 double first;
	 double second;
	 double result;
	 String operation;
	 String ans;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calc window = new calc();
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
	public calc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 296, 373);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 11, 263, 50);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		JButton btnBackspace = new JButton("\uF0E7");
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
             String backspace=null;
             if(textField.getText().length()>0) {
            	 StringBuilder str=new StringBuilder(textField.getText());
            	 str.deleteCharAt(textField.getText().length()-1);
            	 backspace=str.toString();
            	 textField.setText(backspace);
             }
			}
		});
		btnBackspace.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnBackspace.setBounds(10, 72, 67, 49);
		frame.getContentPane().add(btnBackspace);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String num=textField.getText()+btn7.getText()	;
				  textField.setText(num);
			}
		});
		btn7.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn7.setBounds(10, 118, 67, 50);
		frame.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String num=textField.getText()+btn4.getText()	;
				  textField.setText(num);
			}
		});
		btn4.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn4.setBounds(10, 165, 67, 50);
		frame.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			  String num=textField.getText()+btn1.getText()	;
			  textField.setText(num);
			}
		});
		btn1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn1.setBounds(10, 214, 67, 50);
		frame.getContentPane().add(btn1);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String num=textField.getText()+btn0.getText()	;
				  textField.setText(num);
			}
		});
		btn0.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn0.setBounds(10, 263, 67, 50);
		frame.getContentPane().add(btn0);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnClear.setBounds(75, 72, 67, 50);
		frame.getContentPane().add(btnClear);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String num=textField.getText()+btn8.getText()	;
				  textField.setText(num);
			}
		});
		btn8.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn8.setBounds(75, 118, 67, 50);
		frame.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String num=textField.getText()+btn5.getText()	;
				  textField.setText(num);
			}
		});
		btn5.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn5.setBounds(75, 165, 67, 50);
		frame.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String num=textField.getText()+btn2.getText()	;
				  textField.setText(num);
			}
			
		});
		btn2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn2.setBounds(75, 214, 67, 50);
		frame.getContentPane().add(btn2);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String num=textField.getText()+btnDot.getText()	;
				  textField.setText(num);
			}
		});
		btnDot.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnDot.setBounds(75, 263, 67, 50);
		frame.getContentPane().add(btnDot);
		
		JButton btnEuqal = new JButton("=");
		btnEuqal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				second=Double.parseDouble(textField.getText());
				if(operation=="+")
				{
					result=first+second;
					answer =String.format("%.2f", result);
					textField.setText(answer);
				}
				else	if(operation=="-")
				{
					result=first-second;
					answer =String.format("%.2f", result);
					textField.setText(answer);
				}
				else	if(operation=="*")
				{
					result=first*second;
					answer =String.format("%.2f", result);
					textField.setText(answer);
				}
				else	if(operation=="/")
				{
					result=first/second;
					answer =String.format("%.2f", result);
					textField.setText(answer);
				}
				else	if(operation=="%")
				{
					result=first%second;
					answer =String.format("%.2f", result);
					textField.setText(answer);
				}
				
			}
		});
		btnEuqal.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnEuqal.setBounds(140, 263, 67, 50);
		frame.getContentPane().add(btnEuqal);
		
		JButton btnModDiv = new JButton("%");
		btnModDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
				
			}
		});
		btnModDiv.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnModDiv.setBounds(207, 263, 67, 50);
		frame.getContentPane().add(btnModDiv);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String num=textField.getText()+btn3.getText()	;
				  textField.setText(num);
			}
		});
		btn3.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn3.setBounds(140, 214, 67, 50);
		frame.getContentPane().add(btn3);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
				
			}
		});
		btnDiv.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnDiv.setBounds(207, 214, 67, 50);
		frame.getContentPane().add(btnDiv);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String num=textField.getText()+btn6.getText()	;
				  textField.setText(num);
			}
		});
		btn6.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn6.setBounds(140, 165, 67, 50);
		frame.getContentPane().add(btn6);
		
		JButton btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
				
			}
		});
		btnMul.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnMul.setBounds(207, 165, 67, 50);
		frame.getContentPane().add(btnMul);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String num=textField.getText()+btn9.getText()	;
				  textField.setText(num);
			}
		});
		btn9.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn9.setBounds(140, 118, 67, 50);
		frame.getContentPane().add(btn9);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
				
			}
		});
		btnSub.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnSub.setBounds(207, 118, 67, 50);
		frame.getContentPane().add(btnSub);
		
		JButton btn00 = new JButton("00");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String num=textField.getText()+btn00.getText()	;
				  textField.setText(num);
			}
		});
		btn00.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn00.setBounds(140, 72, 67, 50);
		frame.getContentPane().add(btn00);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
				
			}
		});
		btnPlus.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnPlus.setBounds(207, 72, 67, 50);
		frame.getContentPane().add(btnPlus);
	}
}
