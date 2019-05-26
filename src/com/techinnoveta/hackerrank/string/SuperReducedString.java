package com.techinnoveta.hackerrank.string;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SuperReducedString {
    // Complete the superReducedString function below.
    static String superReducedString(String s) {
    	
    	char[] strArr = s.toCharArray();
    	for (int i = 0; i < strArr.length; i++) {
			for (int j = i+1; j < strArr.length; j++) {
				if(strArr[i] == strArr[j]) {
					strArr[i] = '\0';
					strArr[j] = '\0';
				}	
			}
		}
    	s = String.valueOf(strArr).replaceAll("\\s","");
    	if(s.length() <= 0) {
            return "Empty String";
        } else {
        	return s;
        }
		
    }

    public static void main(String[] args) throws IOException {
    	String result = superReducedString("baab");
        System.out.println(result);
    }
}
