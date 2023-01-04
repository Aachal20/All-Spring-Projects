package com.nt.runner;

import java.util.Map;

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

		//prepare service url or(base url)+ request path
		String serviceurl = "http://localhost:1010/wish/api/message/101/Aachal";

		//consume the service using XXXForEntity(-) method
		ResponseEntity<String> responseEntity = template.getForEntity(serviceurl, String.class);

		//process response
		System.out.println("response body/payload(output)::" +responseEntity.getBody());
		System.out.println("response status code::" +responseEntity.getStatusCode());
		System.out.println("response status code value::" +responseEntity.getStatusCodeValue());
		System.out.println("response header::" +responseEntity.getHeaders());

		System.out.println("==========================================");

		String res1 = template.getForObject(serviceurl, String.class);
		System.out.println("response content is ::" +res1);  //only response body


		System.out.println("******************************************************************************");
		//create Rest template class obj
		RestTemplate template1 = new RestTemplate();
		//prepare service url or(base url)+ request path
		String serviceurl1 = "http://localhost:1010/wish/api/message/{id}/{name}";
		//consume the service using XXXForEntity(-) method
		ResponseEntity<String> responseEntity1 = template1.getForEntity(serviceurl1, String.class,Map.of("id" ,1001 , "name", "Aachal"));//Map object to pass path variable values
		//process response
		System.out.println("response body/payload(output)::" +responseEntity1.getBody());
		System.out.println("response status code::" +responseEntity1.getStatusCode());
		System.out.println("response status code value::" +responseEntity1.getStatusCodeValue());
		System.out.println("response header::" +responseEntity1.getHeaders());

		System.out.println("==========================================");

		String res2 = template.getForObject(serviceurl1, String.class,125,"rajesh"); //var args to pass path variable values
		System.out.println("response content is ::" +res2);  //only response body
		
	}
}
