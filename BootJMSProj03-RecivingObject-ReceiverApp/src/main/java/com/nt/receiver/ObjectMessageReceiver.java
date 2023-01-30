package com.nt.receiver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.nt.model.ActorInfo;

@Component
public class ObjectMessageReceiver {

	@Autowired
	private JmsTemplate template;
	
@JmsListener(destination = "objmq11")
	public void ConsumeObjectDataAsMesage(ActorInfo  obj) {
		
	System.out.println("Recived obj data"+obj);
	}
}
