package com.nt.sender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.nt.model.ActorInfo;

@Component
public class ObjectMessageSender {

	@Autowired
	private JmsTemplate template;
	
	@Scheduled(cron="0/20 * * * * *")
	public void SendObjectDataAsMesage() {
		//preapre object
		ActorInfo actor = new ActorInfo(1001,"Ranvver" , "Mumbai");
		//send object as the message
		template.convertAndSend("objmq11" , actor);
		System.out.println("Object is send  as a message");
	}
}
