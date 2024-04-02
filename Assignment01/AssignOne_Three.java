/* 3. Display food menu to user. User will select items from menu along with the quantity. (eg 1. Dosa
2. Samosa 3. Idli ... 10 . Generate Bill ) Assign fixed prices to food items(hard code the prices)
When user enters 'Generate Bill' option , display total bill & exit.
(No need of any class, and no need to display the food deatils. Only display the total of orderd
food) */

import java.util.Scanner;

public class AssignOne_Three {

	public static void main(String[] args) {
		
		int choice=0; 
		int dosa = 0, samosa = 0, idli = 0;
		int qty=0;
		int bill=0;
		
		do
		{
//			System.out.println("0. Exit");
			System.out.println("1. Dosa");
			System.out.println("2. Samosa");
			System.out.println("3. Idli");
			System.out.println("4. Pav Bhaji");
			System.out.println("5. Vada Pav");
			System.out.println("6. Dabeli");
			System.out.println("7. Butter Dosa");
			System.out.println("8. Spring Dosa");
			System.out.println("9. Puri BHaji");
			System.out.println("10. Generate Bill");
			System.out.println("Enter Your Dish - ");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1 : 
				System.out.println("Enter Quentity - ");
				qty = sc.nextInt();
//				dosa = 50 * qty;
				bill =bill + 50 * qty;
				break;
			case 2 : 
				System.out.println("Enter Quentity - ");
				qty = sc.nextInt();
//				samosa = 20 * qty;
				bill =bill + 20 * qty;
				break;  
			case 3 : 
				System.out.println("Enter Quentity - ");
				qty = sc.nextInt();
//				idli = 10 * qty;
				bill =bill + 10 * qty;
				break;  
			case 4 : 
				System.out.println("Enter Quentity - ");
				qty = sc.nextInt();
//				Pav Bhaji = 60 * qty;
				bill =bill + 60 * qty;
				break;  
			case 5 : 
				System.out.println("Enter Quentity - ");
				qty = sc.nextInt();
//				Vada Pav = 15 * qty;
				bill =bill + 15 * qty;
				break;  
			case 6 : 
				System.out.println("Enter Quentity - ");
				qty = sc.nextInt();
//				Dabeli = 20 * qty;
				bill =bill + 20 * qty;
				break;
			case 7 : 
				System.out.println("Enter Quentity - ");
				qty = sc.nextInt();
//				Butter Dosa = 70 * qty;
				bill =bill + 70 * qty;
				break;
			case 8 : 
				System.out.println("Enter Quentity - ");
				qty = sc.nextInt();
//				Spring Dosa = 80 * qty;
				bill =bill + 80 * qty;
				break;
			case 9 : 
				System.out.println("Enter Quentity - ");
				qty = sc.nextInt();
//				Puri BHaji = 60 * qty;
				bill =bill + 60 * qty;
				break;
			case 10: 
//					System.out.println("==================================");
//					System.out.println("Total Bill   : "+(dosa+samosa+idli));
//					System.out.println("==================================");
				
				
				    System.out.println("==================================");
					System.out.println("Total Bill = "+bill);
					System.out.println("==================================");
				break;
				
			default :
				System.out.println("Wrong Choice!!!");
			}
			
		}while(choice!=10);

	}

}
