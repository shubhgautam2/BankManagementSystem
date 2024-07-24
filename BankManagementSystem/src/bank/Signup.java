package bank;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

public class Signup extends JFrame implements ActionListener {
	
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
	JTextField tfName,tfFatherName,tfEmail,tfAddress,tfCity,tfPin,tfState;
	JRadioButton rbnMale,rbnFemale,rbnMarried,rbnunmarried,rbnOthers;
	JButton btnNext;
	JDateChooser dateChooser;
	
	Random r =new Random();
	long randNumb=r.nextLong( )%9000+1000;
	String number=""+Math.abs(randNumb);
	
	public Signup() {
		setTitle("New Account Application Form");
		setLayout(null);
		

		l1=new JLabel("Application Form: "+number);
		l1.setFont(new Font("Ralway", Font.BOLD,30));
		l1.setBounds(230, 80, 600, 30);
		add(l1);
		
		l2=new JLabel("Personal Details of Customer");
		l2.setFont(new Font("Arial", Font.BOLD,40));
		l2.setBounds(180, 20, 600, 40);
		add(l2);
		
		
		l3=new JLabel("Your Name:");
		l3.setFont(new Font("Ralway", Font.BOLD,25));
		l3.setBounds(150, 130, 200, 30);
		add(l3);
		
		tfName=new JTextField(25);
		tfName.setFont(new Font("Arial",Font.BOLD,15));
		tfName.setBounds(300, 130, 300, 30);
		add(tfName);
		

		l4=new JLabel("Father Name:");
		l4.setFont(new Font("Ralway", Font.BOLD,25));
		l4.setBounds(150, 180, 200, 30);
		add(l4);
		
		tfFatherName=new JTextField(25);
		tfFatherName.setFont(new Font("Arial",Font.BOLD,15));
		tfFatherName.setBounds(320, 180, 300, 30);
		add(tfFatherName);
		

		l5=new JLabel("Date of Birth:");
		l5.setFont(new Font("Ralway", Font.BOLD,25));
		l5.setBounds(150, 230, 200, 30);
		add(l5);
		
		dateChooser =new JDateChooser();
		dateChooser.setBounds(320,230,200,30);
		add(dateChooser);
		

		l6=new JLabel("Gender:");
		l6.setFont(new Font("Ralway", Font.BOLD,25));
		l6.setBounds(150, 280, 200, 30);
		add(l6);
		
		rbnMale=new JRadioButton("Male");
		rbnMale.setFont(new Font("Arial", Font.BOLD,14));
		rbnMale.setBackground(Color.white);
		rbnMale.setBounds(350,280,100,30);
		add(rbnMale);
		
		rbnFemale=new JRadioButton("Female");
		rbnFemale.setFont(new Font("Arial", Font.BOLD,14));
		rbnFemale.setBackground(Color.white);
		rbnFemale.setBounds(450,280,100,30);
		add(rbnFemale);
		
		ButtonGroup bgGender =new ButtonGroup();
		bgGender.add(rbnMale);
		bgGender.add(rbnFemale);
		

		l7=new JLabel("E Mail:");
		l7.setFont(new Font("Ralway", Font.BOLD,25));
		l7.setBounds(150, 330, 200, 30);
		add(l7);
		
		tfEmail=new JTextField(25);
		tfEmail.setFont(new Font("Arial",Font.BOLD,15));
		tfEmail.setBounds(300, 330, 300, 30);
		add(tfEmail);
		
		l15=new JLabel("Marital status:");
		l15.setFont(new Font("Arial",Font.BOLD,25));
		l15.setBounds(150,370,400,30);
		add(l15);
		
		rbnMarried=new JRadioButton("married");
		rbnMarried.setFont(new Font("Arial",Font.BOLD, 20));
		rbnMarried.setBackground(Color.white);
		rbnMarried.setBounds(340, 370, 100, 30);
		add(rbnMarried);
		
		
		rbnunmarried=new JRadioButton("unmarried");
		rbnunmarried.setFont(new Font("Arial",Font.BOLD, 20));
		rbnunmarried.setBackground(Color.white);
		rbnunmarried.setBounds(450, 370, 200, 30);
		add(rbnunmarried);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(rbnMarried);
		bg.add(rbnunmarried);
		

		l8=new JLabel("Address:");
		l8.setFont(new Font("Ralway", Font.BOLD,25));
		l8.setBounds(150, 410, 200, 30);
		add(l8);
		
		tfAddress=new JTextField(25);
		tfAddress.setFont(new Font("Arial",Font.BOLD,15));
		tfAddress.setBounds(300, 410, 300, 30);
		add(tfAddress);
		

		l9=new JLabel("City:");
		l9.setFont(new Font("Ralway", Font.BOLD,25));
		l9.setBounds(150, 460, 200, 30);
		add(l9);
		
		tfCity=new JTextField(25);
		tfCity.setFont(new Font("Arial",Font.BOLD,15));
		tfCity.setBounds(300, 460, 300, 30);
		add(tfCity);
		
		

		l10=new JLabel("Pin code:");
		l10.setFont(new Font("Ralway", Font.BOLD,25));
		l10.setBounds(150, 510, 200, 30);
		add(l10);
		
		tfPin=new JTextField(25);
		tfPin.setFont(new Font("Arial",Font.BOLD,15));
		tfPin.setBounds(300, 510, 300, 30);
		add(tfPin);
		

		btnNext=new JButton("Next");
		btnNext.setBounds(600, 550, 80, 30);
		btnNext.setBackground(Color.black);
		btnNext.setForeground(Color.white);
		add(btnNext);
		btnNext.addActionListener(this);
		
		
		

		l12=new JLabel("Date:");
		l12.setFont(new Font("Ralway", Font.BOLD,25));
		l12.setBounds(150, 570, 200, 30);
		add(l12);
		

		l13=new JLabel("Month:");
		l13.setFont(new Font("Ralway", Font.BOLD,25));
		l13.setBounds(150, 620, 200, 30);
		add(l13);
		

		l14=new JLabel("Year:");
		l14.setFont(new Font("Ralway", Font.BOLD,25));
		l14.setBounds(150, 660, 200, 30);
		add(l14);
	
	
		getContentPane().setBackground(Color.white);
		setVisible(true);
		setSize(900,800);
		setLocation(400,100);
	}

	public static void main(String[] args) {
       Signup obj=new Signup();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
      String formNum=number;	
      String name= tfName.getText();
      String fname=tfFatherName.getText();
      String dob=((JTextField)dateChooser.getDateEditor().getUiComponent()).getSelectedText();
      String gender = null;
      if(rbnMale.isSelected()) {
    	  gender="Male";
      }
      else if(rbnFemale.isSelected()) {
    	  gender="Female";
      }
      
      String email=tfEmail.getText();
      
      String maritalStatus=null;
      if(rbnMarried.isSelected()) {
    	  maritalStatus="Married";
      }
      else if(rbnunmarried.isSelected()) {
    	  maritalStatus="unmarried";
    		  
      }
      String address=tfAddress.getText();
      String city=tfCity.getText();
      String pincode=tfPin.getText();
      
      try {
    	  if(tfName.getText().equals(""))
    	  {
    		  JOptionPane.showMessageDialog(null,"please Enter yoru age");
    	  }
    	  else {
    		  ConnectionFactory cf=new ConnectionFactory();
    	      String marital;
			String query="insert into signup values('"+formNum+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+maritalStatus+"','"+address+"','"+city+"','"+pincode+"')";
    	    cf.stmt.executeUpdate(query);
    	    
    	    JOptionPane.showMessageDialog(null,"Congrats");
    	    setVisible(false);
    	    new SignupTwo(formNum).setVisible(true);
    	  }
      }
      catch(Exception ex) {
    	ex.printStackTrace();
    	System.out.println(ex.getMessage());
      }
      
      }

}