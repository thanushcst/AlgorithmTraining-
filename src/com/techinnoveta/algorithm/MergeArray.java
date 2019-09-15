package com.techinnoveta.algorithm;

public class MergeArray {

	public static void main(String[] args) {
		int[] array1 = { 101, 102, 103, 104 };
		int[] array2 = { 105, 106, 107, 108 };
		int[] merged = merge(array1, array2);
		for (int i = 0; i < merged.length; i++) {
			System.out.print(merged[i] + " ");
		}

	}

	public static int[] merge(int[] a, int[] b) {
		int length = a.length + b.length;
		int[] result = new int[length];
		System.arraycopy(a, 0, result, 0, a.length);
		System.arraycopy(b, 0, result, a.length, b.length);
		return result;
	}

}
