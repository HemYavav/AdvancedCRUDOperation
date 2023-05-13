package gui_forms;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import listners.LoginListner;
import listners.RegisterListner;

 public class RegisterForm extends JFrame {

    public JFrame frame;

    public JButton btnRegister, btnCancel,btnLogin;
    
    public JTextField username, password, mobile, email;
    public JLabel usernameJLabel, passwordJLabel, mobileJLabel,emailJLabel;

    public RegisterForm() {

        frame = new JFrame();

        frame.setTitle("Register Form ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(325, 280);
        frame.setLayout(new FlowLayout());
//        frame.setResizable(false);

        btnRegister = new JButton("Register");
        btnCancel = new JButton("Clear");
        btnLogin = new JButton("Login");

        usernameJLabel = new JLabel("Enter user Username");
        passwordJLabel = new JLabel("Enter user Password");
        emailJLabel = new JLabel("Enter user Email");
        mobileJLabel = new JLabel("Enter user Mobile");

        username = new JTextField(15);
        password = new JTextField(15);
        email = new JTextField(15);
        mobile = new JTextField(15);

        frame.add(usernameJLabel);
        frame.add(username);
        frame.add(passwordJLabel);
        frame.add(password);
        frame.add(emailJLabel);
        frame.add(email);
        frame.add(mobileJLabel);
        frame.add(mobile);

        frame.add(btnRegister);
//        frame.add(btnLogin);
        frame.add(btnCancel);
        
        RegisterListner listner = new RegisterListner(this);

       btnRegister.addActionListener(listner);
       btnCancel.addActionListener(listner);
//       btnNewuser.addActionListener(listner);
        frame.setVisible(true);

    }


  
}
