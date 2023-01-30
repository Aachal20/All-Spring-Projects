package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms //optional
public class BootJmsProj01ProducerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootJmsProj01ProducerAppApplication.class, args);
	}

}
