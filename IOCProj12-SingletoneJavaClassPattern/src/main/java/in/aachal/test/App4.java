package in.aachal.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.aachal.beans.Printer;

//for evry ID two object are created ,,,,Here singletone behaviour  is break
public class App4
{
	public static void main( String[] args )
	{
		ClassPathXmlApplicationContext ctx =new ClassPathXmlApplicationContext("in/aachal/cfgs/applicationContext.xml");

		System.out.println("===========================");
		Printer p1 = ctx.getBean("p1" ,Printer.class);
		Printer p2 = ctx.getBean("p1" ,Printer.class);
		System.out.println(p1.hashCode()+"  " +p2.hashCode());   //gives same hashcode
		System.out.println(p1==p2);                                //give true same SP bean id used

		System.out.println("==============================");

		Printer p3 = ctx.getBean("p2" ,Printer.class);
		Printer p4 = ctx.getBean("p2" ,Printer.class);
		System.out.println(p3.hashCode()+"  " +p4.hashCode());   //gives same hashcode
		System.out.println(p3==p4);    //give true same Bean id used two times

		//This is a solution
		//All Sp bean object gives two same obj hashcode (Even Ids are diff beacuse here they create object of Single Java class
		//using Static Factory Method)....So everytime generte same obj..... Aachal are cleared???...........yes.......
	}


}