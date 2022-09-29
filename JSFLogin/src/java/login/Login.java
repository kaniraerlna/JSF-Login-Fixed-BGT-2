/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package login;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
//import javax.inject.Named;
//import javax.enterprise.context.Dependent;
//
///**
// *
// * @author Miss KaNiRa
// */
//@Named(value = "login")
//@Dependent

@ManagedBean (name= "value_login", eager= true)
@SessionScoped
public class Login implements Serializable{

    public String email, password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
   
    /**
     * Creates a new instance of Login
     */
    public String Login() {
        String email= this.email;
        String password= this.password;
        {
        this.email = email;
        this.password = password;
            if(email.equals("kaniraerliana@gmail.com") && password.equals("kanira"))
            {
                return"LoginSuccess";
            }
            else
            {
                return"LoginFailed";
            }
        }
    }
    
}
