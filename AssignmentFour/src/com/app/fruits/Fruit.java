package com.app.fruits;

import java.util.Scanner;

public class Fruit {
	String name;
	String colour;
	double weight;
	boolean isFresh;
	
	public Fruit()
	{
		
	}
	

	public Fruit(String name, String colour, double weight, boolean isFresh) {
		super();
		this.name = name;
		this.colour = colour;
		this.weight = weight;
		this.isFresh = isFresh;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	public boolean isFresh() {
		return isFresh;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}

	@Override
	public String toString() {
		return "Fruit name=" + name + ", colour=" + colour + ", weight=" + weight+", taste ="+taste();
	}
	
	public String taste()
	{
		return "No Specific Taste";
	}
	
	
	public void acceptFruit(Scanner sc)
	{
//		System.out.print("Enter Fruit Name - ");
//		name = sc.next();
//		System.out.println("Enter Colour Of Fruit - ");
//		colour = sc.next();
		System.out.println("Enter weight Of Fruit - ");
		weight = sc.nextDouble();
	}
	public void displayFruit()
	{
		System.out.println("Fruit Name - "+getName());
		System.out.println("Fruit Colour - "+getColour());
		System.out.println("Fruit Weight - "+getWeight());
		//System.out.println("is fresh"+get);
	}

	
	
	
	
}
