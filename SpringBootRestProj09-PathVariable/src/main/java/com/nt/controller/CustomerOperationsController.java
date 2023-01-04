package com.nt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/customer")
public class CustomerOperationsController {



	@GetMapping("/report/{no}/{name}")                  //see order u passed here
	public String fetchData(@PathVariable("name") String cname,@PathVariable("no") Integer cno){
	System.out.println("CustomerOperationsController.saveCustomer()");
	return +cno+ " "+cname;
	}
	

	@GetMapping("/report1/{no}/{name}")
	public String fetchData1(@PathVariable(name="name", required=false) String cname,@PathVariable("no") Integer cno){
	System.out.println("CustomerOperationsController.saveCustomer()");
	return +cno+ " "+cname;
	}
}

