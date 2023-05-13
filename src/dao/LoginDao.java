
package dao;

import java.sql.*;
import beans.LoginBean;
import databaseconnection.ConnectionProviders;


public class LoginDao {
    
    public void useLogin(LoginBean loginBean){
        
        try {
           Connection con = ConnectionProviders.getConnection();
          PreparedStatement ps =  con.prepareStatement("select * from user where name = ? and password = ?");
          ps.setString(1, loginBean.getUsername());
          ps.setString(2, loginBean.getPassword());
          
          ResultSet rs = ps.executeQuery();
          
            if (rs.next()) {
                System.out.println("valid");
                
            }
           
        } catch (Exception e) {
                            System.out.println("valid");
        }
        
    
    }
    
}
