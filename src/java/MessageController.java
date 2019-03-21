/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author Admin
 */
@Named(value = "messageController")
@SessionScoped
public class MessageController implements Serializable {
    
    private String gText;

    /**
     * Creates a new instance of MessageController
     */
    public MessageController() {
        FacesMessage msg= new FacesMessage(FacesMessage.SEVERITY_INFO,"Bean inited",null);
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public String getgText() {
        return gText;
    }

    public void setgText(String gText) {
        this.gText = gText;
    }
    
    public void newMessage()
    {
    if (getgText().equalsIgnoreCase("solna")){
            FacesMessage javaTextMsg = new FacesMessage(FacesMessage.SEVERITY_INFO, 
                "Good Job, that is the correct answer!", null);
            FacesContext.getCurrentInstance().addMessage("guessForm:gText", javaTextMsg);
        } else {
            FacesMessage javaTextMsg = new FacesMessage(FacesMessage.SEVERITY_ERROR, 
                "Sorry, that is NOT the correct answer!", null);
            FacesContext.getCurrentInstance().addMessage("guessForm:gText", javaTextMsg);
        }

            
            
    }
    
}
