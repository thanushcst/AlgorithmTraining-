package com.techinnoveta.java.basic.design.pattern.singleton;

public class Singleton {
	private static Singleton singleton;
	
	private Singleton(){
		
	}
	
	public static Singleton getInstance(){
		if(singleton == null){
			synchronized (singleton) {
				if(singleton == null){
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}
}