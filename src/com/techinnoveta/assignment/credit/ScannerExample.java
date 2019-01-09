package com.techinnoveta.assignment.credit;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your data");
		while (scanner.hasNext()) {
			System.out.println("Next Line");
			System.out.println("Next Line: " + scanner.nextLine());
		}
	}
}
