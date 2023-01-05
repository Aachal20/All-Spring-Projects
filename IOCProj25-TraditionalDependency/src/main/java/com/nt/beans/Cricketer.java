package com.nt.beans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Cricketer {

	// HAS_A property of Dependent class

	public Cricketer() {
		System.out.println("Cricketer.Cricketer()::0-param constru");
	}

	public void bowling(){
		System.out.println("Cricketer.bowling()");
	}
	
	public void batting(){
		System.out.println("Cricketer.batting()");
		//create additional IOC container
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//perform dependency lookup method to get Depend class object
		Bat bean = ctx.getBean("bat",Bat.class); 
		int scoreRun = bean.scoreRun();
		System.out.println("Cricket batting score is:" +scoreRun);
	}
	
	public void fielding(){
		System.out.println("Cricketer.fielding()");	
	}
	
	public void wicketKeeping(){
		System.out.println("Cricketer.wicketKeeping()");
	}
}
