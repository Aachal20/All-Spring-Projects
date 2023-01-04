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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Address;

import com.nt.model.Customer;

@RestController
@RequestMapping("/customer")
public class CustomerOperationsController {

	@PostMapping("/register")
	public ResponseEntity<String> saveCustomer(@RequestBody Customer cust){
		System.out.println("CustomerOperationsController.saveCustomer()");
		System.out.println(cust.toString());
		return new  ResponseEntity<String>(cust.toString(), HttpStatus.OK);
	}

	@GetMapping("/re")
	public String saveCustomer1(){
		System.out.println("CustomerOperationsController.saveCustomer()");
		return "Hi";
	}
}


/*{
    "cno": 101,
    "cname": "Raja",
    "compinesList": [
      { "name":"HCL" , "loc" : "MP" ,  "size":414},
      { "name":"HCL" , "loc" : "MP" ,  "size":414}
    ],
    "dob": "12-10-1855",
    "purchaseDate": "2021-05-02 17:11:22",
     "familyIds":[ {
        "Aadharno": 852254442547},
        {"PanNo": 52428578547
    }],
    "company": 
        {
        "houseNo": "1244FK",
        "streetName": "Dp",
        "loc": "hys",
        "pinCode": 15481
    }
}*/