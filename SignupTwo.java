package bank.management.system;


import javax.swing.*;
import java.awt.*;
//import java.util.*;

import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener{
JTextField pan,aadhar;
JComboBox religion,category,occupation,education,income;
JButton next;
JRadioButton cyes,cno,eyes,eno;
String formno;
            
    SignupTwo(String formno){
        this.formno =formno;
        
       setLayout(null);
      setTitle("NEW ACCOUNT APPLICATION FORM - Page 2");
       
       
       JLabel additionalDetails =new JLabel(" Page 2 : Additional Details :" );
       additionalDetails.setFont(new Font ("Raleway",Font.BOLD,22));
       additionalDetails.setBounds(290,80,400,30);
       add(additionalDetails);
       
           
       JLabel rel =new JLabel("Religion :" );
       rel.setFont(new Font("Raleway",Font.BOLD,20));
       rel.setBounds(100,140,100,30);
       add(rel);
       
       String valReligion[] ={"Hindu","Muslim","Jain","sikh","Christian","Other"};
        religion = new JComboBox(valReligion);
       religion.setBounds(300,140,400,30);
       religion.setBackground(Color.WHITE);
       add(religion);
  
       JLabel cat =new JLabel("Category :" );
       cat.setFont(new Font ("Raleway",Font.BOLD,20));
       cat.setBounds(100,190,200,30);
       add(cat);
       
       String valCategory[] = {"General","OBC","SC","ST","Other"};  
        category = new JComboBox(valCategory);
       category.setBackground(Color.WHITE);
       category.setBounds(300,190,400,30);
       add(category);
      
       JLabel inc =new JLabel(" Income:" );
       inc.setFont(new Font ("Raleway",Font.BOLD,20));
       inc.setBounds(100,240,200,30);
       add(inc);
       
        String incomeCategory[] = {"Null","<1,50,000","<2,50,000","<6,00,000","Upto 10,00,000"};  
        income = new JComboBox(incomeCategory);
       income.setBackground(Color.WHITE);
       income.setBounds(300,240,400,30);
       add(income);
  
       
       JLabel edu =new JLabel(" Educational :" );
       edu.setFont(new Font ("Raleway",Font.BOLD,20));
       edu.setBounds(100,290,200,30);
       add(edu); 
   
       JLabel qly =new JLabel(" Qualification :" );
       qly.setFont(new Font ("Raleway",Font.BOLD,20));
       qly.setBounds(100,315,200,30);
       add(qly); 
       
       String educationValues[] = {"Non-Graduate","Graduate","Post-Graduate","Doctorate","Others"};  
        education = new JComboBox(educationValues);
       education.setBackground(Color.WHITE);
       education.setBounds(300,340,400,30);
       add(education);
       
       JLabel occ =new JLabel(" Occupation :" );
       occ.setFont(new Font ("Raleway",Font.BOLD,20));
       occ.setBounds(100,390,200,30);
       add(occ);
       
       String occupationValues[] = {"Salaried","Self-Employed","Business","Student","Retired","Other"};  
       occupation = new JComboBox(occupationValues);
       occupation.setBackground(Color.WHITE);
       occupation.setBounds(300,390,400,30);
       add(occupation);
       
       
    
       
       JLabel pno =new JLabel(" Pan No. :" );
       pno.setFont(new Font ("Raleway",Font.BOLD,20));
       pno.setBounds(100,440,200,30);
       add(pno);
       
       pan =new JTextField();
       pan.setFont(new Font("Raleway",Font.BOLD,14));
       pan.setBounds(300,440,400,30);
       add(pan);
       
       
       JLabel adh =new JLabel(" Aadhar No. :" );
       adh.setFont(new Font ("Raleway",Font.BOLD,20));
       adh.setBounds(100,490,200,30);
       add(adh);
       
       aadhar =new JTextField();
       aadhar.setFont(new Font("Raleway",Font.BOLD,14));
       aadhar.setBounds(300,490,400,30);
       add(aadhar);
       
       JLabel citizen =new JLabel(" Senior Citizen :" );
       citizen.setFont(new Font ("Raleway",Font.BOLD,20));
       citizen.setBounds(100,540,200,30);
       add(citizen);
       
       cyes =new JRadioButton("Yes");
       cyes.setBounds(300,540,60,30);
       cyes.setBackground(Color.WHITE);
       add(cyes);
       
       
       cno =new JRadioButton("No");
       cno.setBounds(450,540,120,30);
       cno.setBackground(Color.WHITE);
       add(cno); 
       
       ButtonGroup citizengroup = new ButtonGroup();
       citizengroup.add(cyes);
       citizengroup.add(cno);
       
       
       
       JLabel eAcc =new JLabel(" Existing Account :" );
       eAcc.setFont(new Font ("Raleway",Font.BOLD,20));
       eAcc.setBounds(100,590,200,30);
       add(eAcc);
       
        
       eyes =new JRadioButton("Yes");
       eyes.setBounds(300,590,60,30);
       eyes.setBackground(Color.WHITE);
       add(eyes);
       
       
       eno =new JRadioButton("No");
       eno.setBounds(450,590,120,30);
       eno.setBackground(Color.WHITE);
       add(eno); 
       
       ButtonGroup Accountgroup = new ButtonGroup();
       Accountgroup.add(eyes);
       Accountgroup.add(eno);
       
       
       
       next =new JButton("Next");
       next.setBackground(Color.BLACK);
       next.setForeground(Color.WHITE);
       next.setFont(new Font ("Raleway",Font.BOLD,14));
       next.setBounds(620,660,80,30);
       next.addActionListener(this);
       add(next);
       
       
       getContentPane().setBackground(Color.WHITE);
       
       setSize(850,800);
       setLocation(350,10);
       setVisible(true);
       
    }
   
    public void actionPerformed(ActionEvent ae){
        String sreligion = (String) religion.getSelectedItem();
        String scategory = (String) category.getSelectedItem();
        String sincome = (String) income.getSelectedItem();
        String seducation = (String) education.getSelectedItem();
        String soccupation = (String) occupation.getSelectedItem();
        

        String seniorcitizen =null;
        if(cyes.isSelected()){
            seniorcitizen ="Yes";
        }else if(cno.isSelected()){
            seniorcitizen ="No";
        }
        
        String existingaccount =null;
        if(eyes.isSelected()){
            existingaccount ="Yes";
        }else if(eno.isSelected()){
            existingaccount ="No";
        }
        
        String span =pan.getText();
        String saadhar = aadhar.getText();
        
       try{
               Conn c=new Conn();
               String query ="insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+saadhar+"','"+seniorcitizen+"','"+existingaccount+"')";
               c.s.executeUpdate(query);
               
               setVisible(false);
               new SignupThree(formno).setVisible(true);
       } catch(Exception e){
           System.out.println(e);
       }
    }
    
    
    public static void main(String[] args) {
        new SignupTwo("").setVisible(true);
    }
    
}