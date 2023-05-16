package gui_forms;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.*;




import listners.GuiAppListner;



public class GuiApp extends JFrame{

    public JFrame frame;
    
    public JButton  login, register,btnExit, btnUpdate,btnDelete,btnSelect;
    
    
    public GuiApp(){
        
        frame = new JFrame();

frame.setTitle("GuiApp Mani Page");
frame.setSize(500,300);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setLayout(new FlowLayout());


login = new JButton("Login");
register = new JButton("Register");
btnDelete = new JButton("Delete");
btnSelect = new JButton("Select");
btnUpdate = new JButton("Update");


btnExit = new JButton("Exit");

frame.add(login);
frame.add(register);
frame.add(btnUpdate);
frame.add(btnDelete);
frame.add(btnSelect);

frame.add(btnExit);



GuiAppListner gi =new  GuiAppListner(this);
login.addActionListener(gi);
register.addActionListener(gi);
btnDelete.addActionListener(gi);
btnSelect.addActionListener(gi);
btnUpdate.addActionListener(gi);
btnExit.addActionListener(gi);



frame.setVisible(true);
    
    
    }
    
    
    public static void main(String[] args) {

//        new LoginForm();

GuiApp gap = new GuiApp();

    }

}
