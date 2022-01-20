package com.ibm.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.entity.Customer;
import com.ibm.pojo.Login;
import com.ibm.service.CustomerService;
import com.ibm.service.MailService;

/**
 * This Controller is for Adding/Authenticating the login credentials of Customer
 * 
 * @author:Gandlaparthi_Pravallika
 * @version:1.0
 * @since:January 2022
 * 
 */

@CrossOrigin
@RestController
public class CustomerController {

	@Autowired
	private CustomerService service;
	
	@Autowired
	private MailService mservice;
	
	@PostMapping(value="/customer", consumes = "application/json")
	void addCustomer(@RequestBody Customer customer)
	{
		service.addCustomer(customer);
		mservice.sendEmailRegister(customer);
	}
	
	@GetMapping(value="/login/{email}/{password}",produces = "application/json")
	public ResponseEntity<?> validate(@PathVariable String email,@PathVariable String password)
	{
		Login login=new Login(email,password);
		try {
			Customer customer=service.authenticateCustomer(login);
			return new ResponseEntity<Customer>(customer,HttpStatus.OK);
		}catch(Exception e)
		{
			return new ResponseEntity<String>("Invalid Email Id or Password",HttpStatus.NOT_FOUND);
		}
	}
}
