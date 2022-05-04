package com.fdmgroup.spring_web_mvc.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    private AuthenticationService authenticationService;

    
    @Autowired
    public LoginController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping
    public String processLogin(@RequestParam String username, @RequestParam String password, HttpSession session) {
        authenticationService.isValid(username, password);
        session.setAttribute("LoginUsername", username);
        return "index";
    }
}
