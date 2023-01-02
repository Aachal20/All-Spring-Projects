package com.nt.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cust")

public class CustomerOperationsController {

	@GetMapping("/show")
	public  String   showData() {
		return  "(Customer info will be displayed here ::welcome to call center";
	}
}