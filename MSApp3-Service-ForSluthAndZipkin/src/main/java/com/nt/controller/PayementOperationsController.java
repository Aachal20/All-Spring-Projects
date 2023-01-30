package com.nt.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class PayementOperationsController {


	@Autowired
	private RestTemplate template;

	Logger logger = LoggerFactory.getLogger(PayementOperationsController.class);

	@GetMapping("/payement")
	public String doPayement() {
		logger.info("Welcome to Payement  Module");
		return "Payement is Done ";
	}
}
