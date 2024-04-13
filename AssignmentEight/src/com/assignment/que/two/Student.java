package com.assignment.que.two;

public class Student implements Comparable<Student> {

	private String name;
	private int rollNumber;
	private String city;
	private double marks;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public Student() {

	}

	public Student(String name, int rollNumber, String city, double marks) {
		this.name = name;
		this.rollNumber = rollNumber;
		this.city = city;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [Name=" + name + ", rollNumber=" + rollNumber + ", city=" + city + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Student c) {
		if(this.rollNumber>c.rollNumber)
			return 1;
		else if(this.rollNumber<c.rollNumber)
			return -1;
		return 0;
	}

}
