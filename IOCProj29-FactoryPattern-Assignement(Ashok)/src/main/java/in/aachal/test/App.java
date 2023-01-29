package in.aachal.test;

import in.aachal.beans.Octagone;
import in.aachal.beans.Polygone;
import in.aachal.factory.PolygoneFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Octagone oct = new Octagone();
    	String ss= oct.getType("sq");
    	System.out.println(ss);
       
      Polygone poly = PolygoneFactory.getInstance("sq");
      System.out.println(poly.getType("sq"));
      
       Polygone poly1 = PolygoneFactory.getInstance("rect");
       System.out.println(poly1.getType("sq"));
       
    }
}
