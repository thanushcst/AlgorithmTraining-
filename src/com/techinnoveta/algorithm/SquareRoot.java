package com.techinnoveta.algorithm;

public class SquareRoot {

	public static void main(String[] args) {
		System.out.println(squareRoot(27));
	}
	
	public static double squareRoot(int value){
		double t = 0;
		double squareRoot = value / 2;
		while((t - squareRoot) != 0){
			t = squareRoot;
			squareRoot = (t + (value / t)) / 2;
		}
		return squareRoot;
	}
}