package com.nt.controller;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class MessageRenderController {

	@GetMapping("/generate")
	public ResponseEntity<String> generateMessage(){
		 //get Sys date and time
		   LocalDateTime ldt= LocalDateTime.now();
		    //get current hour of the day  (response body)
		   int hour=ldt.getHour();
		   String body=null;
		   if(hour<12)
			    body="Good Morning";
		   else if(hour<16)
			   body="Good AfterNoon";
		   else if(hour<20)
			   body="Good Evening";
		   else 
			   body="Good Night";
		   // response status
		   HttpStatus status = HttpStatus.OK;
		   //create REsponseEntity object
		   ResponseEntity<String> response = new ResponseEntity<String>(body,status);
		   return response;
	}
	
}
