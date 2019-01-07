package com.techinnoveta.java8.functional;

@FunctionalInterface
interface DrawInterface {
	void draw();

	default void print() {
		System.out.println("PRINT");
	}

	static void click() {
		System.out.println("CLICK");
	}

	default void click_test() {
		System.out.println("CLICK");
	}
}

public class Draw {
	public static void main(String[] args) {
		DrawInterface drawInterface = new DrawInterface() {
			
			@Override
			public void draw() {
				// TODO Auto-generated method stub
				
			}
		};
	}
}
