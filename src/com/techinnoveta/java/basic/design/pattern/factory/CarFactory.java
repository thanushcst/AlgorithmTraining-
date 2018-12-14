package com.techinnoveta.java.basic.design.pattern.factory;

public class CarFactory {
	public Car getInstance(CarType type){
		if(type.equals(CarType.TOYATO)){
			return new Toyata();
		} else if(type.equals(CarType.AUDI)){
			return new Audi();
		} else if(type.equals(CarType.BMW)){
			return new BMW();
		} else {
			return null;
		}
	}
}