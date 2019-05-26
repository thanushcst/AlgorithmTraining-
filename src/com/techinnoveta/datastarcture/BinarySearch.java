package com.techinnoveta.datastarcture;

public class BinarySearch {
	public static void main(String args[]) {
		int data[] = {2, 4, 5, 6,8 ,9, 10, 13, 23, 35, 46, 56, 59, 59 ,60, 61, 62, 64, 75};
		System.out.println(new BinarySearch().binarySearch(data, 0, data.length, 13));
	}
	
	
	public int binarySearch(int data[], int low, int high, int value) {
		int mid = low + (high - 1) / 2;
			if(low <= high) {
				if(data[mid] == value) {
				return mid;
				
			} else if(data[mid]  > value) {
				return binarySearch(data, low, mid - 1, value);
			} else if(data[mid]  < value) {
				return binarySearch(data, mid + 1, high, value);
			}
		}
		return -1;
	}
	
}
