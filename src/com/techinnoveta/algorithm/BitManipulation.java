package com.techinnoveta.algorithm;

public class BitManipulation {

	public static void main(String[] args) {
		System.out.println(checkTwoTothePower(256));
	}
	
	public static boolean checkTwoTothePower(int value){
		int n = 2;
		while(n < value) {
			n = n * 2;
			if(value == n) {
				return true;
			}
		}
		
		return false;
	}
}