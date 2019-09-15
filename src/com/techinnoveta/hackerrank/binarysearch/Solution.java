package com.techinnoveta.hackerrank.binarysearch;

class Solution {
	public static void main(String args[]) {
		int arr[] = { 2, 3, 4, 6, 9, 10, 23, 35, 39, 40 };
		int n = arr.length;
		int x = 11;
		int result = binarySearch(arr, 0, n - 1, x);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index " + result);
	}

	private static int binarySearch(int[] arr, int low, int high, int x) {
		if(high >= low) {
			int mid = low + (high - low) / 2;
			System.out.println("MID - " + mid);
			
			if(arr[mid] == x) {
				return mid;
			} else if(arr[mid] > x) {
				return binarySearch(arr, low, mid - 1, x);
			} else {
				return binarySearch(arr, mid + 1, high, x);
			}
		}
		return -1;
	}

}