package bank;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Signup2 extends JFrame implements ActionListener {

	JLabel lblAdditonal, lblReligion, lblCategory, lblIncome, lblEducation, lblQualification, lblOccupation, lblPan,
			lblAadhar, lblCitizen, lblAccount, lblFormNum, lblFormValue;
	JButton btnNext;
	JRadioButton rbnCitizenYes, rbnCitizenNo, rbnAccountYes, rbnAccountNo;
	JTextField txtPan, txtAadhar, t3;
	JComboBox jcbReligion, jcbCategory, jcbIncome, jcbEducation, jcbOccupation;
	String formno;

	Signup2(String formno) {
		this.formno = formno;
		setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");

		lblAdditonal = new JLabel("Page 2: Additonal Details");
		lblAdditonal.setFont(new Font("Raleway", Font.BOLD, 22));

		lblReligion = new JLabel("Religion:");
		lblReligion.setFont(new Font("Raleway", Font.BOLD, 18));

		lblCategory = new JLabel("Category:");
		lblCategory.setFont(new Font("Raleway", Font.BOLD, 18));

		lblIncome = new JLabel("Income:");
		lblIncome.setFont(new Font("Raleway", Font.BOLD, 18));

		lblEducation = new JLabel("Educational");
		lblEducation.setFont(new Font("Raleway", Font.BOLD, 18));

		lblQualification = new JLabel("Qualification:");
		lblQualification.setFont(new Font("Raleway", Font.BOLD, 18));

		lblOccupation = new JLabel("Occupation:");
		lblOccupation.setFont(new Font("Raleway", Font.BOLD, 18));

		lblPan = new JLabel("PAN Number:");
		lblPan.setFont(new Font("Raleway", Font.BOLD, 18));

		lblAadhar = new JLabel("Aadhar Number:");
		lblAadhar.setFont(new Font("Raleway", Font.BOLD, 18));

		lblCitizen = new JLabel("Senior Citizen:");
		lblCitizen.setFont(new Font("Raleway", Font.BOLD, 18));

		lblAccount = new JLabel("Existing Account:");
		lblAccount.setFont(new Font("Raleway", Font.BOLD, 18));

		lblFormNum = new JLabel("Form No:");
		lblFormNum.setFont(new Font("Raleway", Font.BOLD, 13));

		lblFormValue = new JLabel(formno);
		lblFormValue.setFont(new Font("Raleway", Font.BOLD, 13));

		String religion[] = { "Hindu", "Muslim", "Sikh", "Christian", "Other" };
		jcbReligion = new JComboBox(religion);
		jcbReligion.setBackground(Color.WHITE);
		jcbReligion.setFont(new Font("Raleway", Font.BOLD, 14));

		String category[] = { "General", "OBC", "SC", "ST", "Other" };
		jcbCategory = new JComboBox(category);
		jcbCategory.setBackground(Color.WHITE);
		jcbCategory.setFont(new Font("Raleway", Font.BOLD, 14));

		String income[] = { "Null", "<1,50,000", "<2,50,000", "<5,00,000", "Upto 10,00,000", "Above 10,00,000" };
		jcbIncome = new JComboBox(income);
		jcbIncome.setBackground(Color.WHITE);
		jcbIncome.setFont(new Font("Raleway", Font.BOLD, 14));

		String education[] = { "Non-Graduate", "Graduate", "Post-Graduate", "Doctrate", "Others" };
		jcbEducation = new JComboBox(education);
		jcbEducation.setBackground(Color.WHITE);
		jcbEducation.setFont(new Font("Raleway", Font.BOLD, 14));

		String occupation[] = { "Salaried", "Self-Employmed", "Business", "Student", "Retired", "Others" };
		jcbOccupation = new JComboBox(occupation);
		jcbOccupation.setBackground(Color.WHITE);
		jcbOccupation.setFont(new Font("Raleway", Font.BOLD, 14));

		btnNext = new JButton("Next");
		btnNext.setFont(new Font("Raleway", Font.BOLD, 14));
		btnNext.setBackground(Color.BLACK);
		btnNext.setForeground(Color.WHITE);

		txtPan = new JTextField();
		txtPan.setFont(new Font("Raleway", Font.BOLD, 14));

		txtAadhar = new JTextField();
		txtAadhar.setFont(new Font("Raleway", Font.BOLD, 14));

		rbnCitizenYes = new JRadioButton("Yes");
		rbnCitizenYes.setFont(new Font("Raleway", Font.BOLD, 14));
		rbnCitizenYes.setBackground(Color.WHITE);

		rbnCitizenNo = new JRadioButton("No");
		rbnCitizenNo.setFont(new Font("Raleway", Font.BOLD, 14));
		rbnCitizenNo.setBackground(Color.WHITE);

		rbnAccountYes = new JRadioButton("Yes");
		rbnAccountYes.setFont(new Font("Raleway", Font.BOLD, 14));
		rbnAccountYes.setBackground(Color.WHITE);

		rbnAccountNo = new JRadioButton("No");
		rbnAccountNo.setFont(new Font("Raleway", Font.BOLD, 14));
		rbnAccountNo.setBackground(Color.WHITE);

		setLayout(null);

		lblFormNum.setBounds(700, 10, 60, 30);
		add(lblFormNum);

		lblFormValue.setBounds(760, 10, 60, 30);
		add(lblFormValue);

		lblAdditonal.setBounds(280, 30, 600, 40);
		add(lblAdditonal);

		lblReligion.setBounds(100, 120, 100, 30);
		add(lblReligion);

		jcbReligion.setBounds(350, 120, 320, 30);
		add(jcbReligion);

		lblCategory.setBounds(100, 170, 100, 30);
		add(lblCategory);

		jcbCategory.setBounds(350, 170, 320, 30);
		add(jcbCategory);

		lblIncome.setBounds(100, 220, 100, 30);
		add(lblIncome);

		jcbIncome.setBounds(350, 220, 320, 30);
		add(jcbIncome);

		lblEducation.setBounds(100, 270, 150, 30);
		add(lblEducation);

		jcbEducation.setBounds(350, 270, 320, 30);
		add(jcbEducation);

		lblAccount.setBounds(100, 290, 150, 30);
		add(lblAccount);

		lblQualification.setBounds(100, 340, 150, 30);
		add(lblQualification);

		jcbOccupation.setBounds(350, 340, 320, 30);
		add(jcbOccupation);

		lblOccupation.setBounds(100, 390, 150, 30);
		add(lblOccupation);

		txtPan.setBounds(350, 390, 320, 30);
		add(txtPan);

		lblPan.setBounds(100, 440, 180, 30);
		add(lblPan);

		txtAadhar.setBounds(350, 440, 320, 30);
		add(txtAadhar);

		lblAadhar.setBounds(100, 490, 150, 30);
		add(lblAadhar);

		rbnCitizenYes.setBounds(350, 490, 100, 30);
		add(rbnCitizenYes);

		rbnCitizenNo.setBounds(460, 490, 100, 30);
		add(rbnCitizenNo);

		lblCitizen.setBounds(100, 540, 180, 30);
		add(lblCitizen);

		rbnAccountYes.setBounds(350, 540, 100, 30);
		add(rbnAccountYes);

		rbnAccountNo.setBounds(460, 540, 100, 30);
		add(rbnAccountNo);

		btnNext.setBounds(570, 640, 100, 30);
		add(btnNext);

		btnNext.addActionListener(this);

		getContentPane().setBackground(Color.WHITE);

		setSize(850, 750);
		setLocation(500, 120);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) {
		String religion = (String) jcbReligion.getSelectedItem();
		String category = (String) jcbCategory.getSelectedItem();
		String income = (String) jcbIncome.getSelectedItem();
		String education = (String) jcbEducation.getSelectedItem();
		String occupation = (String) jcbOccupation.getSelectedItem();

		String pan = txtPan.getText();
		String aadhar = txtAadhar.getText();

		String scitizen = "";
		if (rbnCitizenYes.isSelected()) {
			scitizen = "Yes";
		} else if (rbnCitizenNo.isSelected()) {
			scitizen = "No";
		}

		String eaccount = "";
		if (rbnAccountYes.isSelected()) {
			eaccount = "Yes";
		} else if (rbnAccountNo.isSelected()) {
			eaccount = "No";
		}

		try {
			if (txtAadhar.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Fill all the required fields");
			} else {
				Conn c1 = new Conn();
				String q1 = "insert into signup2 values('" + formno + "','" + religion + "','" + category + "','"
						+ income + "','" + education + "','" + occupation + "','" + pan + "','" + aadhar + "','"
						+ scitizen + "','" + eaccount + "')";
				c1.s.executeUpdate(q1);

				// to move to signup3 page and close this page we use

				new Signup3(formno).setVisible(true);
				setVisible(false);
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	public static void main(String[] args) {
		new Signup2("").setVisible(true);
	}
}
