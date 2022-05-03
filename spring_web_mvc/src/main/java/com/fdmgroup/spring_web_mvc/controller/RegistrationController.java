package com.fdmgroup.spring_web_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegistrationController {
    
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String goToRegisterPage() {
        return "registration";
    }

    @RequestMapping(value = "/forwarding", method = RequestMethod.GET)
    public String preProcessRequest() {
        System.out.println("Processing 1...");
        return "forward:";
    }

    @RequestMapping(value = "/additionalProcessing", method = RequestMethod.GET)
    public String doProcessing() {
        System.out.println("Processing 2...");
        return "index";
    }
    
    // these annotations are equivalent
    // @RequestMapping(value = "/goToGoogle", method = RequestMethod.GET)
    @GetMapping("/goToGoogle")
    public String goToGoogle() {
        return "redirect:https://www.google.com";
    }

}