package com.techinnoveta.java.basic.exception;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHandle {
	   
    public static void main(String[] args) {
    	try {
			readFile();
		} catch (IncorrectFileExtensionException e) {
			System.out.println("IncorrectFileExtensionException");
		} catch (SampleUncheckedException e) {
			System.out.println("SampleUncheckedException");
		}
    }
    
    
    public static void readFile() throws IncorrectFileExtensionException {
  	  File file = new File("C:\\Users\\pankaj\\Desktop\\test.txt"); 
  	  
  	  BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			throw new IncorrectFileExtensionException("File not found!", e);
		} catch (Exception e) {
			throw new SampleUncheckedException("File not found!", e);
		} 
  }
}