package in.aachal.test;


import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import in.aachal.beans.WishMessageGenerator;

public class MainAppTest {

	public static void main(String[] args) {
		
		//create ApplicationContext (IOC) container
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("in/aachal/cfgs/applicationContext.xml");
		
		WishMessageGenerator generator = ctx.getBean("wmg" ,WishMessageGenerator.class);
		
		String msg = generator.generateMessage("Aachal");
		
		System.out.println(msg);
		
		ctx.close();
	}

}
