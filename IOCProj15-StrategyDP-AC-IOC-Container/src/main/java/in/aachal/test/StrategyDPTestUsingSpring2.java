package in.aachal.test;


import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import in.aachal.beans.Flipkart;


public class StrategyDPTestUsingSpring2 {

	public static void main(String[] args) {
		//create IOC container
		/*DefaultListableBeanFactory ctx = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(ctx);
		reader.loadBeanDefinitions("in/aachal/cfgss/applicationContext.xml");
		
		System.out.println("BF creation");*/
		
		//FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/main/java/in/aachal/cfgs/applicationContext.xml");
		//FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("in/aachal/cfgs/applicationContext.xml"); //here error
		
	    ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("in/aachal/cfgss/applicationContext.xml");
	   // ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get target class obj
		// Flipkart flip = ctx.getBean("flip" , Flipkart.class);
		 //invoke B method
		//String result =  flip.shopping(new String[]{ "Laptop", "ApplePhone"} , new float[] {55000.60f , 70000.36f});
		//System.out.println(result);
		 
	
	
	}

}
