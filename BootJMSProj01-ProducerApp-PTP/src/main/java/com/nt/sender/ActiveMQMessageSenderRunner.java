package com.nt.sender;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ActiveMQMessageSenderRunner {

	@Autowired
	private JmsTemplate template;


	//@Override
	//public void run(String... args) throws Exception {
     //System.out.println("ActiveMQMessageSenderRunner.run()");
		//@Scheduled(cron = "*/10  * * * * *")
		//public void sendMesage() {

		/*// Using anonymous inner claass logic
			template.send("AATestMQ1", new MessageCreator() {

				@Override
				public Message createMessage(Session ses) throws JMSException {
					Message message = ses.createTextMessage("dddd);
					return message;
				}

			}
			);*/

     @Scheduled(cron = "*/10 * * * * *")
   public void sendMesage() {
		// Using LAMDA style anonymous inner class 
		template.send("AACHAL1MQ", ses ->{
			System.out.println("ActiveMQMessageSenderRunner.sendMesage()::Message send");
			return ses.createTextMessage("From sender Application at this date ::=>  " + new Date());
		});

	}

}


