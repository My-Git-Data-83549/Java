package com.tester;

import java.util.Scanner;

import com.entites.StringLine;
import com.exception.ExceptionLineTooLong;

public class MainTester {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		StringLine s = new StringLine();
		
		try {
			s.acceptLine(sc);
		} catch (ExceptionLineTooLong e) {
			
			e.printStackTrace();
		}
		
		System.out.println("Lenght - "+ s.getStringLine().length());
		
		


}

	}
