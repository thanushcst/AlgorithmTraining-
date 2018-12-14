package com.techinnoveta.java.basic.design.pattern.singleton;

public class SingletonDesign {

	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		Singleton singleton_1 = Singleton.getInstance();
		System.out.println("INSTANCE ID - " + System.identityHashCode(singleton));
		System.out.println("INSTANCE ID - " + System.identityHashCode(singleton_1));
	}
}