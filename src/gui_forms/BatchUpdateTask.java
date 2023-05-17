package gui_forms;

import java.sql.*;
import databaseconnection.ConnectionProviders;

public class BatchUpdateTask {

    public static void main(String[] args) {

        try {
            Connection con = ConnectionProviders.getConnection();

            /*  
            Statement s = con.createStatement();
            String s1 = "isert into user values('shayam','pass','sham@gmail.com','2345654','1:11:01')";
            String s2 = "update user set name='hem' where email = 'heman@gmail.com'";
            String s3 = "delete from user where name = 'admin'";
            s.addBatch(s1);
            s.addBatch(s2);
            s.addBatch(s3);
            
            int i[] = s.executeBatch();
            
             */
            PreparedStatement preparedStatement = con.prepareStatement("insert into user values(?,?,?,?,?) ");
            preparedStatement.setString(1, "shayam");
            preparedStatement.setString(2, "pass");
            preparedStatement.setString(3, "sham@gmail.com");
            preparedStatement.setString(4, "9801234567");
            preparedStatement.setTimestamp(5, geTimestamp());
            preparedStatement.addBatch();
                Thread.sleep(150);
            preparedStatement.setString(1, "shayam");
            preparedStatement.setString(2, "pass");
            preparedStatement.setString(3, "sham@gmail.com");
            preparedStatement.setString(4, "9801234567");
            preparedStatement.setTimestamp(5, geTimestamp());
            preparedStatement.addBatch();
                Thread.sleep(150);

            preparedStatement.setString(1, "shayam");
            preparedStatement.setString(2, "pass");
            preparedStatement.setString(3, "sham@gmail.com");
            preparedStatement.setString(4, "9801234567");
            preparedStatement.setTimestamp(5, geTimestamp());
            preparedStatement.addBatch();
                Thread.sleep(150);

            preparedStatement.setString(1, "shayam");
            preparedStatement.setString(2, "pass");
            preparedStatement.setString(3, "sham@gmail.com");
            preparedStatement.setString(4, "9801234567");
            preparedStatement.setTimestamp(5, geTimestamp());
            preparedStatement.addBatch();
                Thread.sleep(150);
            
          
//            preparedStatement.executeBatch();
            System.out.println(preparedStatement.executeBatch().length);
            

        } catch (Exception e) {
        }

    }

    private static java.sql.Timestamp geTimestamp() {
        java.util.Date today = new java.util.Date();
        return new java.sql.Timestamp(today.getTime());

    }
    
//    
//    public static Timestamp geTimestamp(){
//    java.util.Date today = new java.util.Date();
//    return new Timestamp(today.getTime());
//       
//    }

}
