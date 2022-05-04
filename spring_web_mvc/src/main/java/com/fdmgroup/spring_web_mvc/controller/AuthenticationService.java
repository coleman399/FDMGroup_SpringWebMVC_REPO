package com.fdmgroup.spring_web_mvc.controller;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public boolean isValid(String username, String password) {
        return true;
    }

}
