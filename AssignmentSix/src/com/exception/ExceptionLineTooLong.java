package com.exception;

public class ExceptionLineTooLong extends Exception {

	private String field;
	private String message;

	public ExceptionLineTooLong() {
		this.field = " ";
		this.message = " ";
	}

	public ExceptionLineTooLong(String message) {

		this.field = " ";
		this.message = message;
	}
//
//	public ExceptionLineTooLong(String field, String message) {
//
//		this.field = field;
//		this.message = message;
//	}
	
	@Override
	public void printStackTrace() {
		super.printStackTrace();
		System.err.println("Exception : ");
		System.err.println("InvalidDateException : " + message);
		System.err.println("For the field : " + field);
	}

}
