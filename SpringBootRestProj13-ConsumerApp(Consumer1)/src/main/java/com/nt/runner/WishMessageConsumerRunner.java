package com.nt.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class WishMessageConsumerRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		//create Rest template class obj
		RestTemplate template = new RestTemplate();
		//process response
		System.out.println("=================Using getForEntity(-,-)==========================");
		//prepare service url or(base url)+ request path
		String serviceurl = "http://localhost:1010/wish/api/message";
		//consume the service using XXXForEntity(-) method
		ResponseEntity<String> responseEntity = template.getForEntity(serviceurl, String.class);

		System.out.println("response body/payload(output)::" +responseEntity.getBody());
		System.out.println("response status code::" +responseEntity.getStatusCode());
		System.out.println("response status code value::" +responseEntity.getStatusCodeValue());
		System.out.println("response header::" +responseEntity.getHeaders());

		System.out.println("===============Using getForObject(-,-)===========================");

		String res1 = template.getForObject(serviceurl, String.class);
		System.out.println("response content is ::" +res1);  //only response body
	
	}

}
