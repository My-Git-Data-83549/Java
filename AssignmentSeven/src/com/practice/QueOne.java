// Q1. Write a java program to reverse a String

package com.practice;

public class QueOne {

	public static void main(String[] args) {
		
		String s1 = "uoy evol I";
		char ch[] = s1.toCharArray();
		char a=0;
		
//		for(int i=s1.length()-1;i>=0;i--) {
//			a = ch[i];
//			System.out.print(" "+a);
//		}
		
		// =================OR=======================
		
		String reverse = " ";
		for(int i=0;i<s1.length();i++) {
			reverse = ch[i] + reverse;
			
		}
		System.out.print(reverse);
		

}
}
