package com.prottotipo.kwinceclient.beans;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "indexMB", eager = true)
public class WelcomeBean {
    
    private String message;
    
    public WelcomeBean() {
        System.out.println("WelcomeBean instantiated");
    }

    public String getMessage() {
        return "I'm alive!";
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
