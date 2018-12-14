package com.techinnoveta.java.basic.exception;

public class SampleUncheckedException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1641216203122471422L;

	public SampleUncheckedException(String message, Throwable cause) {
		super(message, cause);
	}
}