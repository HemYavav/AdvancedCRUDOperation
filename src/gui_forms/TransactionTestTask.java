package gui_forms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

public class TransactionTestTask {

    public static void main(String[] args) {

        Connection con = null;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demoproject", "root", "Nano2023@hem");
            System.out.println("Connectio: " + con);

            con.setAutoCommit(false);

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("\nEnter from Account Id: ");
            int f_id = Integer.parseInt(br.readLine());

            System.out.print("Enter to Account Id: ");
            int t_id = Integer.parseInt(br.readLine());

            System.out.print("Enter Amount: ");
            int amt = Integer.parseInt(br.readLine());

            PreparedStatement p1 = con.prepareStatement("update account set amount = amount + ? where id=?");

            PreparedStatement p2 = con.prepareStatement("update account set amount =amount - ? where id=?");

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("select amount from account where id =" + f_id);
            int avlAmt = 0;
            if (rs.next()) {
                avlAmt = rs.getInt("amount");
                System.out.println("Avialable amt: " + avlAmt);
            }

            if (avlAmt > amt) {
                p1.setInt(1, amt);
                p1.setInt(2, t_id);
                p1.executeUpdate();

//                int i = 4 / 0;

                p2.setInt(1, amt);
                p2.setInt(2, f_id);
                p2.executeUpdate();

                System.out.println("I am here!!!");
                con.commit();
            } else {
                System.out.println("Balancs is insufficient");

            }

        } catch (Exception e) {
            try {
                System.out.println(e);
                System.out.println("Rollbacking........");
                con.rollback();
            } catch (SQLException ex) {
                System.out.println(ex);

            }

        }
        finally{
        
            try {
                con.close();
            } catch (SQLException e) {
            }
        
        
        
        }
      

    }

}
