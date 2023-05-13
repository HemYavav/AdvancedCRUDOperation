package gui_forms;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.*;




import listners.GuiAppListner;



public class GuiApp extends JFrame{

    public JFrame frame;
    
    public JButton  login, register,cancel;
    
    
    public GuiApp(){
        
        frame = new JFrame();

frame.setTitle("Form");
frame.setSize(500,300);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setLayout(new FlowLayout());


login = new JButton("Login");
register = new JButton("Register");
cancel = new JButton("Cancel");

frame.add(login);
frame.add(register);
frame.add(cancel);


GuiAppListner gi =new  GuiAppListner(this);
login.addActionListener(gi);
register.addActionListener(gi);


frame.setVisible(true);
    
    
    }
    
    
    public static void main(String[] args) {

//        new LoginForm();

GuiApp gap = new GuiApp();

    }

}
