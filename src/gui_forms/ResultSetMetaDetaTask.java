package gui_forms;

import java.sql.*;

import databaseconnection.ConnectionProviders;

public class ResultSetMetaDetaTask {

    public static void main(String[] args) {

        try {
            Connection con = ConnectionProviders.getConnection();

            DatabaseMetaData databaseMetaData = con.getMetaData();
            Statement st = con.createStatement();
            
            ResultSet resultSet = st.executeQuery("select * from user");
            System.out.println(resultSet);
            
            
            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
            System.out.println(resultSetMetaData);
            System.out.println("*****************ResultSetMetaData**************");
            System.out.println("getColumnCount: "+resultSetMetaData.getColumnCount());
            System.out.println("getClass: "+resultSetMetaData.getClass());
            System.out.println("getColumnClassName: "+resultSetMetaData.getColumnClassName(1));
            System.out.println("getColumnClassName: "+resultSetMetaData.getColumnType(1));
            System.out.println("getColumnCount: "+resultSetMetaData.getColumnCount());
            System.out.println("getColumnLabel: "+resultSetMetaData.getColumnLabel(3));

            System.out.println("\n***********************DatabaseMetaData**********************");
            System.out.println("getDriverName: "+databaseMetaData.getDriverName());
            System.out.println("getURL: "+databaseMetaData.getURL());
            System.out.println("getDriverVersion: "+databaseMetaData.getDriverVersion());
            System.out.println("getDriverMajorVersion: "+databaseMetaData.getDriverMajorVersion());
            System.out.println("getDriverMinorVersion: "+databaseMetaData.getDriverMinorVersion());
            System.out.println("getTableTypes: "+databaseMetaData.getTableTypes());
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
