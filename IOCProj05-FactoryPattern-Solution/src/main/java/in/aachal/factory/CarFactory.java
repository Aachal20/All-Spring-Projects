package in.aachal.factory;

import in.aachal.beans.BudgetCar;
import in.aachal.beans.Car;
import in.aachal.beans.SportsCar;

public class CarFactory {
	//Factory having factory pattern logic
   public static Car createCar(String type) {
	   if(type.equals("sports"))
		   return new SportsCar();
	   else if(type.equals("budget"))
		   return new BudgetCar();
	   else
		   throw new IllegalArgumentException("Invalid car type");
   }
}
