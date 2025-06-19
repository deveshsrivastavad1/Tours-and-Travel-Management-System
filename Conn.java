/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel.management.system;

import java.sql.*;  

public class Conn{
    Connection c;
    Statement s;
    public Conn(){  
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            System.out.println("JDBC Driver registered...");
            c =DriverManager.getConnection("jdbc:mysql://localhost:3306/book","root","Root@123"); 
            if(c!=null){
                s=c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                System.out.println("Connection established...");
            }    
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  
