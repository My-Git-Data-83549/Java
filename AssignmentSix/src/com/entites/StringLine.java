package com.entites;

import java.util.Scanner;



import com.exception.ExceptionLineTooLong;

public class StringLine {
	
	private String stringLine;

	public StringLine() {
		this.stringLine = " ";
	}

	public StringLine(String stringLine) {
		this.stringLine = stringLine;
	}
	
	public void setStringLine(String stringLine) {
		this.stringLine = stringLine;
	}

	public String getStringLine() {
		return stringLine;
	}

	@Override
	public String toString() {
		return "StringLine [string Line=" + stringLine + "]";
	}
	
	public void acceptLine(Scanner sc) throws ExceptionLineTooLong {
		System.out.println("Enter one line");
		stringLine = sc.nextLine();			
		if(stringLine.length() > 80)
		{
			throw new ExceptionLineTooLong("The lenght of Line is full ");
		}
		System.out.println("String Line Entered is - "+stringLine);
		System.out.println("Lenght of String Line - "+stringLine.length());
		
	}
	
	
	
}
