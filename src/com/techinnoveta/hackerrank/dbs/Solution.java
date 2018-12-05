package com.techinnoveta.hackerrank.dbs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution {

	public static void main(String[] args) {
		int[] a = { 1, 3, 46, 1, 3, 9 };
		System.out.println(numberOfPairs(a, 47));
	}

	static int numberOfPairs(int[] a, long k) {
		int end = a.length;
		int count = 0;
		Set<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < end; i++) {
			set.add(a[i]);
		}
		int[] arr = new int[set.size()];
		Iterator it = set.iterator();
		int i = 0;
		while(it.hasNext()) {
		  arr[i] = (int) it.next();
		  i++;
		}
		
		for (int j = 0; j < arr.length; j++) {
			for (int j2 = j; j2 < arr.length; j2++) {
				if(k == (arr[j] + arr[j2])){
					count ++;
				}
			}
		}

		return count;

	}

}