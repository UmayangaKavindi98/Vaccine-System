/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vaccinesys;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Yohan
 */
public class loginTest {
    
    private String user;
    private String pass;
    
    DbConnection mdc = new DbConnection();
    Connection con = getConnection();
    Statement stmt;


    loginTest(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }

    private Connection getConnection() {
        Connection myConn = mdc.getMyConnection();
        return myConn;
    }
       public String validateLogin(){
        if("".equals(user)){
            return "Username is empty";
        }else if("".equals(pass)){
            return "Password is empty";
        }else{
            return (CheckUser());
        }
        
    }
       
    private String CheckUser(){
        
        int count =0;
        String job ="";
        String myStatement = "SELECT * FROM user WHERE username=\""+user+"\" and password=\""+pass+"\"";
        
        try {
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(myStatement);
            
            while(rs.next()){
                count += 1;
                job=rs.getString("user_type");
            }
            if (count == 0){
                return  "No record found";
            }else{
                if("Admin".equals(job)){
                    AdminHomepage frame = new AdminHomepage();
                    frame.setVisible(true);
                    return  "Sucess";
                }else if("Officer".equals(job)){
                    OfficerHomePage frame = new OfficerHomePage();
                    frame.setVisible(true);
                    return  "Sucess";
                }else if("PHI".equals(job)){
                    PHIHomePage frame = new PHIHomePage();
                    frame.setVisible(true);
                    return  "Sucess";
            
                }
            }   
        } catch (SQLException ex) {
            Logger.getLogger(loginTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    
    return null;
    }   
    

 
}
