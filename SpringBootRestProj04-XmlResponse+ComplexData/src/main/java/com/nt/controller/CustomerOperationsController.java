package com.nt.controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Company;
import com.nt.model.Customer;

@RestController
@RequestMapping("/customer")
public class CustomerOperationsController {


	/*@GetMapping("/report1")
	public ResponseEntity<Customer> showCustomerData(){
		Customer cust = new Customer(101,"Raja" , "Hyderbad" , 5266);
		return new  ResponseEntity<Customer>(cust,HttpStatus.OK);
	}
	 */

	@GetMapping("/report1")
	public ResponseEntity<Customer> showCustomerAllData(){
		Customer cust=new Customer(101,"Raja" ,"HYd", 8514124L ,new String[] {"red","pink","Blue"},List.of("10th", "BCA"), Set.of(999999999L ,888888888L),Map.of("AadharNo",852254442547L,"PanNo" , 52428578547L),new Company("HCL" ,"Develop" , "Electorics" , 581));
		return new  ResponseEntity<Customer>(cust,HttpStatus.OK);
	}
}
