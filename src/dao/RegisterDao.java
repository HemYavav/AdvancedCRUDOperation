/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import beans.RegisterBean;
import com.sun.source.doctree.ReturnTree;
import databaseconnection.ConnectionProviders;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RegisterDao {
    
    public String  useRegister(RegisterBean registerBean){
        
                try {
           Connection con = ConnectionProviders.getConnection();
          PreparedStatement ps =  con.prepareStatement("insert into user values(?,?,?,?)");
          ps.setString(1, registerBean.getUsername());
          ps.setString(2, registerBean.getPassword());
          ps.setString(3, registerBean.getEmail());
          ps.setString(4, registerBean.getMobile());

            long i = ps.executeUpdate();

          
                    if (i>0) {
                        return "Success";
                        
                    }else{
                    return "Fail";
                    }
            
            
//          ResultSet rs = ps.executeQuery();
//          
//            if (rs.next()) {
//                System.out.println("valid");
//                
//            }
           
        } catch (Exception e) {
                            System.out.println("valid");
        }
             return "Fail"; 
                
        
    }
    
    
}
