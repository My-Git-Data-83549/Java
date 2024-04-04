package com.app.geometry;
import java.lang.Math;
import java.util.Scanner;

public class Point2D {
	
	private int x;
	private int y;
	
	
	public String getDetails()
	{
		return "("+x+","+y+")";
		
	}
	
	public boolean isEqual(Point2D p2)
	{
		if(this.x==p2.x && this.y==p2.y)
		{
			return true;
		}
		return false;
	}

	public void calculateDistance(Point2D p2)
	{
		double d,x,y,s;
		
//		d = sqrt(pow(this.x-p2.x)+(this.y-p2.y));
//		d = sqrt(pow(x,y));
		x = Math.pow(p2.x-this.x,2);
		y = Math.pow(p2.y-this.y,2);
		s = x+y;
		d = Math.sqrt(s);
		
		
		System.out.println("Distance = "+d);
	}
	
	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Point x - ");
		x = sc.nextInt();
		System.out.println("Enter Point y - ");
		y = sc.nextInt();
		
	}
	
	public void Display()
	{
		System.out.println("Co-ordinates"+"("+x+","+y+")");
	}
	
}
