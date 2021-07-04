package main;
// 1st calss to be run
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
	JLabel l1,l2,l3;
	JTextField t1;
	JPasswordField p1;
	JButton b1,b2,b3;
	Login(){
		// Centre Alingning Text
		setFont(new Font("System",Font.BOLD,22));
		Font f = getFont();
		FontMetrics fm = getFontMetrics(f);
		int x= fm.stringWidth("Bank Management System");
		int y= fm.stringWidth(" ");
		int z= getWidth()-x;
		int w= z/y;
		String pad="";
		pad = String.format("%"+w+"s",pad);
		setTitle(pad+"Bank Management System");
		
		//Declaring labels
		l1 = new JLabel("WELCOME TO TSEC BANK");
		l1.setFont(new Font("Osward",Font.BOLD,28));
		
		l2 = new JLabel("ACCOUNT No.");
		l2.setFont(new Font("Raleway",Font.BOLD,18));
		
		l3 = new JLabel("PIN");
		l3.setFont(new Font("Raleway",Font.BOLD,18));
		
		//Declaring Text fields
		
		t1= new JTextField(15);
		p1= new JPasswordField(15);
		
		//Declaring Buttons
		
		b1 = new JButton("SIGN IN");
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		
		b2 = new JButton("CLEAR");
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		
		b3 = new JButton("SIGN UP");
		b3.setBackground(Color.BLACK);
		b3.setForeground(Color.WHITE);
		
		setLayout(null);
		
		l1.setBounds(175,50,450,200);
		add(l1);
		
		l2.setBounds(125,150,375,200);
		add(l2);
		
		l3.setBounds(125,225,375,200);
		add(l3);
		
		t1.setFont(new Font("Arial",Font.BOLD,14));
		t1.setBounds(300, 235, 230, 30);
		add (t1);
		
		p1.setFont(new Font("Arial",Font.BOLD,14));
		p1.setBounds(300, 310, 230, 30);
		add (p1);
		
		b1.setFont(new Font("Arial",Font.BOLD,14));
		b1.setBounds(300, 400, 100, 30);
		add (b1);
		
		b2.setFont(new Font("Arial",Font.BOLD,14));
		b2.setBounds(430, 400, 100, 30);
		add (b2);
		
		b3.setFont(new Font("Arial",Font.BOLD,14));
		b3.setBounds(300, 450, 230, 30);
		add (b3);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		getContentPane().setBackground(Color.red);
		
		setSize(900,650);
		setLocation(300,50);
		setVisible(true);
		
	}
	
        @Override
	public void actionPerformed(ActionEvent ae) {
		
		try {
			conn c1 = new conn();
			String a = t1.getText();
			String b = p1.getText();
			String q  = "select * from login where cardno = '"+a+"' and pin = '"+b+"'";
			ResultSet rs = c1.s.executeQuery(q);
			
			if(ae.getSource()==b1) {
				 if(rs.next()){
					new Transactions().setVisible(true);
					setVisible(false);
				}else {
					JOptionPane.showMessageDialog(null,"INCORRECT Account NO or Password");
				}
			}
			else if(ae.getSource()==b2){
				t1.setText("");
				p1.setText("");
			}
			else if(ae.getSource()==b3) {
				new Signup().setVisible(true);
				setVisible(false);
			}
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("error: "+e);;
		}
	}
	
	public static void main(String[] args) {
		new Login().setVisible(true);
	}
	

}
