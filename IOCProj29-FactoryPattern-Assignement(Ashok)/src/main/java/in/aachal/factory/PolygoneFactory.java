package in.aachal.factory;

import in.aachal.beans.Octagone;
import in.aachal.beans.Pentagon;
import in.aachal.beans.Polygone;
import in.aachal.beans.Rectangle;
import in.aachal.beans.Square;

public class PolygoneFactory {

	public static Polygone getInstance(String sides){
		if(sides.equalsIgnoreCase("rect"))
			return new Rectangle();
		else if(sides.equals("sq"))
			return new Square();
		else if(sides.equals("penta"))
			return new Pentagon();
		else if(sides.equals("octa"))
			return new  Octagone();
		else
			throw new IllegalArgumentException("Invalid String");
		

	}
}
