package com.situ.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.situ.service.GetService;

@Controller
public class GetContrloller {
	@Autowired
	private GetService getService;
	
	@RequestMapping(value="/getAccess")
	@ResponseBody 
	public String getAccess() {  
		System.out.println("getService:::"+getService);
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!11111");
	  String str = "{\"user\": { \"city\": \"" + "SSSS" + "\"}}";
	  getService.getAccess();
	  return str;  
	 }  
}