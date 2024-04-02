/* 2. Accept 2 double values from User (using Scanner). Check data type. If arguments are not
doubles, supply suitable error message & terminate.
If numbers are double values, print its average.
Hint : Check Scanner class for the methods
*/

import java.util.Scanner;

public class AssignOne_Two {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number");
		if(sc.hasNextDouble())
		{
			double num1 = sc.nextDouble();
			double num2 = sc.nextDouble();
			System.out.println("avg is "+(num1 + num2)/2);
		}
		else
			System.out.println("you have enter value "+sc.next());
		
		

	}

}
