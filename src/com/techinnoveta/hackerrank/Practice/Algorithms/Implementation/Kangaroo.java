package com.techinnoveta.hackerrank.Practice.Algorithms.Implementation;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Kangaroo {

	// Complete the kangaroo function below.
	static String kangaroo(int x1, int v1, int x2, int v2) {
		String result = "YES";
		if((x2 >= x1 && v2 > v1) || (x1 >= x2 && v1 > v2)){
			result = "NO";
		} else {
			if((x1 + v1) % (x2 + v2) == 0 || (x2 + v2) % (x1 + v1) == 0  ){
				result = "YES";
			} else {
				result = "NO";
			}
		}
		return result;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		String[] x1V1X2V2 = scanner.nextLine().split(" ");

		int x1 = Integer.parseInt(x1V1X2V2[0]);

		int v1 = Integer.parseInt(x1V1X2V2[1]);

		int x2 = Integer.parseInt(x1V1X2V2[2]);

		int v2 = Integer.parseInt(x1V1X2V2[3]);

		String result = kangaroo(x1, v1, x2, v2);

		System.out.println(result);

		scanner.close();
	}
}
