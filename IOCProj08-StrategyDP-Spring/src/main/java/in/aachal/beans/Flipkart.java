package in.aachal.beans;

import java.util.Arrays;
import java.util.Random;

public class Flipkart {
	//HAS-A 
	private Courier courier;
	
	public Flipkart() {
		System.out.println("Flipkart.Flipkart():: 0-param constructor");
	}

	//setter method for setter injection
	public void setCourier(Courier courier) {
		System.out.println(courier);
		this.courier = courier;
	}

	
	public String shopping(String items[] , float prices[]) {
		System.out.println("Inside Flipkart Shopping Method");
		float finalBill = 0.0f;
		for(int i = 0; i<items.length;i++) {
			finalBill = finalBill+prices[i];
		}
		int oid = new Random().nextInt(100);
		String status = courier.deliver(oid);
		String result = Arrays.toString(items)+ "this item u purchase with this prices" +Arrays.toString(prices)+ "The customer order Id is "+oid; 
	     return result;
	}

	
}
