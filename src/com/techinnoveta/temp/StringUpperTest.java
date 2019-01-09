package com.techinnoveta.temp;

import java.util.HashMap;
import java.util.Map;

public class StringUpperTest {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "THANUSHAN");
		map.put(2, "THANUSHAN");
		map.put(3, "THANU");
		map.put(null, "SHAN");
		map.put(4, "THANUSHAN");
		map.put(5, "THANUSH");
		
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry);
		}
		
	}
}
