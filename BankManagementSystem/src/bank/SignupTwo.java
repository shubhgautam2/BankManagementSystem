package bank;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;
public class SignupTwo extends JFrame implements ActionListener{
	JLabel lblAdditional,lblReligion, lblCategory,lblIncome,lblEducation,lblQualification,lblOccupation,lblPan,lblAadhar,lblCitizen,lblAccount,lblFormNum,lblFormValue;
	JTextField tfPan,tfAadhar;
	JRadioButton rbnCitizenYes,rbnCitizenNo,rbnAccountYes,rbnAccountNo;
	JComboBox jcbReligion,jcbCategory,jcbIncome,jcbEducation,jcbOccupation;
	JButton	btnNext;
	String formno;
	
	public SignupTwo(String formno) {
		this.formno=formno;
		setTitle("New Account Application Form - Page 2 ");	
		setLayout(null);
		
		
		lblAdditional=new JLabel("Additional Details Of Customer");
		lblAdditional.setFont(new Font("Tahoma", Font.BOLD,25));
		lblAdditional.setBounds(180, 20, 600, 40);
		add(lblAdditional);
		
		lblReligion=new JLabel("Religion :");
		Font f=new Font("Arial",Font.BOLD,20);
		lblReligion.setFont(f);
		lblReligion.setBounds(100,75,200,30);
		add(lblReligion);
		
		String[] religion= {"Enter Your Religion","Hindu","Muslim","Sikh","Christian","Others"};
		jcbReligion=new JComboBox(religion);
		jcbReligion.setBackground(Color.WHITE);
		jcbReligion.setFont(new Font("Arial",Font.BOLD,16));
		jcbReligion.setBounds(310,75,210,25);
		add(jcbReligion); 
		
		lblIncome=new JLabel("Income :");
		lblIncome.setFont(f);
		lblIncome.setBounds(100,115,200,30);
		add(lblIncome);
		
		String[] income= {"Enter Your Income","Null","<1,00,000","<2,50,000","5,00,000","10,00,000"};
		jcbIncome=new JComboBox(income);
		jcbIncome.setBackground(Color.WHITE);
		jcbIncome.setFont(new Font("Arial",Font.BOLD,16));
		jcbIncome.setBounds(310,115,210,25);
		add(jcbIncome); 
		
		lblCategory=new JLabel("Category :");
		lblCategory.setFont(f);
		lblCategory.setBounds(100,155,200,30);
		add(lblCategory);
		
		String[] category= {"Enter Your Category","SC","ST","OBC","General","Others"};
		jcbCategory=new JComboBox(category);
		jcbCategory.setBackground(Color.WHITE);
		jcbCategory.setFont(new Font("Arial",Font.BOLD,16));
		jcbCategory.setBounds(310,155,210,25);
		add(jcbCategory); 
		
		lblAccount=new JLabel("Account :");
		lblAccount.setFont(f);
		lblAccount.setBounds(100,195,200,30);
		add(lblAccount);
		
		rbnAccountYes=new JRadioButton("Yes");
		rbnAccountYes.setFont(new Font("Arial",Font.BOLD,16));
		rbnAccountYes.setBackground(Color.white);
		rbnAccountYes.setBounds(310, 195, 100, 20);
		add(rbnAccountYes);
		
		rbnAccountNo=new JRadioButton("NO");
		rbnAccountNo.setFont(new Font("Arial",Font.BOLD,16));
		rbnAccountNo.setBackground(Color.white);
		rbnAccountNo.setBounds(420, 195, 100, 20);
		add(rbnAccountNo);
		
		ButtonGroup bgAccount=new ButtonGroup();
		bgAccount.add(rbnAccountYes);
		bgAccount.add(rbnAccountNo);
		
		
		lblCitizen=new JLabel("Citizen Of India:");
		lblCitizen.setFont(f);
		lblCitizen.setBounds(100,235,200,30);
		add(lblCitizen);
		
		rbnCitizenYes=new JRadioButton("Yes");
		rbnCitizenYes.setFont(new Font("Arial",Font.BOLD,16));
		rbnCitizenYes.setBackground(Color.white);
		rbnCitizenYes.setBounds(310, 235, 100, 20);
		add(rbnCitizenYes);
		
		rbnCitizenNo=new JRadioButton("NO");
		rbnCitizenNo.setFont(new Font("Arial",Font.BOLD,16));
		rbnCitizenNo.setBackground(Color.white);
		rbnCitizenNo.setBounds(420, 235, 100, 20);
		add(rbnCitizenNo);
		
		ButtonGroup bgCitizen=new ButtonGroup();
		bgCitizen.add(rbnCitizenYes);
		bgCitizen.add(rbnCitizenNo);
		
		lblEducation=new JLabel("Educational");
		lblEducation.setFont(f);
		lblEducation.setBounds(100,275,200,30);
		add(lblEducation);
	
		lblQualification=new JLabel("Qualification :");
		lblQualification.setFont(f);
		lblQualification.setBounds(100,300,200,30);
		add(lblQualification);
		
		String[] education= {"Enter Your Qualification","B.Tech"};
		jcbEducation=new JComboBox(education);
		jcbEducation.setBackground(Color.WHITE);
		jcbEducation.setFont(new Font("Arial",Font.BOLD,16));
		jcbEducation.setBounds(310,300,210,25);
		add(jcbEducation); 
		
		lblOccupation=new JLabel("Occupation :");
		lblOccupation.setFont(f);
		lblOccupation.setBounds(100,340,200,30);
		add(lblOccupation);
		
		String[] occupation= {"Enter Your Occupation","Other"};
		jcbOccupation=new JComboBox(occupation);
		jcbOccupation.setBackground(Color.WHITE);
		jcbOccupation.setFont(new Font("Arial",Font.BOLD,16));
		jcbOccupation.setBounds(310,340,210,25);
		add(jcbOccupation);
		
		lblPan=new JLabel("Pan :");
		lblPan.setFont(f);
		lblPan.setBounds(100,380,200,30);
		add(lblPan);
		
		tfPan=new JTextField(15);
		tfPan.setFont(new Font("Arial", Font.BOLD,16));
		tfPan.setBounds(310, 380, 200, 25);
		add(tfPan);
		
		lblAadhar=new JLabel("Aadhar :");
		lblAadhar.setFont(f);
		lblAadhar.setBounds(100,420,200,30);
		add(lblAadhar);
		
		tfAadhar=new JTextField(15);
		tfAadhar.setFont(new Font("Arial", Font.BOLD,16));
		tfAadhar.setBounds(310, 420, 200, 25);
		add(tfAadhar);
		
		btnNext=new JButton("Next");
		btnNext.setBackground(Color.black);
		btnNext.setForeground(Color.white);
		btnNext.setBounds(500, 490, 100, 25);
		add(btnNext);
		btnNext.addActionListener(this);
		
		getContentPane().setBackground(Color.white);
		setVisible(true);
		setSize(800,700);
		setLocation(400,100);
	}
	public static void main(String[] args) {
		SignupTwo obj=new SignupTwo("");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String religion=(String)jcbReligion.getSelectedItem();
		String category=(String)jcbCategory.getSelectedItem();
		String income=(String)jcbIncome.getSelectedItem();
		String education=(String)jcbEducation.getSelectedItem();
		String occupation=(String)jcbOccupation.getSelectedItem();
		String pan=tfPan.getText();
		String aadhar=tfAadhar.getText();
		String scitizen="";
		if(rbnCitizenYes.isSelected()) {
			scitizen="Yes";
		}
		else if(rbnCitizenNo.isSelected()){
			scitizen="No";	
		}
		String eaccount="";
		if(rbnAccountYes.isSelected()){
			eaccount="Yes";
		}
		else if(rbnAccountNo.isSelected()) {
			eaccount="No";
		}
		try {
			ConnectionFactory cf=new ConnectionFactory();
			String query="insert into signuptwo values('"+formno+"','"+religion+"','"+category+"','"+income+"','"+education+"','"+occupation+"','"+pan+"','"+aadhar+"','"+scitizen+"','"+eaccount+"')";
			cf.stmt.executeUpdate(query);
			JOptionPane.showMessageDialog(null,"Congrats");
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
}
