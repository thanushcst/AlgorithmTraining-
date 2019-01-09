package com.techinnoveta.hackerrank.array.duplicate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class DuplicateArray {

	public static void main(String[] args) {
		int[] arrInt = { 23, 34, 45, 23, 56, 57, 67, 56, 45, 23, 98, 57 };
		
		findDuplicate(arrInt);
		//findDuplicateByJava8(arrInt);
	}
	
	public static void findDuplicate(int[] arrInt) {
		Map<Integer, Integer> data = new HashMap<>();
		for (int i = 0; i < arrInt.length; i++) {
			int count = 0;
			System.out.println("First Loop - " + arrInt[i]);
			for (int j = 0; j < arrInt.length; j++) {
				System.out.println("Second Loop - " + arrInt[j]);
				if (arrInt[i] == arrInt[j]) {
					count++;
				}
			}
			data.put(arrInt[i], count);
		}

		for (Entry<Integer, Integer> entry : data.entrySet()) {
			System.out.println("Value = " + entry.getKey() + ", COUNT = " + entry.getValue());
		}
	}
	
	public static void findDuplicateByJava8(int[] arrInt) {
		Map<Integer, Integer> data = new HashMap<>();
		List<Integer> list = Arrays.stream(arrInt).boxed().collect(Collectors.toList());
		//list.stream().filter()
	}
}

