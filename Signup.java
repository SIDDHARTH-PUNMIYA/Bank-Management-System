package main;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;
public class Signup extends JFrame implements ActionListener {

	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
	JTextField t1,t2,t3,t4,t5,t6,t7;
	JRadioButton r1,r2,r3,r4,r5;
	JButton b;
	JComboBox c1,c2,c3;
	
	Random ran = new Random();
	long first4 = (ran.nextLong() % 9000L)+1000L;
	long first=Math.abs(first4);
	
	Signup(){
		// Centre Allingning
		setFont(new Font("System",Font.BOLD,22));
		Font f = getFont();
		FontMetrics fm = getFontMetrics(f);
		int x= fm.stringWidth("Sign Up Page");
		int y= fm.stringWidth(" ");
		int z= getWidth()-x;
		int w= z/y;
		String pad="";
		pad = String.format("%"+w+"s",pad);
		setTitle(pad+"Sign Up Page");
		
		l1 = new JLabel("APPLICATION FORM NO."+first);
		l1.setFont(new Font("Raleway",Font.BOLD,28));
		
		l2 = new JLabel("Personal Details");
		l2.setFont(new Font("Raleway",Font.BOLD,12));
		
		l3 = new JLabel("Name:");
		l3.setFont(new Font("Raleway",Font.BOLD,10));
		
		l4 = new JLabel("Father's Name: ");
		l4.setFont(new Font("Raleway",Font.BOLD,10));
		
		l5 = new JLabel("Date Of Birth:");
		l5.setFont(new Font("Raleway",Font.BOLD,10));
		
		l6 = new JLabel("Gender:");
		l6.setFont(new Font("Raleway",Font.BOLD,10));
		
		l7 = new JLabel("Email:");
		l7.setFont(new Font("Raleway",Font.BOLD,10));
		
		l8 = new JLabel("Marital Status:");
		l8.setFont(new Font("Raleway",Font.BOLD,10));
		
		l9 = new JLabel("Address:");
		l9.setFont(new Font("Raleway",Font.BOLD,10));
		
		l10 = new JLabel("City");
		l10.setFont(new Font("Raleway",Font.BOLD,10));
		
		l11 = new JLabel("Pin Code:");
		l11.setFont(new Font("Raleway",Font.BOLD,10));
		
		l12 = new JLabel("State");
		l12.setFont(new Font("Raleway",Font.BOLD,10));
		
		l13 = new JLabel("Date");
		l13.setFont(new Font("Raleway",Font.BOLD,8));
		
		l14 = new JLabel("Month");
		l14.setFont(new Font("Raleway",Font.BOLD,8));
		
		l15 = new JLabel("Year");
		l15.setFont(new Font("Raleway",Font.BOLD,8));
		
		
		t1= new JTextField(15);
		t1.setFont(new Font("Raleway",Font.BOLD,14));
		
		t2= new JTextField(15);
		t2.setFont(new Font("Raleway",Font.BOLD,14));
		
		t3= new JTextField(15);
		t3.setFont(new Font("Raleway",Font.BOLD,14));
		
		t4= new JTextField(15);
		t4.setFont(new Font("Raleway",Font.BOLD,14));
		
		t5= new JTextField(15);
		t5.setFont(new Font("Raleway",Font.BOLD,14));
		
		t6= new JTextField(15);
		t6.setFont(new Font("Raleway",Font.BOLD,14));
		
		t7= new JTextField(15);
		t7.setFont(new Font("Raleway",Font.BOLD,14));
		
		b = new JButton("SUBMIT");
		b.setBackground(Color.BLACK);
		b.setForeground(Color.WHITE);
		b.setFont(new Font("Raleway",Font.BOLD,10));
		
		r1 = new JRadioButton("MALE");
		r1.setBackground(Color.WHITE);
		r1.setFont(new Font("Raleway",Font.BOLD,10));
		
		r2 = new JRadioButton("FEMALE");
		r2.setBackground(Color.WHITE);
		r2.setFont(new Font("Raleway",Font.BOLD,10));
		
		r3 = new JRadioButton("MARRIED");
		r3.setBackground(Color.WHITE);
		r3.setFont(new Font("Raleway",Font.BOLD,10));
		
		r4 = new JRadioButton("UNMARRIED");
		r4.setBackground(Color.WHITE);
		r4.setFont(new Font("Raleway",Font.BOLD,10));
		
		r5 = new JRadioButton("OTHERS");
		r5.setBackground(Color.WHITE);
		r5.setFont(new Font("Raleway",Font.BOLD,10));
		
		 String date[] = {"1","2","3","4","5","6","7","8","9"};
	        c1 = new JComboBox(date);
	        c1.setBackground(Color.WHITE);
	        
	        String month[] = {"January","February","March","April","May","June","July","August","September","October","November","December"};
	        c2 = new JComboBox(month);
	        c2.setBackground(Color.WHITE);
	        
	        String year[] = {"1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001","2002"};
	        c3 = new JComboBox(year);
	        c3.setBackground(Color.WHITE);
	        
	        
	        
	        setLayout(null);
	        l1.setBounds(140,20,600,40);
	        add(l1);
	        
	        l2.setBounds(290,70,600,30);
	        add(l2);
	        
	        l3.setBounds(100,140,100,30);
	        add(l3);
	        
	        t1.setBounds(300,140,400,30);
	        add(t1);
	        
	        l4.setBounds(100,190,200,30);
	        add(l4);
	        
	        t2.setBounds(300,190,400,30);
	        add(t2);
	        
	        l5.setBounds(100,240,200,30);
	        add(l5);
	        
	        l13.setBounds(300,240,40,30);
	        add(l13);
	        
	        c1.setBounds(340,240,60,30);
	        add(c1);
	        
	        l14.setBounds(410,240,50,30);
	        add(l14);
	        
	        c2.setBounds(460,240,100,30);
	        add(c2);
	        
	        l15.setBounds(570,240,40,30);
	        add(l15);
	        
	        c3.setBounds(610,240,90,30);
	        add(c3);
	        
	        l6.setBounds(100,290,200,30);
	        add(l6);
	       
	        r1.setBounds(300,290,60,30);
	        add(r1);
	        r2.setBounds(450,290,90,30);
	        add(r2);
	        l7.setBounds(100,340,200,30);
	        add(l7);
	        
	        t3.setBounds(300,340,400,30);
	        add(t3);
	        
	        l8.setBounds(100,390,200,30);
	        add(l8);
	        
	        r3.setBounds(300,390,100,30);
	        add(r3);
	        
	        r4.setBounds(450,390,100,30);
	        add(r4);
	        
	        r5.setBounds(635,390,100,30);
	        add(r5);
	        
	        
	        
	        l9.setBounds(100,430,200,30);
	        add(l9);
	        
	        t4.setBounds(300,430,400,30);
	        add(t4);
	        
	        l10.setBounds(100,480,200,30);
	        add(l10);
	        
	        t5.setBounds(300,480,400,30);
	        add(t5);
	        
	        l11.setBounds(100,520,200,30);
	        add(l11);
	        
	        t6.setBounds(300,520,400,30);
	        add(t6);
	        
	        l12.setBounds(100,560,200,30);
	        add(l12);
	        
	        t7.setBounds(300,560,400,30);
	        add(t7);
	        
	        b.setBounds(620,600,80,30);
	        add(b);
	        
	        b.addActionListener(this); 
	        
	        getContentPane().setBackground(Color.WHITE);
	        
	        setSize(850,850);
	        setLocation(500,90);
	        setVisible(true);
	    }
	    
	    public void actionPerformed(ActionEvent ae){
	        
	        
	        String a = t1.getText();
	        String b = t2.getText();
	        
	        String ac = (String)c1.getSelectedItem(); 
	        String bc = (String)c2.getSelectedItem();
	        String cc = (String)c3.getSelectedItem();
	        
	        String d = null;
	        if(r1.isSelected()){ 
	            d = "Male";
	        }
	        else if(r2.isSelected()){ 
	            d = "Female";
	        }
	            
	        String e = t3.getText();
	        String f = null;
	        if(r3.isSelected()){ 
	            f = "Married";
	        }else if(r4.isSelected()){ 
	            f = "Unmarried";
	        }else if(r5.isSelected()){ 
	            f = "Other";
	        }
	           
	        String g = t4.getText();
	        String h = t5.getText();
	        String i = t6.getText();
	        String j = t7.getText();
	        try{
	            
	            if(t6.getText().equals("")){
	                JOptionPane.showMessageDialog(null, "Fill all the required fields");
	            }else{
	                
	                conn c1 = new conn();
	                String q1 = "insert into signup values('"+a+"','"+b+"','"+ac+"','"+bc+"','"+cc+"','"+d+"','"+e+"','"+f+"','"+g+"','"+h+"','"+i+"','"+j+"','"+first+"')";
	                c1.s.executeUpdate(q1);
	                
	                new Signup3().setVisible(true);
	                setVisible(false);
	            }
	            
	        }catch(Exception ex){
	             ex.printStackTrace();
	        }
	        
	    }	    
	    
	} 