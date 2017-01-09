package com.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// controller handles our root or home url call on spring boot application
@RestController
public class HomeController {
	
	// forward slash identifies what mapping it will take
	@RequestMapping("/")
	public String home() {
		
		// returns this string to the browser after running App.java as a regular java application
		return "Das Boot, reporting for duty!";
	}

}
