package com.techinnoveta.hackerrank.dbs;

import java.io.IOException;

public class Shipping {
	public static int minimalNumberOfPackages(int items, int availableLargePackages, int availableSmallPackages) {
		int total = -1;
		if(items <= ((availableLargePackages * 5) + availableSmallPackages)){
			total = 0;
			while(availableLargePackages > 0 && items > 0 && items >= 5){
				total++;
				items = items - 5;
				availableLargePackages --;
			}
			
			while (availableSmallPackages > 0 && items > 0) {
				total++;
				items = items - 1;
				availableSmallPackages --;
				
			}
		}
		return total;
    }
	public static void main(String[] args) throws IOException {
		System.out.println(minimalNumberOfPackages(4, 4, 5));
	}
}
