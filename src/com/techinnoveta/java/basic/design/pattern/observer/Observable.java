package com.techinnoveta.java.basic.design.pattern.observer;

public interface Observable {
	public void registerObserver(Observer observer);
	public void notifyAllObservers();
	public void removeObserver(Observer observer);

}
