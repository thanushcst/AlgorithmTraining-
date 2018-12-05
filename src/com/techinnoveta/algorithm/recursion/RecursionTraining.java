package com.techinnoveta.algorithm.recursion;

import java.util.Arrays;

public class RecursionTraining {
	public static void main(String args[]) {
		System.out.println("fibonacci series for length 6 is " + fibonacci(6));
		System.out.println("revrese " + revrese("dinesh"));
		int[] sort = { 34, 42, 54, 78, 5, 8, 3, 1, 77 };
		sort = bubbleSort(sort);
		System.out.println("bubbleSort " + Arrays.toString(sort));
		System.out.println(revrese("T"));
		int[] arr = { 19, 32, 11, 23 };
		arrayMinimum(arr);
	}

	public static int arrayMinimum(int[] inputArray) {
		int indexOfMinimum = 0;
		for (int i = 1; i < inputArray.length; i++) {
			if (inputArray[i] < inputArray[indexOfMinimum]) {
				indexOfMinimum = i;
			}
		}
		System.out.println(inputArray[indexOfMinimum]);
		return inputArray[indexOfMinimum];
	}

	public static int fibonacci(int number) {
		if (number < 1) {
			throw new IllegalArgumentException("Invalid argument for Fibonacci series: " + number);
		}
		if (number == 1 || number == 2) {
			return 1;
		}
		System.out.println(number);
		return fibonacci(number - 2) + fibonacci(number - 1);
	}

	public static String revrese(String str) {
		if (str.length() <= 1) {
			return str;
		}
		System.out.println(str);
		return revrese(str.substring(1)) + str.charAt(0);
	}

	public static int[] bubbleSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] >= array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}
}
