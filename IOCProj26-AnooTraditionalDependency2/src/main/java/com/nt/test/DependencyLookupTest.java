package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Bat;
import com.nt.beans.Cricketer;

public class DependencyLookupTest {

	public static void main(String[] args) {
		System.out.println("main start--------------");
		//create additional IOC container
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//perform dependency lookup method to get Depend class object
		Cricketer player = ctx.getBean("crickt",Cricketer.class);
		player.bowling();
		player.batting();
		player.wicketKeeping();
		System.out.println("main end---------------");
	}

}
