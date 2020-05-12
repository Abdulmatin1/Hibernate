package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	
	
	@RequestMapping("/list")
	
	public String showCustomerList(Model theModel) {
		
		return "Customer-list";
	}
	

}
