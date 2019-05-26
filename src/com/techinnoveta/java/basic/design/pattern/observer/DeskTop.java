package com.techinnoveta.java.basic.design.pattern.observer;

public class DeskTop implements Observer {

	@Override
	public void update(Stock stock) {
		System.out.println("DeskTop Get updated - " + stock.getStockName() + " price is " + stock.getStockPrice());
	}

}
