package gui_forms;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;

public class InsertImageIntoDatabase {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/demoproject", "root", "Nano2023@hem");
            System.out.println("Connection: " + con1);
            // create table imagetable(name varchar(50) not null, images blob );
            // blob=>> is used for store small size image in database
            // longblob=>> is used for store large size image in database
            
            
            PreparedStatement preparedStatement = con1.prepareStatement("insert into imagetable values(?,?)");
            
            String file = System.getProperty("user.dir");
            file = file+ "\\src\\gui_forms\\h.jpg";
            System.out.println(file);
            FileInputStream fin = new FileInputStream(file);
            
            
            preparedStatement.setString(1, "image");
            preparedStatement.setBinaryStream(2, fin,fin.available());
            
         long i =   preparedStatement.executeUpdate();
            System.out.println(i);
            
            con1.close();
            

        } catch (IOException | ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        
        //40 class
    }

}
