package com.app.DrivingCost;

import java.util.Scanner;

public class DrivingCost {
	private double miles;
	private double gasolineCost;
	private double avgmilespergallon;
	private double parkingFees;
	private double tolls;
	
	public DrivingCost()
	{
		this.miles=0000;
		this.gasolineCost=00;
		this.avgmilespergallon=00.0;
		this.parkingFees=00;
		this.tolls=00;
	}

	public DrivingCost(double miles, double gasolineCost, double avgmilespergallon, double parkingFees, double tolls) {
		super();
		this.miles = miles;
		this.gasolineCost = gasolineCost;
		this.avgmilespergallon = avgmilespergallon;
		this.parkingFees = parkingFees;
		this.tolls = tolls;
	}

	public double getMiles() {
		return miles;
	}

	public void setMiles(double miles) {
		this.miles = miles;
	}

	public double getGasolineCost() {
		return gasolineCost;
	}

	public void setGasolineCost(double gasolineCost) {
		this.gasolineCost = gasolineCost;
	}

	public double getAvgmilespergallon() {
		return avgmilespergallon;
	}

	public void setAvgmilespergallon(double avgmilespergallon) {
		this.avgmilespergallon = avgmilespergallon;
	}

	public double getParkingFees() {
		return parkingFees;
	}

	public void setParkingFees(double parkingFees) {
		this.parkingFees = parkingFees;
	}

	public double getTolls() {
		return tolls;
	}

	public void setTolls(double tolls) {
		this.tolls = tolls;
	}
	
	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Total miles driven per day");
		miles = sc.nextDouble();
		System.out.println("Cost per gallon of gasoline");
		gasolineCost = sc.nextDouble(); 
		System.out.println("Average miles per gallony");
		avgmilespergallon = sc.nextDouble();
		System.out.println("Parking fees per day");
		parkingFees = sc.nextDouble();
		System.out.println("Tolls per day");
		tolls = sc.nextDouble();

		
	}
	
	public void display()
	{
		double cost = ((miles/avgmilespergallon)*gasolineCost + parkingFees + tolls);
		System.out.println("Cost per day of driving to work - "+cost);
	}
}
