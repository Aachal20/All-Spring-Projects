package com.nt.beans;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("voting")
@PropertySource("com/nt/commons/info.properties")
public class VotiingElligibilityChecking  {
  
	//bean properties
	@Value("${per.name}")
	private String name;
	@Value("${per.age}")
	private int age;
	@Value("${per.addrs}")
	
	private String addrs;
	private Date verifiedOn;
	
	
	
	
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
		//custom destroy  method
			public void mydestroy() {
				System.out.println("VotiingElligibilityChecking.mydestroy()");
				//nullyfy bean property
				name=null;
				age=0; 
				addrs=null;
				verifiedOn=null;
			}*/
	
	
	@PreDestroy
		public void custdestroy() throws Exception {
			System.out.println("VotiingElligibilityChecking.custdestroy()");
			//nullyfy bean property
			name=null;
			age=0; 
			addrs=null;
			verifiedOn=null;
			
		}
		
		@PostConstruct
		public void custInit() throws Exception {
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
