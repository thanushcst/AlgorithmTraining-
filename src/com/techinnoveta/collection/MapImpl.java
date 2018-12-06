package com.techinnoveta.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapImpl {
	public static void main(String args[]) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(100, "Amit");
		map.put(101, "Vijay");
		map.put(102, "Rahul");
		map.put(null, "Rahul");
		System.out.println("<<<<<<<<<<<<<<< MAP >>>>>>>>>>>>>>>");
		Set<Integer> keys = map.keySet();
		for (Integer key : keys) {
			System.out.println(key + " " + map.get(key));
		}
		/*for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}*/
		System.out.println("<<<<<<<<<<<<<<< END >>>>>>>>>>>>>>>");
		
		Set<String> set=new HashSet<String>();  
		set.add("TEST");
		set.add("TEST");
		set.add("TEST2");
		set.add(null);
		System.out.println("<<<<<<<<<<<<<<< SET >>>>>>>>>>>>>>>");
		for (String string : set) {
			System.out.println(string);
		}
		System.out.println("<<<<<<<<<<<<<<< END >>>>>>>>>>>>>>>");
	}

}
