package com.nt.runner;


import java.util.Map;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class TouristInfoConsumer_Posting_JSONData_CMR implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
	
	
		System.out.println("=================Touriet API Calling=========================");
	//create Rest template class obj
	RestTemplate template = new RestTemplate();
	
	//prepare service url or(base url)+ request path
	String serviceurl = "http://localhost:1010/wish/api/register";
	
	//prepare HttpHeaders
	HttpHeaders hedder = new HttpHeaders();
	hedder.setContentType(MediaType.APPLICATION_JSON);//optional to specify while sending JSON data
	
	//prepare HttpRequest as HttpEntity having headers , body
	String body = " {\"tid\" :10001 , \"tname\" :\"raja\" , \"startPlace\":\"Nagpur\" , \"destiPlace\" : \"goa\"}";
	
	HttpEntity<String> request= new HttpEntity<>(body , hedder);
	
	//send POST mode request to consume rest api service
	ResponseEntity<String> responseEntity = template.postForEntity(serviceurl,request, String.class);
	
	//process received  response
	System.out.println("response body/payload(output)::" +responseEntity.getBody());
	System.out.println("response status code::" +responseEntity.getStatusCode());
	System.out.println("response status code value::" +responseEntity.getStatusCodeValue());
	System.out.println("response header::" +responseEntity.getHeaders());
	
	System.out.println("==========================================");
	
	//String res1 = template.postForObject(serviceurl, request,String.class); 
	//System.out.println("response content is ::" +res1);  //only response body
	}

}
