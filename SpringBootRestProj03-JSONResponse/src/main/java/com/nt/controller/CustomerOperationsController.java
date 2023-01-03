package com.nt.controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.nt.model.Customer;

@RestController
@RequestMapping("/customer")
public class CustomerOperationsController {


	@GetMapping("/report")
	public ResponseEntity<Customer> showCustomerData(){
		Customer cust = new Customer(101,"Raja" , "Hyderbad");
		return new  ResponseEntity<Customer>(cust,HttpStatus.OK);
	}
	
}
