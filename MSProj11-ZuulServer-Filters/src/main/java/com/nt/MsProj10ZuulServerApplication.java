package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class MsProj10ZuulServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsProj10ZuulServerApplication.class, args);
	}

}
