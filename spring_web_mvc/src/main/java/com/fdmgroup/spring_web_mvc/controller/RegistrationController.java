package com.fdmgroup.spring_web_mvc.controller;



import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

    // by adding the following verbiage to methods it is possible print webpages <<<<<<<<< considered "old school"
    // HttpServletResponse response throws IOException 
    @RequestMapping(value = "/processCalculate", method = RequestMethod.GET)
    public String goToProcessCalculate(HttpServletRequest request) { 
        int number1 = Integer.parseInt(request.getParameter("num1"));
        int number2 = Integer.parseInt(request.getParameter("num2"));
        int result = number1 + number2;

        System.out.println("Result : " + result);
        return "index";

        // the syntax need to print the page

        // PrintWriter out = response.getWriter();
        // out.println("<html>");
        // out.println("<head><title>Result Page</title></head>");
        // out.println("<body><p>" + result + "</p></body>");
        // out.println("</html>");

    }

}