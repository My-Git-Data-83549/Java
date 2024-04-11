package com.practice;

import java.util.Scanner;

//class St{
//	static int count=0;
//}

public class ggg {

	public static void main(String[] args) {
		
		String userString="";
		int res=0;
//		String arr[];
		int count=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String - ");
		userString= sc.nextLine().trim();
		String arr[] = userString.split(" ");

		for (String string : arr) {
			System.out.println(string);
			res=arr.length;
		} // count of words will print
		
		
		
//		for(int i=0;i<arr.length;i++) {
//			
//			res=res+arr[i].length();
//				
//		} // count of letters will print
		
		System.out.println(res);
	

		
	}

}
