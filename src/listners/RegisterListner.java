/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listners;

import beans.RegisterBean;
import dao.RegisterDao;
import gui_forms.RegisterForm;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import jdk.jfr.Period;

/**
 *
 * @author Hem Yadav
 */
public class RegisterListner implements ActionListener {

    RegisterForm registerForm;

    public RegisterListner(RegisterForm registerForm) {
        this.registerForm = registerForm;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == registerForm.btnRegister) {
            String name = registerForm.username.getText();
            String password = registerForm.password.getText();
            String email = registerForm.email.getText();
            String mobile = registerForm.mobile.getText();

            if (name.equals("") || password.equals("") || email.equals("") || mobile.equals("")) {
                JOptionPane.showMessageDialog(null, "Please Fill All Fields!!!");
            } else {

                RegisterBean rb = new RegisterBean();
                rb.setUsername(name);
                rb.setPassword(password);
                rb.setEmail(email);
                rb.setMobile(mobile);

                RegisterDao registerDao = new RegisterDao();
                String msg = registerDao.useRegister(rb);

                if (msg.equals("success")) {
                                        registerForm.username.setText("");
                    registerForm.password.setText("");
                    registerForm.email.setText("");
                    registerForm.mobile.setText("");
                    JOptionPane.showConfirmDialog(null, "Register success...");


                } else {
                    JOptionPane.showConfirmDialog(null, "Register success...");
                }

            }
        }
        else if (e.getSource()==registerForm.btnCancel) {
                    registerForm.username.setText("");
                    registerForm.password.setText("");
                    registerForm.email.setText("");
                    registerForm.mobile.setText("");
            
        }
    }

}
