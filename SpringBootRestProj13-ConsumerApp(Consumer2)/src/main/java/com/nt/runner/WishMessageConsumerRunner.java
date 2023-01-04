package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class WishMessageConsumerRunner implements CommandLineRunner {

	@Autowired
	private RestTemplate template;
	
	//collecting url from properties file(Loose Coupling in Url)
	@Value("${service.url}")
	private String serviceUrl;
	
	@Override
	public void run(String... args) throws Exception {
		
		//consume the service using XXXForEntity(-) method
		ResponseEntity<String> responseEntity = template.getForEntity(serviceUrl, String.class);
		
		//process response
		System.out.println("response body/payload(output)::" +responseEntity.getBody());
		System.out.println("response status code::" +responseEntity.getStatusCode());
		System.out.println("response status code value::" +responseEntity.getStatusCodeValue());
		System.out.println("response header::" +responseEntity.getHeaders());
	}

}
