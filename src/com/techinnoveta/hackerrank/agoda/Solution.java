package com.techinnoveta.hackerrank.agoda;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.IntStream;



class Result {

    /*
     * Complete the 'minPower' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY p as parameter.
     */

    public static int minPower(List<Integer> p) {
    	int min = 1;
    	int index = 1;
    	
    	while(index > 0) {
    		boolean isAlive = true;
    		for (Integer i : p) {
				if((min + i) >= 1) {
					min = min + i;
				} else {
					isAlive = false;
					break;
				}
			}
    		if(isAlive) {
    			min = index;
    			return min;
    		} else {
    			index++;  
    			min = index;
    		}
    	}
		return min;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/Users/thanushankanagarajah/Programmer/REPO/AlgorithmTraining/result/result.txt"));

        int pCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> p = IntStream.range(0, pCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.minPower(p);
        System.out.println("REsult - " +result);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
