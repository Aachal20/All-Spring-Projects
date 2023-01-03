package in.aachal.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.aachal.beans.Printer;

//for evry ID two object are created ,,,,Here singletone behaviour  is break
public class App2
{
	public static void main( String[] args )
	{
		ClassPathXmlApplicationContext ctx =new ClassPathXmlApplicationContext("in/aachal/cfgs/applicationContext.xml");

		Printer p1 = ctx.getBean("p1" ,Printer.class);
		Printer p2 = ctx.getBean("p1" ,Printer.class);
		System.out.println(p1.hashCode()+"  " +p2.hashCode());   //gives same hashcode
		System.out.println(p1==p2);                                //give true
	}


}