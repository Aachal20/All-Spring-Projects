package in.aachal.factory;

import in.aachal.beans.Courier;
import in.aachal.beans.DHL;
import in.aachal.beans.DTDC;
import in.aachal.beans.Flipkart;

public class FlipkartFactory {
	
   public static Flipkart  createFlipkart(String type) {
	   //create target class object
	   Flipkart flip = new Flipkart();
	   
	   Courier courier = null;
	   
	   if(type.equalsIgnoreCase("dtdc"))
		   courier= new DTDC();
	   else if(type.equalsIgnoreCase("dhl"))
		  courier =  new DHL();
	   else
		   throw new IllegalArgumentException("Invalid type");
	   //set DCO to TCO
	   flip.setCourie(courier);
	   return flip;
   }
}
