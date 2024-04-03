package com.app.geometry;
import java.lang.Math;

public class Point2D {
	
	private int x;
	private int y;
	
	public Point2D(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	
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

	public double calculateDistance(Point2D p2)
	{
		double d,x,y,s;
		
//		d = sqrt(pow(this.x-p2.x)+(this.y-p2.y));
//		d = sqrt(pow(x,y));
		x = Math.pow(p2.x-this.x,2);
		y = Math.pow(p2.y-this.y,2);
		s = x+y;
		d = Math.sqrt(s);
		
		
		return d;
	}
	
}
