package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	
	@PostMapping("cust/add")
	String addCustomer(@RequestBody    Customer c)
	{
		
		CustomerService ss= new CustomerService();
		ss.saveCustomerInDb(c);
		return "customer added successfully";
	}

}


