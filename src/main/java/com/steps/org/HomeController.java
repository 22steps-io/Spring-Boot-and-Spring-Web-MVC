package com.steps.org;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.steps.org.model.Greeting;

@Controller
public class HomeController {

	private String message = "Hello World";
	
	String home(){
		return "Congratulations!, you have created a web application using spring boot"; 
	}
	
	@RequestMapping(value="/getJson",produces = "application/json")
	@ResponseBody
	Object homeJsonResponse(){
		System.out.println("Testing live auto restart");
		return new Greeting("Hey Spring Buddy", "Whoa!, you have created a web app using spring boot!");
	}
	
	
}
