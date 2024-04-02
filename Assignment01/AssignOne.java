/*
Q1. Accept a integer number and when the program is executed print the binary, octal and
hexadecimal equivalent of the given number.
Sample Output:
java Test
Enter Number : 20
Given Number :20
Binary equivalent :10100
Octal equivalent :24
Hexadecimal equivalent :14
Hint : Use Wrapper Class (toBinaryString() , toOctalString(), toHexString())
*/


import java.util.Scanner;

public class AssignOne {

	public static void main(String[] args) {
		
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Any Number - ");
		num = sc.nextInt();
		Integer i1 = new Integer(num);
		 
		System.out.println("Decimal - "+num);
		System.out.println("Binary Value - "+i1.toBinaryString(num));
		System.out.println("Octal Value - "+i1.toOctalString(num));
		System.out.println("Hex Value - "+i1.toHexString(num));
		
		

	}

}
