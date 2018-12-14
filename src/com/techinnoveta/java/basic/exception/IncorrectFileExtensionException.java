package com.techinnoveta.java.basic.exception;

public class IncorrectFileExtensionException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6693161047945100067L;

	public IncorrectFileExtensionException(String errorMessage, Throwable err) {
		super(errorMessage, err);
	}
}