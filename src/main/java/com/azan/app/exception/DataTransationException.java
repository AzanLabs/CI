package com.azan.app.exception;

public class DataTransationException extends Exception {

	/**
	 * The DataTransationException Handle all data transaction exception.
	 */
	private static final long serialVersionUID = 1L;
	
	public DataTransationException(String message) {
		super(message);
	}

	public DataTransationException(String message, Throwable cause) {
		super(message, cause);
	}

}
