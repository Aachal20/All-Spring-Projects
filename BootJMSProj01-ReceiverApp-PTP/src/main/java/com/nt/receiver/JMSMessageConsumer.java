package com.nt.receiver;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class JMSMessageConsumer {

	@JmsListener(destination = "AACHAL1MQ")
	public void readMessage(String text) {
		System.out.println("Recived Message HERE in receiver ::=> " +text);
	}
       

}
