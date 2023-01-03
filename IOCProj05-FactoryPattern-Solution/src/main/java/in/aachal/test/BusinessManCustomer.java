package in.aachal.test;

import in.aachal.beans.BudgetCar;
import in.aachal.beans.Car;
import in.aachal.factory.CarFactory;

public class BusinessManCustomer {

	public static void main(String[] args) {
	 Car car = CarFactory.createCar("sports");
	car.drive();
	
	}

}
