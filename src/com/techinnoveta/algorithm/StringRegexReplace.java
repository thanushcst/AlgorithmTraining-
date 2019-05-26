package com.techinnoveta.algorithm;

import java.io.IOException;

public class StringRegexReplace {
	public static void main(String[] args) throws IOException {
		System.out.println(new StringBuilder("TEST").append("@gmail.com"));
		String str = "\"Title\": \"Mr\", \"Name\": \"Ruben Lee Ming Fong\", \"StaffOraNum\": \"059762\""; 
		System.out.println(str);
		str = replaceRegex("Name", str);
		System.out.println(str);
	}

	public static String replaceRegex(String regex, String str) {
		str.replace(regex, "");
		return str;
	}
}
