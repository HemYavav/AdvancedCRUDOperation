package gui_forms;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import listners.LoginListner;

 public class LoginForm extends JFrame {

    public JFrame frame;

    public JButton btnLogin, btnCancel,btnNewuser;
    
    public JTextField username, password;
    public JLabel usernameJLabel, passwordJLabel;

    public LoginForm() {

        frame = new JFrame();

        frame.setTitle("Login Form ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());
        frame.setResizable(false);

        btnLogin = new JButton("Login");
        btnCancel = new JButton("Cancel");
        btnNewuser = new JButton("New User Register Form");

        usernameJLabel = new JLabel("Username");
        passwordJLabel = new JLabel("Password");

        username = new JTextField(15);
        password = new JTextField(15);

        frame.add(usernameJLabel);
        frame.add(username);
        frame.add(passwordJLabel);
        frame.add(password);

        frame.add(btnLogin);
        frame.add(btnCancel);
        frame.add(btnNewuser);

        LoginListner listner = new LoginListner(this);
       btnLogin.addActionListener(listner);
       btnCancel.addActionListener(listner);
       btnNewuser.addActionListener(listner);
        frame.setVisible(true);

    }

  
}
