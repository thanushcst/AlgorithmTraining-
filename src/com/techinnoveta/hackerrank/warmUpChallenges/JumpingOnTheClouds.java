package com.techinnoveta.hackerrank.warmUpChallenges;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JumpingOnTheClouds {

	// Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
    	int step = 0;
    	int i = 0;
    	while (i < c.length - 1) {
    		if((i + 2) >= c.length){
    			i++;
				step ++;
    		} else {
    			if(c[i+2] != 1){
    				step ++;
    				i += 2;
    			} else {
    				i++;
    				step ++;
    			}
    		}
		}
		return step;
    }
    
    static int countingValleys(int n, String s) {
    	int index = 0;
    	int row = 0;
    	Map<Integer, String> map = new HashMap<Integer, String>();
    	char[] arr = s.toCharArray();
    	for (int i = 0; i < arr.length - 1; i++) {
    		map = mapSet(i, s.length());
    		if(i == 0 && row == 0){
    			map.put(index, "_");
    		}
    		map.put(index, String.valueOf(arr[i]));
    		if(arr[i] == arr[i+1]){
        		index++;
        	}
		}
    	
		return n;	
    }
    
    static Map<Integer, String> mapSet(int index, int n) {
    	Map<Integer, String> map = new HashMap<Integer, String>();
    	for (int i = 0; i < n; i++) {
    		map.put(index," ");
		}
		return map;	
    }

    static long repeatedString(String s, long n) {
    	long repeat = 0;
    	long length =  s.length();
    	long reminder = n %length;
    	long divident = (n - reminder) / length;
    	
    	Pattern pattern = Pattern.compile("[^a]*a");
    	Matcher matcher = pattern.matcher(s);
    	int count = 0;
    	while (matcher.find()) {
    		count++;
    	}
    	repeat = count * divident;
    	
    	pattern = Pattern.compile("[^a]*a");
    	matcher = pattern.matcher(s.substring(0, (int)reminder));
    	count = 0;
    	while (matcher.find()) {
    		count++;
    	}
    	
		return repeat + count;
    }

	public static void main(String[] args) throws IOException { 
		//System.out.println(jumpingOnClouds({0, 0, 0, 1, 0, 0}));
		//System.out.println(repeatedString("aab", 882787));
        System.out.println(countingValleys(8, "UDDDUDUU"));
	}
}