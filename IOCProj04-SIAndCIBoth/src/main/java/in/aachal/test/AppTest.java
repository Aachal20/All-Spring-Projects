package in.aachal.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import in.aachal.beans.WishMessageGenerator;

public class AppTest {

	public static void main(String[] args) {
		//Locate and hold spring bean cfg file
		FileSystemResource res=new FileSystemResource("src/main/resources/in/aachal/cfgs/applicationContext.xml");
		//ClassPathResource res = new ClassPathResource("in/aachal/cfgs/applicationContext.xml");
		//ClassPathResource res = new ClassPathResource("applicationContext.xml");
		//create IOC container
		XmlBeanFactory factory=new XmlBeanFactory(res);
	
		// WishMessageGenerator generator = (WishMessageGenerator) factory.getBean("wmg");
		Object obj = factory.getBean("wmg");
		 WishMessageGenerator generator =  (WishMessageGenerator)obj;
		String msg = generator.generateMessage("Aachal");
		System.out.println(msg);
		
	}

}
