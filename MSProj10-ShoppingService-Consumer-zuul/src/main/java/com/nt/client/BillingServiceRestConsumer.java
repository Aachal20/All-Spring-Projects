package com.nt.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class BillingServiceRestConsumer {
	
	/*@Autowired
	private  DiscoveryClient  client;  //comes through  AutoConfiguration
	
	public  String  getBillingInfo() {
		  //find and get SErviceInstances  of Producer by using Service Id
		 List<ServiceInstance>  listSI=client.getInstances("Billing-Service");
		 // use  first ServiceInstance from the List of Instances
		  ServiceInstance  SI=listSI.get(0);
		  //get Producer MS URI  and make it  as URL
		  String url=SI.getUri()+"/billing/info";
		  // create RestTemplate object
		  RestTemplate  template=new RestTemplate();
		  // invoke producer MS service method or operation by generating Http call
		  String  resp=template.getForObject(url,String.class);
		   return resp;
	}//method
	*/
	
	@Autowired
	private  LoadBalancerClient  client;  //comes through  AutoConfiguration
	
	public  String  getBillingInfo() {
		  //get Less LoadFatory Service Insntance
		ServiceInstance  SI=client.choose("Billing-Service");
		  //get Producer MS URI  and make it  as URL
		  String url=SI.getUri()+"/billing/info";
		  // create RestTemplate object
		  RestTemplate  template=new RestTemplate();
		  // invoke producer MS service method or operation by generating Http call
		  String  resp=template.getForObject(url,String.class);
		   return resp;
	}//method
}//class