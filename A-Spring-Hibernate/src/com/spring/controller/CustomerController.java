package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.dao.CustomerDao;
import com.spring.entity.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerDao	 customerDao;
	
	
	@RequestMapping("/list")
	public String showList(Model theModel) {
		
		
		// get the data throug customerDao
		
		List<Customer> allCustomerList = customerDao.getmyCustomers();
		
		
		// put the data in Model
		
		theModel.addAttribute("customers", allCustomerList);
	
		
		return "myCustomer-list";
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
