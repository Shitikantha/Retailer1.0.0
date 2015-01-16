package com.situ.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class SecondHelloWorld {

    @RequestMapping("/helloworld2")
    public ModelAndView helloWorld(HttpServletRequest req) {
    	System.out.println("req"+req.getParameter("test"));
    	
    	System.out.println("start");
        String message = "<br><div align='center'><h1>Hello from HelloWorld controller.<h1>this is from method 1st<br>";
        Map<String,String> responseMessage=new HashMap<String,String>();
        responseMessage.put("message1", message);
        responseMessage.put("name", "Subham");
        
        return new ModelAndView("welcome", "responseMessage", responseMessage);
    }
    @RequestMapping("/helloworld3")
    public ModelAndView helloWorld2() {
    	System.out.println("Start1");
        String message = "<br><div align='center'><h1>Hello from HelloWorld controller.<h1><br>this is from method 2nd";
        Map<String,String> responseMessage=new HashMap<String,String>();
        responseMessage.put("message1", message);
        responseMessage.put("name", "Subham Of helloWorld2");
       
        return new ModelAndView("welcome", "responseMessage", responseMessage);
    }
}