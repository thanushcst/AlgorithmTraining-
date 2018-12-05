package com.techinnoveta.hackerrank.stringtokens;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Solution {

	public static void main(String args[]) {
		String pattern = "[A-Za-z !,?._'@]+";
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		List<String> items = Arrays.asList(s.split("\\s*(=>|,|'|@|_|\\?|!|\\.|\\s)\\s*"));

		List<String> filttedList = items.stream().filter(line -> !line.equals("")).filter(line -> line.matches(pattern))
				.collect(Collectors.toList());
		System.out.println(filttedList.size());
		for (String str : filttedList) {
			System.out.println(str);
		}

		sc.close();
	}
}