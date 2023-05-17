package gui_forms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;

public class StoreFileIntoDatabase {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/demoproject", "root", "Nano2023@hem");
            System.out.println("Connection: " + con1);
            // create table imagetable(name varchar(50) not null, images blob );
            // blob=>> is used for store small size image in database
            // longblob=>> is used for store large size image in database
            
            
            PreparedStatement preparedStatement = con1.prepareStatement("insert into filetable values(?,?)");
            
            String file = System.getProperty("user.dir");
            file = file+ "\\src\\gui_forms\\Update.java";
            System.out.println(file);
            
            File f =new File(file);
            
//                        FileInputStream fin = new FileInputStream(file);
            FileReader fr = new FileReader(f);
            
            
            preparedStatement.setInt(1, 100);
            preparedStatement.setCharacterStream(2, fr,(int)f.length());
            
         long i =   preparedStatement.executeUpdate();
            System.out.println(i);
            
            con1.close();
            

        } catch (IOException | ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        
        //40 class
    }

}
