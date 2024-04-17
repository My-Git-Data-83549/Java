package com.collections;

import java.util.Objects;

public class Student implements Comparable<Student>{

	private int rollNum;
	private String name;
	private double marks;
	
	public Student()
	{
		
	}

	public Student(int rollNum, String name, double marks) {
		super();
		this.rollNum = rollNum;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [rollNum=" + rollNum + ", name=" + name + ", marks=" + marks + "]";
	}

	public int getRollNum() {
		return rollNum;
	}
	

	

	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return rollNum == other.rollNum;
	}

	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public int compareTo(Student o) {
		int diff = this.rollNum - o.rollNum;
		return diff;
	}
	
	
}
