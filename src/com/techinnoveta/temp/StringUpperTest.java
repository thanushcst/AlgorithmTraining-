package com.techinnoveta.temp;

import java.util.Scanner;

public class StringUpperTest {

	public static void main(String[] args) {
		String WORD = "GOOGLE";

		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();

		if (input.toUpperCase().equals(WORD)) {
			System.out.println("TRUE");
		} else {
			System.out.println("FALSE");
		}
		scan.close();
	}
}
