package bank;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener{
	// Instance variable
	JLabel l1, l2, l3;
	JTextField tf1;
	JPasswordField pf1;
	JButton btnLogin, btnClear, btnSignup;

	// Non-Parameterized Constructor
	public Login() {
		setTitle("Bank Management System");
		setLayout(null);

		l1 = new JLabel("Welcome To Bank System");
		l1.setFont(new Font("Arial", Font.BOLD, 35));
		l1.setBounds(200, 40, 530, 40);
		add(l1);

		l2 = new JLabel("Enter Card No:");
		l2.setFont(new Font("Tahoma", Font.BOLD, 25));
		l2.setBounds(120, 150, 400, 30);
		add(l2);

		l3 = new JLabel("Enter Password:");
		l3.setFont(new Font("Tahoma", Font.BOLD, 25));
		l3.setBounds(120, 210, 400, 30);
		add(l3);

		tf1 = new JTextField(20);
		tf1.setBounds(340, 150, 230, 30);
		tf1.setFont(new Font("Tahoma", Font.BOLD, 15));
		add(tf1);

		pf1 = new JPasswordField(20);
		pf1.setBounds(340, 210, 230, 30);
		pf1.setFont(new Font("Tahoma", Font.BOLD, 15));
		add(pf1);

		btnLogin = new JButton("LOGIN");
		btnLogin.setBackground(Color.black);
		btnLogin.setForeground(Color.white);
		btnLogin.setBounds(200, 250, 100, 20);
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 15));
		add(btnLogin);

		
		btnClear=new JButton("CLEAR");
		btnClear.setBackground(Color.black);
		btnClear.setForeground(Color.white);
		btnClear.setBounds(310,250,100,20);
		btnClear.setFont(new Font("Tahoma",Font.BOLD,15));
		add(btnClear);
		 

		btnSignup = new JButton("SIGN UP");
		btnSignup.setBackground(Color.black);
		btnSignup.setForeground(Color.white);
		btnSignup.setBounds(420, 250, 100, 20);
		btnSignup.setFont(new Font("Tahoma", Font.BOLD, 15));
		add(btnSignup);
		
		btnLogin.addActionListener(this);
		btnSignup.addActionListener(this);
		btnClear.addActionListener(this);
		

		getContentPane().setBackground(Color.white);
		setVisible(true);
		setSize(800, 500);
		setLocation(400, 200);
	}

	public static void main(String[] args) {
		Login obj = new Login();
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		try {
			if(ae.getSource()==btnLogin){				
			}
			else if(ae.getSource()==btnClear){
				tf1.setText("");
				pf1.setText("");
			}
			else if(ae.getSource()==btnSignup){
				this.setVisible(false);
				new Signup();
			}
		}
		catch(Exception e){
			
		}
	}
}