package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MsProj05EmpRestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsProj05EmpRestServiceApplication.class, args);
	}

}
