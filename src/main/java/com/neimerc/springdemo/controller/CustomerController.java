package com.neimerc.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {

	// Example to confirm that all go well. It will be deleted
	@GetMapping("/")
	public String showHome() {
		
		return "home";
	}
	
}
