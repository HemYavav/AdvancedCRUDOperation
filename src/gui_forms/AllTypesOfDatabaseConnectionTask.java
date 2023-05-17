package gui_forms;

import java.sql.*;
import java.util.Properties;

public class AllTypesOfDatabaseConnectionTask {

    public static void main(String[] args) {
        try {
            /*  
            System.out.println("************First Way to Connection Database**************");
            Class.forName("com.mysql.jdbc.Driver");
            Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/demoproject", "root", "Nano2023@hem");
            System.out.println("Connection: "+con1);
             */

 /*
            System.out.println("************Second Way to Connection Database**************");
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            Connection con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/demoproject", "root", "Nano2023@hem");
            System.out.println("Connection: " + con2);
             */
            //
            /*
            System.out.println("************Third Way to Connection Database**************");
            Driver driver = new com.mysql.jdbc.Driver();
            Properties properties = new Properties();
            properties.put("user", "root");
            properties.put("password", "Nano2023@hem");
            Connection con3 = driver.connect("jdbc:mysql://localhost:3306/demoproject",properties);        
            System.out.println("Connection: " + con3);
             */
            //
            System.out.println("************Fouth Way to Connection Database**************");
            System.setProperty("jdbc.Driver", "com.mysql.jdbc.Driver");
            Properties properties = new Properties();
            properties.put("user", "root");
            properties.put("password", "Nano2023@hem");
            Connection con4 = DriverManager.getConnection("jdbc:mysql://localhost:3306/demoproject", properties);
            System.out.println("Connection: " + con4);

        } catch (SQLException e) {
        }

    }

}
