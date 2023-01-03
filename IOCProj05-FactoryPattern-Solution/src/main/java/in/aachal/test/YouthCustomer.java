package in.aachal.test;

import in.aachal.beans.Car;
import in.aachal.beans.SportsCar;
import in.aachal.factory.CarFactory;

public class YouthCustomer {

	public static void main(String[] args) {
		Car car = CarFactory.createCar("sports");
		car.drive();

	}

}
