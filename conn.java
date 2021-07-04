/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.sql.*;  

public class conn{
    Connection c;
    Statement s;
    public conn(){  
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            c =DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","sid123");    
            s =c.createStatement(); 
            
          
            
        }catch(ClassNotFoundException | SQLException e){ 
            System.out.println(e);
            System.out.println("Data base not connected");
        }  
    }  
}  
