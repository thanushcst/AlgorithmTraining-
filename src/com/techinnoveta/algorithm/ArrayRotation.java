package com.techinnoveta.algorithm;

public class ArrayRotation {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 }; 
		int rotationArr[] = arrayRotation(arr);
		for (int i : rotationArr) {
			System.out.println(i);
		}
	}
	
	public static int[] arrayRotation(int[] array){
		int temp = 0;
		for (int i = 0; i < (array.length / 2 ); i++) {
			temp = array[i];
			array[i] = array[array.length -(i + 1)];
			array[array.length -(i + 1)] = temp;
		}
		
		return array;
	}
}