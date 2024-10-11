package bank;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import bank.Conn;
import bank.Transactions;

import java.util.Date;
import java.sql.*;

public class Withdrawl extends JFrame implements ActionListener {
	// instance variable
	JTextField tf1, tf2;
	JButton b1, b2, b3;
	JLabel l1, l2, l3, l4;
	String pin;

	// param Constructor
	Withdrawl(String pin) {
		this.pin = pin;

		setLayout(null);

		setSize(960, 1080);
		// setUndecorated(true);
		setLocation(150, 0);
		setVisible(true);
		// .setUndecorated(true);

		/*
		 * getSystemResource() method find a resource of the specified name from the
		 * search path used to load classes.
		 */
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/atm.jpg"));
		Image i2 = i1.getImage().getScaledInstance(1000, 1180, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		l3 = new JLabel(i3);
		// setBounds(int x-coordinate, int y-coordinate, int width, int height)
		l3.setBounds(0, -180, 960, 1080);
		add(l3);

		l1 = new JLabel("MAXIMUM WITHDRAWAL IS RS.10,000");
		l1.setForeground(Color.WHITE);
		l1.setFont(new Font("System", Font.BOLD, 16));
		l1.setBounds(190, 350, 400, 20);
		l3.add(l1);

		l2 = new JLabel("PLEASE ENTER YOUR AMOUNT");
		l2.setForeground(Color.WHITE);
		l2.setFont(new Font("System", Font.BOLD, 16));
		l2.setBounds(190, 400, 400, 20);
		l3.add(l2);

		tf1 = new JTextField();
		tf1.setFont(new Font("Raleway", Font.BOLD, 25));
		tf1.setBounds(190, 450, 330, 30);
		l3.add(tf1);
		b1 = new JButton("WITHDRAW");
		b2 = new JButton("BACK");

		b1.setBounds(390, 588, 150, 35);
		l3.add(b1);
		b2.setBounds(390, 633, 150, 35);
		l3.add(b2);

		b1.addActionListener(this);
		b2.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ae) {
		try {
			String amount = tf1.getText();
			Date date = new Date();
			if (ae.getSource() == b1) {
				if (tf1.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter the Amount to you want to Withdraw");
				} else {
					Conn c1 = new Conn();

					ResultSet rs = c1.s.executeQuery("select * from bank where pin = '" + pin + "'");
					int balance = 0;
					while (rs.next()) {
						if (rs.getString("type").equals("Deposit")) {
							balance += Integer.parseInt(rs.getString("amount"));
						} else {
							balance -= Integer.parseInt(rs.getString("amount"));
						}
					}
					if (balance < Integer.parseInt(amount)) {
						JOptionPane.showMessageDialog(null, "Insuffient Balance");
						return;
					}
					c1.s.executeUpdate(
							"insert into bank values('" + pin + "', '" + date + "', 'Withdrawl', '" + amount + "')");
					JOptionPane.showMessageDialog(null, "Rs. " + amount + " Debited Successfully");
					setVisible(false);
					new Transactions(pin).setVisible(true);
				}
			} else if (ae.getSource() == b2) {
				setVisible(false);
				new Transactions(pin).setVisible(true);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error: " + e);
		}
	}

	public static void main(String[] args) {
		new Withdrawl("").setVisible(true);
	}
}
