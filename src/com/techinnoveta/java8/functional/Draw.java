package com.techinnoveta.java8.functional;

@FunctionalInterface
public interface Draw {
	void draw();
	default void print(){
		System.out.println("PRINT");
	}
	
	static void click(){
		System.out.println("CLICK");
	}

}
