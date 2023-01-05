package in.aachal.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import in.aachal.beans.WishMessageGenerator;

public class AppTest {

	public static void main(String[] args) {
		//Locate and hold spring bean cfg file
		
		//create IOC container
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("in/aachal/cfgs/applicationContext.xml");
		
		WishMessageGenerator generator = ctx.getBean("wmg" ,WishMessageGenerator.class);
		
		String msg = generator.generateMessage("Aachal");
		
		System.out.println(msg);
		
		ctx.close();
	}

}
