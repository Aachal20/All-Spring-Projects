package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.VotiingElligibilityChecking;

public class BeanLifeCycleTest2 {

	public static void main(String[] args) {
	//get BeanFactory IOC container
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//get spring bean class obbj
		VotiingElligibilityChecking bean = factory.getBean("voting",VotiingElligibilityChecking.class);
		//invoke b method
		String checkVotingCrieteria = bean.checkVotingCrieteria();
		System.out.println(checkVotingCrieteria);

		//destroy singletones
		factory.destroySingletons();
		
	}

}
