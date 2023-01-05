package com.nt.beans;

import java.util.Date;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class VotiingElligibilityChecking implements InitializingBean  ,DisposableBean{
  
	//bean properties
	private String name;
	private int age;
	private String addrs;
	private Date verifiedOn;
	
	
	//setter method for setter Injection
	public void setName(String name) {
		System.out.println("VotiingElligibilityChecking.setName=(-)");
		this.name = name;
	}
	public void setAge(int age) {
		System.out.println("VotiingElligibilityChecking.setAge(-)");
		this.age = age;
	}
	public void setAddrs(String addrs) {
		System.out.println("VotiingElligibilityChecking.setAddrs(-)");
		this.addrs = addrs;
	}
	
	
	/*//custom init method
	public void myinit() {
		System.out.println("VotiingElligibilityChecking.myinit()");
		//intialize left over properties
		verifiedOn = new Date();
		
		if(addrs==null)
			addrs="no provided";
		
		//validation logic
		if(name==null)
			throw new IllegalArgumentException("must pass name");
		
		else if(age<=20 || age>=85)
			throw new IllegalArgumentException("person age must be in range of 20 to 85");
	}*/
	
	//b method
	public String checkVotingCrieteria() {
	
	if(age<18)
		return "Mr./Miss/Mrs."+name+"("+age+")"+" belongs to"+addrs+ "is not elligible for voting --> verfied on::"+verifiedOn;
	else
		return "Mr./Miss/Mrs."+name+"("+age+")"+" belongs to"+addrs+ "is elligible for voting --> verfied on::"+verifiedOn;
	
	}
		
	/*	
		//custom init method
			public void mydestroy() {
				System.out.println("VotiingElligibilityChecking.mydestroy()");
				//nullyfy bean property
				name=null;
				age=0; 
				addrs=null;
				verifiedOn=null;
			}*/
	
	
		@Override
		public void destroy() throws Exception {
			System.out.println("VotiingElligibilityChecking.destroy()");
			//nullyfy bean property
			name=null;
			age=0; 
			addrs=null;
			verifiedOn=null;
			
		}
		@Override
		public void afterPropertiesSet() throws Exception {
			System.out.println("VotiingElligibilityChecking.init()");
			//intialize left over properties
			verifiedOn = new Date();
			
			if(addrs==null)
				addrs="no provided";
			
			//validation logic
			if(name==null)
				throw new IllegalArgumentException("must pass name");
			
			else if(age<=20 || age>=85)
				throw new IllegalArgumentException("person age must be in range of 20 to 85");
			
		}
		
}
