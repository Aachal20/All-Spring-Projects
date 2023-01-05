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
	   if(type.equals("dtdc"))
		   courier= new DTDC();
	   else if(type.equals("dhl"))
		  courier =  new DHL();
	   else
		   throw new IllegalArgumentException("Invalid type");
	   //set DCO to TCO
	   flip.setCourier(courier);
	   return flip;
   }
}
