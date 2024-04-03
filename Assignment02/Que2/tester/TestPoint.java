package tester;



import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPoint {

	public static void main(String[] args) {
		int p1x, p1y;
		int p2x, p2y;
		int distance;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Point 1 - ");
		p1x = sc.nextInt();
		p1y = sc.nextInt();
		System.out.println("Enter Point 2 - ");
		p2x = sc.nextInt();
		p2y = sc.nextInt();
		Point2D p1 = new Point2D(p1x, p1y);
		Point2D p2 = new Point2D(p2x, p2y);
		System.out.println("Value of p1 " + p1.getDetails());
		System.out.println("Value of p2 " + p2.getDetails());

		if (p1.isEqual(p2)) {
			System.out.println("Both Co are same");
		} else
//			System.out.println("Co are different");
		{
			double d=p1.calculateDistance(p2);
			System.out.println("Distance = "+d);
		}

//		
//		System.out.println("Enter Point 2 - ");
//		p2 = sc.nextInt();

	}

}
