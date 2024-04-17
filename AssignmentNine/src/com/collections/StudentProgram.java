package com.collections;

import java.text.CollationElementIterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class StudentProgram {

	public static void main(String[] args) {
		
		List<Student> std = new ArrayList<>();
		std.add(new Student(2,"c",80.00));
		std.add(new Student(5,"d",60.00));
		std.add(new Student(3,"e",77.00));
		std.add(new Student(1,"b",98.00));
		std.add(new Student(4,"a",56.00));
		
		for(Student element : std)
		{
			System.out.println(element);
		}
		
		class ComparatorName implements Comparator<Student>
		{

			@Override
			public int compare(Student o1, Student o2) {
				int value = o1.getName().compareTo(o2.getName());
				return value;
			}
			
		}
		
		class ComparatorMarks implements Comparator<Student>
		{

			@Override
			public int compare(Student o1, Student o2) {
				int value = Double.compare(o1.getMarks(), o2.getMarks());
				return value;
			}
			
		}
		
		
		
		int choice;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("0. Exit");
			System.out.println("1. Sort Student by Roll Number - ");
			System.out.println("2. Sort Student by Name - ");
			System.out.println("3. Sort Student by Marks - ");
			System.out.println("4. Add Student - ");
			System.out.println("5. Remove Student - ");
			System.out.println("6. Display - ");
			
			System.out.print("Enter Your Choice - ");
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 0 : 
				System.out.println("Successfully Exit !!");
				break;
				
			case 1 :
				Collections.sort(std);
				for(Student student : std)
				System.out.println(student);
				break;
			
			case 2 : 
				
				Comparator<Student> comName = new ComparatorName();
				Collections.sort(std, comName);
				for (Student student : std) {
					System.out.println(student);
				}
				
				break;
				
			case 3 : 
				Comparator <Student> comMarks = new ComparatorMarks();
				Collections.sort(std,comMarks);
				for (Student student : std) {
					System.out.println(student);
				}
				break;
				
			case 4 : 
				
				std.add(new Student(6,"afrg",65.12));
				for (Student student : std) {
					System.out.println(student);
				}
				break;
				
			case 5 :
				int n;
				Student s1 = new Student();
				System.out.println("Enter Roll Number You have to Remove");
				n = sc.nextInt();
				s1.setRollNum(n);
				int index = std.indexOf(s1);
				System.out.println(index);
				if(index!=-1)
				{
					System.out.println("Element  - "+(std.remove(index)));
				}
				else
				{
					System.out.println("Element not found");
				}
				break;

			case 6:
				for (Student student : std) {
					System.out.println(student);
				}
				break;
			}
			
		

		
		}while(choice!=0);
		
	}

}
