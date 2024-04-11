package com.practice;

import java.util.Scanner;

public class QueTwo {

	public static void main(String[] args) {

		String name = "";
		String reverse = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		name = sc.next();
		char ch[] = name.toCharArray();

		for (int i = 0 ;i< name.length(); i++) {
			reverse = ch[i] + reverse;
		}

		if (name.equals(reverse)) {
//			System.out.println(reverse);
			System.out.println("String is Palimdrome");
		} else {
			System.out.println("String is Not Palimdrome");
		}
	}
}
