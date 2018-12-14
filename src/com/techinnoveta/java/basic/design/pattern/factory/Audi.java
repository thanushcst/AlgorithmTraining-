package com.techinnoveta.java.basic.design.pattern.factory;

public class Audi implements Car {
	private static String name = "AUDI";

	public Audi() {
		super();
		System.out.println("Vehile details - " + name);
	}

	@Override
	public void cost(double basePrice, double addOnPrice) {
		System.out.println("Price - " + (basePrice + addOnPrice));
	}

	@Override
	public void maxSpeed(double engineSpeed, double veriableSpeed) {
		System.out.println("Max Speed - " + (engineSpeed + veriableSpeed));
	}

}