package com.techinnoveta.java.basic.design.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Stock implements Observable {
	private String stockName;
	private int stockPrice;

	List<Observer> observersList;

	public Stock() {
		observersList = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer observer) {
		if (observer != null) {
			observersList.add(observer);
		}
	}

	@Override
	public void notifyAllObservers() {
		for (Observer observer : observersList) {
			observer.update(this);
		}
	}

	@Override
	public void removeObserver(Observer observer) {
		if (observer != null) {
			observersList.remove(observer);
		}
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockPrice(int stockPrice) {
		this.stockPrice = stockPrice;
		this.notifyAllObservers();
	}

	public int getStockPrice() {
		return stockPrice;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

}
