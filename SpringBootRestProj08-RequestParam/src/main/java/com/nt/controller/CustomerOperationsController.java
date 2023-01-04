package com.nt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerOperationsController {



	@GetMapping("/report")
	public String saveCustomer(@RequestParam("cno") int no,@RequestParam("cname") String cname){

		System.out.println("CustomerOperationsController.saveCustomer()");

		return +no+ " "+cname;
	}

	//required=true   :: mandatory to pass all req paran value (400 error)
	//required=false   :: Not mandatory to pass All  req paran value

	@GetMapping("/report")
	public String saveCustomer1(@RequestParam("cno") int no,@RequestParam(required=false) String cname){

		System.out.println("CustomerOperationsController.saveCustomer()");

		return +no+ " "+cname;
	}
}

