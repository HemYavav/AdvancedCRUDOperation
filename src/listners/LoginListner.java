
package listners;

import beans.LoginBean;
import dao.LoginDao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gui_forms.LoginForm;
import gui_forms.RegisterForm;

public class LoginListner implements ActionListener {

    LoginForm loginForm;
    
    
    public LoginListner(LoginForm loginForm){
    
    this.loginForm = loginForm;
    }
    
    
    
     @Override
    public void actionPerformed(ActionEvent e) {
        
        
        if (e.getSource()== loginForm.btnLogin) { 
            System.out.println("Login");
            
            
            String username = loginForm.username.getText();
            String password = loginForm.password.getText();
            
            LoginBean loginBean = new LoginBean(username,password);
            
            LoginDao loginDao = new LoginDao();
            loginDao.useLogin(loginBean);
            
          
        }
        else if (e.getSource()==loginForm.btnCancel) {
            
            System.out.println("Cancel");
            
            loginForm.username.setText("");
            loginForm.password.setText("");
            
            
        }
        else if (e.getSource()==loginForm.btnNewuser) {
             System.out.println("New register Form");
             new RegisterForm();
         }
        
    }
    
}
