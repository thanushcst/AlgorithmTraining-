package com.techinnoveta.java.basic.design.pattern.observer;

public class ObserverPatternImpl {

	public static void main(String[] args) {
		Mobile mobile = new Mobile();
		DeskTop deskTop = new DeskTop();
		
		Apple apple = new Apple();
		
		apple.registerObserver(mobile);
		apple.registerObserver(deskTop);
		
		for (int i = 0; i < 10; i++) {
			apple.setStockPrice((int) ((Math.random() * 101) + 1) );
		}

	}

}
