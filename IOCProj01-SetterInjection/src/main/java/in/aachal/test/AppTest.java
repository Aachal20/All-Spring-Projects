package in.aachal.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import in.aachal.beans.WishMessageGenerator;

public class AppTest {

	public static void main(String[] args) {
		//Locate and hold spring bean cfg file name and location
		FileSystemResource res=new FileSystemResource("src/main/resources/applicationContext.xml");
		//create IOC container
		XmlBeanFactory factory = new XmlBeanFactory(res);
		//ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("in/aachal/cfgs/applicationContext.xml");
		//get raget class object
		WishMessageGenerator generator = (WishMessageGenerator) factory.getBean("wmg");
		//invoke the BM
		String msg = generator.generateMessage("Aachal");
		System.out.println("Wish MEssage is :: "+msg);
	}

}
