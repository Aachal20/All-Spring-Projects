package com.nt.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class BillingOperationsController {

	
	@Autowired
	private RestTemplate template;
	
	Logger logger = LoggerFactory.getLogger(BillingOperationsController.class);
	
	@GetMapping("/billing")
	public String doBilling() {
		logger.info("Welcome to Billing Module");
		//commu with payementService
		String resp = template.getForObject("http://localhost:9093/payement", String.class);
		logger.info("Come back to Billing module"+resp);
		return "billing is done" +resp;
	}
}
