package in.aachal.test;


import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import in.aachal.beans.Flipkart;


public class StrategyDPTestUsingSpring1 {

	public static void main(String[] args) {
		//create IOC container
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("in/aachal/cfgss/applicationContext.xml");
		//ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");  //make it as a source folder
		//get target class obj
		// Flipkart flip = ctx.getBean("flip" , Flipkart.class);
		//invoke B method
		//String result =  flip.shopping(new String[]{ "Laptop", "ApplePhone"} , new float[] {55000.60f , 70000.36f});
		//System.out.println(result);



	}

}
