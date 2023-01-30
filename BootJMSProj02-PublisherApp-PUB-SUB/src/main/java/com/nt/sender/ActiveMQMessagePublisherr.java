package com.nt.sender;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ActiveMQMessagePublisherr implements CommandLineRunner{

	@Autowired
	private JmsTemplate template;



	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		// Using LAMDA style anonymous inner class 
		template.send("topicaa1", ses ->
			ses.createTextMessage("From sender using PUB-SUB way " + new Date()));
		System.out.println("MEsage sent/published from pub-sub");
		
	}

}
