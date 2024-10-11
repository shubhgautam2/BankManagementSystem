package BankManagement;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Signup2 extends JFrame implements ActionListener{
    
    JLabel lblAdditonal,lblReligion,lblCategory,lblIncome,lblEducation,lblQualification,lblOccupation,lblPan,lblAadhar,lblCitizen,lblAccount,lblFormNum,lblFormValue;
    JButton btnNext;
    JRadioButton rbnCitizenYes,rbnCitizenNo,rbnAccountYes,rbnAccountNo;
    JTextField txtPan,txtAadhar,t3;
    JComboBox jcbReligion,jcbCategory,jcbIncome,jcbEducation,jcbOccupation;
    String formno;

    Signup2(String formno){
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

        String religion[] = {"Hindu","Muslim","Sikh","Christian","Other"};
        jcbReligion = new JComboBox(religion);
        jcbReligion.setBackground(Color.WHITE);
        jcbReligion.setFont(new Font("Raleway", Font.BOLD, 14));
        
        
        String category[] = {"General","OBC","SC","ST","Other"};
        jcbCategory = new JComboBox(category);
        jcbCategory.setBackground(Color.WHITE);
        jcbCategory.setFont(new Font("Raleway", Font.BOLD, 14));
        

        String income[] = {"Null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000","Above 10,00,000"};
        jcbIncome = new JComboBox(income);
        jcbIncome.setBackground(Color.WHITE);
        jcbIncome.setFont(new Font("Raleway", Font.BOLD, 14));

        String education[] = {"Non-Graduate","Graduate","Post-Graduate","Doctrate","Others"};
        jcbEducation=new JComboBox(education);
        jcbEducation.setBackground(Color.WHITE);
        jcbEducation.setFont(new Font("Raleway", Font.BOLD, 14));
       

        String occupation[] = {"Salaried","Self-Employmed","Business","Student","Retired","Others"};
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
        
        l12.setBounds(700,10,60,30);
        add(l12);
        
        l13.setBounds(760,10,60,30);
        add(l13);
        
        l1.setBounds(280,30,600,40);
        add(l1);
        
        l2.setBounds(100,120,100,30);
        add(l2);
        
        c1.setBounds(350,120,320,30);
        add(c1);
        
        l3.setBounds(100,170,100,30);
        add(l3);
        
        c2.setBounds(350,170,320,30);
        add(c2);
        
        l4.setBounds(100,220,100,30);
        add(l4);
        
        c3.setBounds(350,220,320,30);
        add(c3);
        
        l5.setBounds(100,270,150,30);
        add(l5);
        
        c4.setBounds(350,270,320,30);
        add(c4);
        
        l11.setBounds(100,290,150,30);
        add(l11);
        
        l6.setBounds(100,340,150,30);
        add(l6);
        
        c5.setBounds(350,340,320,30);
        add(c5);
        
        l7.setBounds(100,390,150,30);
        add(l7);
        
        t1.setBounds(350,390,320,30);
        add(t1);
        
        l8.setBounds(100,440,180,30);
        add(l8);
        
        t2.setBounds(350,440,320,30);
        add(t2);
        
        l9.setBounds(100,490,150,30);
        add(l9);
        
        r1.setBounds(350,490,100,30);
        add(r1);
        
        r2.setBounds(460,490,100,30);
        add(r2);
        
        l10.setBounds(100,540,180,30);
        add(l10);
        
        r3.setBounds(350,540,100,30);
        add(r3);
        
        r4.setBounds(460,540,100,30);
        add(r4);
        
        b.setBounds(570,640,100,30);
        add(b);
        
        b.addActionListener(this);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,750);
        setLocation(500,120);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        String religion = (String)c1.getSelectedItem(); 
        String category = (String)c2.getSelectedItem();
        String income = (String)c3.getSelectedItem();
        String education = (String)c4.getSelectedItem();
        String occupation = (String)c5.getSelectedItem();
        
        String pan = t1.getText();
        String aadhar = t2.getText();
        
        String scitizen = "";
        if(r1.isSelected()){ 
            scitizen = "Yes";
        }
        else if(r2.isSelected()){ 
            scitizen = "No";
        }
           
        String eaccount = "";
        if(r3.isSelected()){ 
            eaccount = "Yes";
        }else if(r4.isSelected()){ 
            eaccount = "No";
        }
        
        try{
            if(t2.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Fill all the required fields");
            }else{
                Conn c1 = new Conn();
                String q1 = "insert into signup2 values('"+formno+"','"+religion+"','"+category+"','"+income+"','"+education+"','"+occupation+"','"+pan+"','"+aadhar+"','"+scitizen+"','"+eaccount+"')";
                c1.s.executeUpdate(q1);
                
                new Signup3(formno).setVisible(true);
                setVisible(false);
            }
                
      
            
        }catch(Exception ex){
             ex.printStackTrace();
        }
    
               
    }
    public static void main(String[] args){
        new Signup2("").setVisible(true);
    }
}
