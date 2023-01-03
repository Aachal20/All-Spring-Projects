package in.aachal.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.aachal.beans.Printer;


public class App 
{
	public static void main( String[] args )
	{


		Printer p1 = Printer.getInstance();  
		Printer p2 = Printer.getInstance();
		System.out.println(p1.hashCode()+"  " +p2.hashCode());

		System.out.println("---------------------------------");
		System.out.println("p1==p2 ::::: ? " +(p1==p2));//true


	}


}



/*
public class App extends Thread
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        App aa = new App();
        aa.start();
       Printer p1 = Printer.getInstance();
       Printer p2 = Printer.getInstance();
       Printer p3 = Printer.getInstance();
       System.out.println(p1==p2);
      // System.out.println(p2==p3);

    }

    public void run() {
    	  Printer p1 = Printer.getInstance();
    	 Printer p2 = Printer.getInstance();
    	  System.out.println(p1==p2);
	}
}
 */