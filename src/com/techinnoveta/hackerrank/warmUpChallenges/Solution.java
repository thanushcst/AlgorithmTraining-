package com.techinnoveta.hackerrank.warmUpChallenges;

import java.util.Scanner;

class Difference {
	private int[] elements;
	public int maximumDifference; 
	
	public Difference(int[] a) {
		this.elements = a;
	}
	
	public void computeDifference() {
		int temp = 0;
		for (int i = 0; i < elements.length; i++) {
			for (int j = i + 1; j < elements.length; j++) {
				temp = Math.abs(elements[j] - elements[i]);
				if(temp > maximumDifference){
					maximumDifference = temp;
				}
			}
		}
	}
}

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		Difference difference = new Difference(a);

		difference.computeDifference();

		System.out.print(difference.maximumDifference);
	}
}