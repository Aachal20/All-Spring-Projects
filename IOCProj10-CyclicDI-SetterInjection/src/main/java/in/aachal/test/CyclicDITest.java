package in.aachal.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import in.aachal.beans.A;



public class CyclicDITest {

	public static void main(String[] args) {
		//create IOC container
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("in/aachal/cfgs/applicationContext.xml");


		//get target class obj
		A a = factory.getBean("a1" , A.class);
		System.out.println(a);
		System.out.println("==========================");

		


	}
}
