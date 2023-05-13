
package beans;


public class LoginBean {

    public LoginBean(String username1, String password1) {
        this.setUsername(username1);
        this.setPassword(password1);
        
    }
    
    
     private String username,password;

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
   
    
    
}
