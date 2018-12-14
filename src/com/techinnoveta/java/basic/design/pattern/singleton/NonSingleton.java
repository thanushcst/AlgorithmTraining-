package com.techinnoveta.java.basic.design.pattern.singleton;

public class NonSingleton {	
	public static NonSingleton getInstance(){
		return new NonSingleton();
	}
}