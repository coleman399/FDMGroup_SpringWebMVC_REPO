package com.fdmgroup.spring_web_mvc.service;

import java.util.ArrayList;
import java.util.List;

import com.fdmgroup.spring_web_mvc.model.User;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    // Fake Database
    private List<User> users;

    public AuthenticationService() {
        this.users = new ArrayList<User>();
        users.add(new User("username", "password"));
    }

    public boolean isValid(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

}
