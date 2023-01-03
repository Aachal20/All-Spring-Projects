package in.aachal.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.aachal.beans.Printer;

//for evry ID two object are created ,,,,Here singletone behaviour  is break
public class App3
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
	
	
		//problem-here Singletone java class behaviour  is breaks
		//Two diff bean id gives two diff obj hashcode ....Are u clear aachal?? yes
	}


}