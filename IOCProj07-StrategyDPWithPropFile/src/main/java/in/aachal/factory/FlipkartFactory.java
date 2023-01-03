/*package in.aachal.factory;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

import in.aachal.beans.Courier;
import in.aachal.beans.DHL;
import in.aachal.beans.DTDC;
import in.aachal.beans.Flipkart;

public class FlipkartFactory {
	
	 public static Flipkart  createFlipkart(String type) {
	   //create target class object
	   Flipkart flip = new Flipkart();
	   Courier courier = null;
	   if(type.equals("dtdc"))
		   courier= new DTDC();
	   else if(type.equals("dhl"))
		  courier =  new DHL();
	   else
		   throw new IllegalArgumentException("Invalid type");
	   //set DCO to TCO
	   flip.setCourie(courier);
	   return flip;
	 }
	
	private static Properties props;
	static {
		System.out.println("FlipkartFactory :: Static BLock");
		try(
				//Load Properties file
				FileInputStream fis = new FileInputStream("src/main/java/in/aachal/commons/info.properties")){
			//Load Properties file content to java.util.Properties class object
			props = new Properties();
			props.load(fis);
		}//try
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static Flipkart createFlipkart() throws Exception {

		//Create target class object
		Flipkart fpkt = new Flipkart();;

		//Load dependent class
		Class c = Class.forName(props.getProperty("dependent.comp"));
		
		//Create object using reflection API
		Constructor cons[]=c.getDeclaredConstructors();
		
		//Create object
		Courier courier = (Courier) cons[0].newInstance();

		//Set dependent class object to target class object
		fpkt.setCourier(courier);
		return fpkt;
	}
}

*/