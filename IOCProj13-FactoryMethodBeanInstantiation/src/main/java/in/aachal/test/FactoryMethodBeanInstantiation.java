package in.aachal.test;

import java.io.Reader;
import java.util.Calendar;
import java.util.Properties;

import javax.sql.rowset.spi.XmlReader;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.stereotype.Component;

@Component
public class FactoryMethodBeanInstantiation {

	public static void main(String[] args) {
		//crete IOC container
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("in/aachal/cfgs/applicationContext.xml");
		
		//get spring bean class object
		Class clazz = factory.getBean("c1" , Class.class);
		System.out.println("claz object class name :: " +clazz.getClass()+  "  class object data" +clazz.toString());
		System.out.println("======================");
		
		Calendar calender  = factory.getBean("cal", Calendar.class);
		System.out.println("Calandar class name :: " +calender.getClass());
		System.out.println("======================");
		
		Properties props  = factory.getBean("props", Properties.class);
		System.out.println("Calandar class name :: " +props.getClass()+ "data ::" +props.toString());
		
		System.out.println("======================");
		String bean = factory.getBean("s1" , String.class);
		System.out.println("String object class name" +bean.getClass()+ " String class object data:: " +bean.toString());
		
		String bean1 = factory.getBean("s2" , String.class);
		System.out.println("String object class name" +bean1.getClass()+ " STring class object data:: " +bean1.toString());
		
		System.out.println("======================");
	}

}
