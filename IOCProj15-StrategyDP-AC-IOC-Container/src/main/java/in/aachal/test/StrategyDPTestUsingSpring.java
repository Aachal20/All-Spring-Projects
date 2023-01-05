package in.aachal.test;


import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import in.aachal.beans.Flipkart;


public class StrategyDPTestUsingSpring {

	public static void main(String[] args) {
		//create IOC container
		/*DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("in/aachal/cfgs/applicationContext.xml");
		 */

		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/main/java/in/aachal/cfgss/applicationContext.xml");
		//FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("in/aachal/cfgss/applicationContext.xml"); //here error


		//get target class obj
		Flipkart flip = ctx.getBean("flip" , Flipkart.class);
		//invoke B method
		String result =  flip.shopping(new String[]{ "Laptop", "ApplePhone"} , new float[] {55000.60f , 70000.36f});
		System.out.println(result);



	}

}
