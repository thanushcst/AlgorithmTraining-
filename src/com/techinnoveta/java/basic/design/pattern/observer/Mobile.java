package com.techinnoveta.java.basic.design.pattern.observer;

public class Mobile implements Observer {

	@Override
	public void update(Stock stock) {
		System.out.println("Mobile Get updated - " + stock.getStockName() + " price is " + stock.getStockPrice());
	}

}
