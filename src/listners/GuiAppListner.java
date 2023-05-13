
package listners;

import gui_forms.GuiApp;
import gui_forms.LoginForm;
import gui_forms.RegisterForm;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GuiAppListner implements ActionListener{

    GuiApp ap;
    
    public GuiAppListner(GuiApp aThis) {
        this.ap =aThis;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource()==ap.login) {
            new LoginForm();
        }
        else if (e.getSource()==ap.register) {
            System.out.println("Register"); 
            
            new RegisterForm();
        }
               


    }
    
}
