package com.assignment.que.two;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {

		Student arr[] = new Student[5];
		Student s = new Student();

		arr[0] = new Student("Amey", 3, "Mumbai", 80.65);
		arr[1] = new Student("Devendra", 4, "Pune", 90.00);
		arr[2] = new Student("Bhavesh", 5, "Delhi", 78.23);
		arr[3] = new Student("Rahul", 1, "Nagpur", 90.00);
		arr[4] = new Student("Sonu", 2, "Karad", 60.78);
		int choice;
		Scanner sc = new Scanner(System.in);
		
		class StudentCityComparator implements Comparator<Student> { //1

			@Override
			public int compare(Student o1, Student o2) {
				int value = o1.getCity().compareTo(o2.getCity());
				return value;
			}
		}
		class StudentMarksComparator implements Comparator<Student> { //1

			@Override
			public int compare(Student o1, Student o2) {   // 2
				int value = Double.compare(o2.getMarks(),o1.getMarks());
				return value;
			}
		}
		
		class StudentNameComparator implements Comparator<Student>{ //3

			@Override
			public int compare(Student o1, Student o2) {
				int value = o1.getName().compareTo(o2.getName());
				return 0;
			}
			
		}
		

		do {

			System.out.println("0. Exit");
			System.out.println("1. Sorting By City (Asc)");
			System.out.println("2. Sorting By Marks (Des)");
			System.out.println("3. Sorting By Name (Asc)");
			System.out.println("4. Sorting By RollNumber (Asc)"); // Optional Case
			System.out.println("Enter Your Choice");
			choice = sc.nextInt();
			
			
			switch (choice) {
				
			case 0 : 
				System.out.println("Thank You !!");
				break;
				
			case 1 :
				Comparator<Student> city = new StudentCityComparator();  //1 
				Arrays.sort(arr,city);
				for (Student student : arr) {
					System.out.println(student);
				}
				break;
				
			case 2 : 
				Comparator<Student> marks = new StudentMarksComparator();  //2
				Arrays.sort(arr,marks);
				for (Student student : arr) {
					System.out.println(student);
				}
				break;
				
			case 3 : 
				Comparator<Student> name = new StudentNameComparator();  //3
				Arrays.sort(arr,name);
				for (Student student : arr) {
					System.out.println(student);
				}
				break;
				
			case 4 : // Optional Case For Roll Number 
				Arrays.sort(arr);
				for (Student student : arr) {
					System.out.println(student);
				}
				break;
				
				
			}
		} while (choice != 0);

	}

}
