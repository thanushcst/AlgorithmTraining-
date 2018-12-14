package com.techinnoveta.java.basic.design.pattern.factory;

public class FactoryDesign {

	public static void main(String[] args) {
		CarFactory carFactory = new CarFactory();
		Car car = carFactory.getInstance(CarType.TOYATO);
		car.cost(2000, 300);
	}
}