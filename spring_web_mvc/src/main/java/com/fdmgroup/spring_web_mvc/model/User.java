package com.fdmgroup.spring_web_mvc.model;

import java.io.Serializable;

import org.springframework.stereotype.Controller;

@Controller
public class User implements Serializable {
    
    private static final long serialVersionUID = 1L;
    private String username;
    private String password;
    
    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User [password=" + password + ", username=" + username + "]";
    }


}
