package in.aachal.factory;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

import in.aachal.beans.Courier;
import in.aachal.beans.Flipkart;

public class FlipKartFactory1 {

	//Use Prop class obj to collect prop from info.prop file
	private static Properties props;

	static {
		System.out.println("FlipKartFactory1.Static Block");
		try(
				//load prop file
				FileInputStream fs = new FileInputStream("src/main/java/in/aachal/commons/info.properties");){
			//load prop file content to java.util.prop class object
			props = new Properties();
			props.load(fs);
		}//try
		catch(Exception e ) {
			e.printStackTrace();
		}
	}//SB

	//SF pattern supporting Factory pattern
	public static  Flipkart createFlipkart() throws Exception {
		//create target class obj
		Flipkart flip = new Flipkart();
		//get Dept class ref vari
		Courier courier = null;

		//load dependent class object
		Class c = Class.forName(props.getProperty("dependent.comp"));
		//crete the obj of laoded class using refl API
		Constructor cons[] = c.getDeclaredConstructors();
		courier = (Courier) cons[0].newInstance();
		//set DCO to TcO
		flip.setCourier(courier);
		return flip;
	}

}
