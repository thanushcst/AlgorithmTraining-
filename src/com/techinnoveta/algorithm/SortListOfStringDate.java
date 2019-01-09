package com.techinnoveta.algorithm;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class SortListOfStringDate {

	public static void main(String[] args) {
		List<String> dateList = new ArrayList<String>();
		dateList.add("02/12/2001");
		dateList.add("12/09/1999");
		dateList.add("13/11/2016");

		Comparator<String> comparator = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
				try {
					Date date1 = format.parse(o1);
					Date date2 = format.parse(o2);
					return date1.compareTo(date2);
				} catch (ParseException e) {
					return 0;
				}
			}

		};
		

		Collections.sort(dateList, comparator);
		for (String string : dateList) {
			System.out.println(string);
		}
	}

}