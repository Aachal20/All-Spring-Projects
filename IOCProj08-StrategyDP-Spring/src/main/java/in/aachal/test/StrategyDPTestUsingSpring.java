package in.aachal.test;


import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;

import in.aachal.beans.Flipkart;


public class StrategyDPTestUsingSpring {

	public static void main(String[] args) {
		//create IOC container
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("in/aachal/cfgs/applicationContext.xml");


		//get target class obj
		Flipkart flip = factory.getBean("flip" , Flipkart.class);
		//invoke B method
		String result =  flip.shopping(new String[]{ "Laptop", "ApplePhone"} , new float[] {55000.60f , 70000.36f});
		System.out.println(result);
	}

}
