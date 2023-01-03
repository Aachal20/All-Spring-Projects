package in.aachal.test;

import java.util.Calendar;
import java.util.Properties;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException {
		Class c1 = Class.forName("java.util.Date");
		System.out.println("class name " +c1.getClass());
		
		System.out.println("=========================");
		Calendar cal = Calendar.getInstance();
		System.out.println("calendar class name ::" +cal.getClass()+ " calendare class data::" +cal.toString());
		System.out.println("=========================");
		
	
	Properties properties = System.getProperties();
	System.out.println("props class name" +properties.getClass()+ "properties object data " +properties.toString());
	}

}
