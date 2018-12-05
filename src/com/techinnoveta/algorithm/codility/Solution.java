package com.techinnoveta.algorithm.codility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		int[] list = {4,5,2,3,4};
		int count = 0;
		
		for (int i = 0; i < list.length; i++) {
			List<Integer> li = new ArrayList<Integer>();
			int temp = list[i];
			for (int j = 0; j < list.length; j++) {
				if(i != j){
					li.add(list[j]);
				}
			}
			List tmp = new ArrayList(li);
			Collections.sort(tmp);
			boolean sorted = tmp.equals(li);
			if(sorted){
				count++;
			}
		}
		
		System.out.println(count);
	}
}