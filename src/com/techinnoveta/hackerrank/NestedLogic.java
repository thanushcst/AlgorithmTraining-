package com.techinnoveta.hackerrank;

import java.io.IOException;

import java.util.Scanner;

public class NestedLogic {

	static int calculateFine(int[] returnDate, int[] expectedDate) {
		int count = 0;
		if (returnDate[2] >= expectedDate[2]) {
			return count += 10000 * (returnDate[2] - expectedDate[2]);
		}
		if (returnDate[1] >= expectedDate[1]) {
			return count += 500 * (returnDate[1] - expectedDate[1]);
		}
		if (returnDate[0] >= expectedDate[0]) {
			return count += 15 * (returnDate[0] - expectedDate[0]);
		}
		return count;
		
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		String[] line = scanner.nextLine().split(" ");
		int[] returnDate = new int[line.length];
		for (int i = 0; i < line.length; i++) {
			returnDate[i] = Integer.parseInt(line[i]);
		}
		line = scanner.nextLine().split(" ");
		int[] expectedDate = new int[line.length];
		for (int i = 0; i < line.length; i++) {
			expectedDate[i] = Integer.parseInt(line[i]);
		}

		System.out.println(calculateFine(returnDate, expectedDate));
		scanner.close();
	}
}