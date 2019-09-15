package com.techinnoveta.hackerrank.pesel;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		// note:
		// this is just an example on how our system
		// takes input and output and automate the process
		// of marking this submission
		try {
			Scanner scan = new Scanner(System.in);
			int line = 0;
			// check if there is any more line
			if (scan.hasNextLine()) {
				// here's how you read the next line
				line = scan.nextInt();
			}
			 for (int i = 0; i < line; i++) {
				System.out.println("String - " + scan.nextLine());
			}

		} catch (Exception e) {
		}
	}
}
