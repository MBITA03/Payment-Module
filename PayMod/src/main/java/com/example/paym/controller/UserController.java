package com.example.paym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.entity.User;

@Controller
public class UserController {
	
	// This method is mapped to the root endpoint "/" and returns a Thymeleaf template called "login.html"
	@GetMapping("/")
	public String login(Model model ) {
		
		// Create a new User object and add it to the model
		User user = new User();
		model.addAttribute("user", user);
		
		// Return the "login.html" template
		return "login";
	}

	// This method is mapped to the "/userLogin" endpoint and receives the User object submitted by the login form
	@PostMapping("/userLogin") 
	public String loginUser(@ModelAttribute("user") User user){
		
		// TODO: Authenticate the user and set the appropriate user role or authorization level
		
		// If authentication is successful, return the "home.html" template to represent the user's home page
		return "home";
	}
	
	// This method is mapped to the "/home" endpoint and returns the "home.html" template
	@GetMapping(value = "/home", produces = "text/html") 
	public String backPage() {
		  
		// Return the "home.html" template
	    return "home";
	}
	
	
	
	@GetMapping(value = "/bankpayment", produces = "text/html")
	public String bankPayment() {
		
		return "bankPayment";
	}
	
	@GetMapping(value = "/momopayment", produces = "text/html")
	public String momoPayment() {
		
		return "momopayment";
	}
}
