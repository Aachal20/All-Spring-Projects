package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.VotiingElligibilityChecking;

public class BeanLifeCycleTest {

	public static void main(String[] args) {
	//get IOC container
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get spring bean class obbj
		VotiingElligibilityChecking bean = ctx.getBean("voting",VotiingElligibilityChecking.class);
		//invoke b method
		String checkVotingCrieteria = bean.checkVotingCrieteria();
		System.out.println(checkVotingCrieteria);

		ctx.close();
	}

}
