package main;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Frame {
	
	static int convertNegative(int a) {
		a = a*-1;
		return a;
	}
	
	//Combines 2 Integer Values
	static int combine(int a, int b, int c) 
    { 
		String s1 = Integer.toString(a); 
		String s2 = Integer.toString(b); 
  
		String s = s1 + s2; 
  
		return c = Integer.parseInt(s);
    }
	
	int i = 0;
	
	//Adds a number onto the calculator
	static int addNumber(int a, int b, int c) {
		int i = 0;
		if(o==1) {
			if (b == -2147483646 ) { //Null Value = -2147483646
				b = a;
			}else {
				b = combine(b, a, b);
				i = b;
			}
		}else {
			if (c == -2147483646) {
				c = a;
			}else {
				c = combine(c, a, c);
				i = c;
			}
		}
		return i;
	}
	
	//Adds a symbol onto the calculator
	static void addSymbol(String a) {
		if(o==1) {
			s = a;
			o = 2;
			n2 = 0;
		} else {
			o = 1;
			n1 = -2147483646;
			n2 = -2147483646;
			s = ""; //Clears everything to avoid crashing.
		}
	}
	
	static int solve(int a, String b, int c) {
		
		int d = 0;
		if(b == "+") {
			d = a + c;
		}
		if (b == "-") {
			d = a - c;
		}
		if (b == "/") {
			d = a / c;
		}
		if (b == "x") {
			d = a * c;
		}
		return d;
	}
	
	//Initialising Variables
	static String equation = "";
	static int n1 = 0;
	static int n2 = -2147483646;
	static String s = "";
	static int o = 1;
	
	//Buttons
	private static final JButton btnNewButton = new JButton("1");
	private static final JButton btnNewButton_1 = new JButton("2");
	private static final JButton btnNewButton_2 = new JButton("3");
	private static final JButton btnNewButton_2_1 = new JButton("4");
	private static final JButton btnNewButton_2_2 = new JButton("5");
	private static final JButton btnNewButton_2_3 = new JButton("6");
	private static final JButton btnNewButton_2_4 = new JButton("7");
	private static final JButton btnNewButton_2_5 = new JButton("8");
	private static final JButton btnNewButton_2_6 = new JButton("9");
	private static final JButton btnNewButton_2_7 = new JButton("+");
	private static final JButton btnNewButton_2_7_1 = new JButton("-");
	private static final JButton btnNewButton_2_7_2 = new JButton("x");
	private static final JButton btnNewButton_2_7_3 = new JButton("\u00F7");
	private static final JButton btnNewButton_2_7_4 = new JButton("=");
	private static final JButton btnNewButton_3 = new JButton("0");
	private static final JButton btnNewButton_2_4_1 = new JButton("Clear");
	private static final JLabel lblNewLabel = new JLabel("Label");
	private static final JButton btnNewButton_2_7_5 = new JButton("+/-");

	public static void main(String[] args) {
		
		//More variable initialisation.
		String n1s = "";
		String n2s = "";
		
		//Making the JFrame
		JFrame frame = new JFrame();
		frame.getContentPane().setLayout(null);
		frame.setSize(470,530);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Button Events.. Lots of them
			//Numbers
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(o==1) {
					n1 = addNumber(1, n1, n2);
				} else {
					n2 = addNumber(1, n1, n2);
				}
			}
		});
		btnNewButton.setBounds(10, 130, 100, 100);
		
		frame.getContentPane().add(btnNewButton);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(o==1) {
					n1 = addNumber(2, n1, n2);
				}
				if(o==2){
					n2 = addNumber(2, n1, n2);
				}
			}
		});
		btnNewButton_1.setBounds(120, 130, 100, 100);
		
		frame.getContentPane().add(btnNewButton_1);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(o==1) {
					n1 = addNumber(3, n1, n2);
				} else {
					n2 = addNumber(3, n1, n2);
				}
			}
		});
		btnNewButton_2.setBounds(230, 130, 100, 100);
		
		frame.getContentPane().add(btnNewButton_2);
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(o==1) {
					n1 = addNumber(4, n1, n2);
				} else {
					n2 = addNumber(4, n1, n2);
				}
			}
		});
		btnNewButton_2_1.setBounds(10, 241, 100, 100);
		
		frame.getContentPane().add(btnNewButton_2_1);
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(o==1) {
					n1 = addNumber(5, n1, n2);
				} else {
					n2 = addNumber(5, n1, n2);
				}
			}
		});
		btnNewButton_2_2.setBounds(120, 241, 100, 100);
		
		frame.getContentPane().add(btnNewButton_2_2);
		btnNewButton_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(o==1) {
					n1 = addNumber(6, n1, n2);
				} else {
					n2 = addNumber(6, n1, n2);
				}
			}
		});
		btnNewButton_2_3.setBounds(230, 241, 100, 100);
		
		frame.getContentPane().add(btnNewButton_2_3);
		btnNewButton_2_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(o==1) {
					n1 = addNumber(7, n1, n2);
				} else {
					n2 = addNumber(7, n1, n2);
				}
			}
		});
		btnNewButton_2_4.setBounds(10, 352, 100, 100);
		
		frame.getContentPane().add(btnNewButton_2_4);
		btnNewButton_2_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(o==1) {
					n1 = addNumber(8, n1, n2);
				} else {
					n2 = addNumber(8, n1, n2);
				}
			}
		});
		btnNewButton_2_5.setBounds(120, 352, 100, 100);
		
		frame.getContentPane().add(btnNewButton_2_5);
		btnNewButton_2_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(o==1) {
					n1 = addNumber(9, n1, n2);
				} else {
					n2 = addNumber(9, n1, n2);
				}
			}
		});
		btnNewButton_2_6.setBounds(230, 352, 100, 100);
		
			//Symbols
		
		frame.getContentPane().add(btnNewButton_2_6);
		btnNewButton_2_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addSymbol("+");
			}
		});
		btnNewButton_2_7.setBounds(340, 130, 50, 50);
		
		frame.getContentPane().add(btnNewButton_2_7);
		btnNewButton_2_7_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addSymbol("-");
			}
		});
		btnNewButton_2_7_1.setBounds(340, 191, 50, 50);
		
		frame.getContentPane().add(btnNewButton_2_7_1);
		btnNewButton_2_7_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addSymbol("x");
			}
		});
		btnNewButton_2_7_2.setBounds(340, 252, 50, 50);
		
		frame.getContentPane().add(btnNewButton_2_7_2);
		btnNewButton_2_7_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addSymbol("/");
			}
		});
		btnNewButton_2_7_3.setBounds(340, 313, 50, 50);
		
		frame.getContentPane().add(btnNewButton_2_7_3);
		btnNewButton_2_7_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int solved = 0;
				solved = solve(n1, s, n2);
				n1 = solved;
				n2 = -2147483646;
				s = "";
				o = 1;
			}
		});
		btnNewButton_2_7_4.setBounds(340, 374, 84, 78);
		
		frame.getContentPane().add(btnNewButton_2_7_4);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(o==1) {
					n1 = addNumber(0, n1, n2);
				} else {
					n2 = addNumber(0, n1, n2);
				}
			}
		});
		btnNewButton_3.setBounds(10, 19, 100, 100);
		
			//Clearing
		
		frame.getContentPane().add(btnNewButton_3);
		btnNewButton_2_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1 = 0; //Set to 0 to avoid first click setting to 0.
				n2 = -2147483646;
				s = "";
				o = 1;
			}
		});
		btnNewButton_2_4_1.setBounds(0, 468, 100, 23);
		
		//Shows the text on the display
		
		lblNewLabel.setText(String.valueOf(equation));
		
		frame.getContentPane().add(btnNewButton_2_4_1);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lblNewLabel.setBounds(120, 19, 270, 100);
		
		frame.getContentPane().add(lblNewLabel);
		btnNewButton_2_7_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (o == 1) {
					n1 = convertNegative(n1);
				} else {
					n2 = convertNegative(n2);
				}
			}
		});
		btnNewButton_2_7_5.setBounds(400, 313, 50, 50);
		
		frame.getContentPane().add(btnNewButton_2_7_5);
		
		frame.setVisible(true);
		
		//Converting numbers to put on display properly.
		
		for(;;) {
			if(n1 != -2147483646) {
				n1s = Integer.toString(n1);
			}else {
				n1s = "";
			}
			if(n2 != -2147483646) {
				n2s = Integer.toString(n2);
			}else {
				n2s = "";
			}
			equation = n1s + s + n2s;
			lblNewLabel.setText(equation);
		}
		
		
	}
}
