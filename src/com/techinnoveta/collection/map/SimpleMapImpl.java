package com.techinnoveta.collection.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SimpleMapImpl {
	public static void main(String args[]) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("100", "Amit");
		map.put("101", "Vijay");
		map.put("102", "Rahul");
		map.put("102", "Aravind");
		map.put("102", "Rahul");
		map.put("102", "Rahul");
		map.put("103", "Rahul");
		map.put(null, null);

		for (Map.Entry m : map.entrySet()) { 
			System.out.println(m.getKey() + " - " + m.getValue());
		}
		
		Set<String> set = new HashSet<String>();
		set.add("100");
		set.add("100");
		set.add("102");
		set.add("103");
		set.add("104");
		set.add(null);
		set.add("105");
		
		for (String string : set) {
			System.out.println(string);
		}
		
	}
}
