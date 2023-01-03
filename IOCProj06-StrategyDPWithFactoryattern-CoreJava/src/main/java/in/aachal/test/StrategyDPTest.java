package in.aachal.test;


import in.aachal.beans.Flipkart;
import in.aachal.factory.FlipkartFactory;

public class StrategyDPTest {

	public static void main(String[] args) {
		
		
	 try {
		//create target class obj
		 Flipkart flip = FlipkartFactory.createFlipkart("dtdc");
		String result =  flip.shopping(new String[]{ "Laptop", "ApplePhone"} , new float[] {55000.60f , 70000.36f});
		System.out.println(result);
		 
	 }
	 catch(Exception e){
		 e.printStackTrace();
	 }
	
	}

}
