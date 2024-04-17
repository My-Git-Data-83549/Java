package library.book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class BookStoreMain {
	static Set<BookStore> book = new HashSet<>();
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String isbn1, authorName1;
		double price1;
		int quantity1,category1;
		

//		book.add(new BookStore())

		class ComparatorAuthorName implements Comparator<BookStore> {

			@Override
			public int compare(BookStore o1, BookStore o2) {
				int value = o1.getAuthorName().compareTo(o2.getAuthorName());
				return value;
			}

			}
		class ComparatorAuthorCat implements Comparator<BookStore> {

			@Override
			public int compare(BookStore o1, BookStore o2) {
				int value = o1.getCat().compareTo(o2.getCat());

				return 0;
			}
		}

		int choice;

		do {

			System.out.println("0. Exit");
			System.out.println("1. Accept Book Collection");
			System.out.println("2. Display All Books");
			System.out.println("3. Sort The Book Details As Per Category");
			System.out.println("4. Sort The Book Details As Per Author");
			System.out.println("5. Find Book By ID");
			System.out.print("Entet your choice - ");
			choice = sc.nextInt();

			switch (choice) {
			case 0:
				System.out.println("Thanks For Visiting Our Book Store !!!");
				break;

			case 1:
				 
				Category c[] = Category.values();
				System.out.println("Enter Details of Book - ");
				System.out.print("Enter Book Number ");
				isbn1 = sc.next();
				System.out.print("Enter Book Author Name ");
				authorName1 = sc.next();
				System.out.print("Enter Book Price ");
				price1 = sc.nextDouble();
				System.out.print("Enter Book Quantity ");
				quantity1 = sc.nextInt();
				for (Category cat : c) {
					System.out.println(cat.ordinal() +" "+ cat.name());
				}
				System.out.print("Enter Book Catogery ");
				category1= sc.nextInt();
				
//				BookStore bs = new BookStore(isbn1,authorName1,price1,quantity1);
//				book.add(bs);
								// OR
				book.add(new BookStore(isbn1, authorName1, price1, quantity1,category1));
//				BookStore add1 = new BookStore();
//				Accept(sc);
				
				

				break;

			case 2:
				for (BookStore bookStore : book) {
					System.out.println(bookStore);
				}
				
				break;

			case 3 :
				List<BookStore> list1 = new ArrayList<>(book);
				
				Comparator<BookStore> bs1 = new ComparatorAuthorCat();
				Collections.sort(list1,bs1);
				for (BookStore bookStore : list1) {
					System.out.println(bookStore);
				}
				break;
			case 4:
				List<BookStore> list = new ArrayList<>(book);
			
				Comparator<BookStore> bs = new ComparatorAuthorName();
				Collections.sort(list, bs);
//				list.sort( bs);
				for (BookStore bookStore : list) {
					System.out.println(bookStore);
				}
				break;
				
			case 5: {
				BookStore tempbook = new BookStore();
				String bokid;
				System.out.println("Enter a book id You want to Search :");
				bokid = sc.next();
				tempbook.setIsbn(bokid);
				ArrayList<BookStore> ABook = new ArrayList<>();
				ABook.addAll(book);
				
				if (ABook.contains(tempbook)) {
					int i= ABook.indexOf(tempbook);
					System.out.println(ABook.get(ABook.indexOf(tempbook)));
				} else {
					System.out.println("Book is not in library");
				}
				break;
				
			}
				
			}

		} while (choice != 0);

	}
	
	public static void Accept(Scanner sc)
	{
		
		//Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Details of Book - ");
//		System.out.print("Enter Book Number ");
//		String isbn = sc.next();
//		System.out.print("Enter Book Author Name ");
//		String authorName = sc.next();
//		System.out.print("Enter Book Price ");
//		double price = sc.nextDouble();
//		System.out.print("Enter Book Quantity ");
//		int quantity = sc.nextInt();
//		Category c [] = Category.values(); 
//		for (Category category : c) {
//			System.out.println(category.ordinal()+ " "+category.name());
//		}
//		System.out.print("Enter Book Catogery ");
//		Category cat = Category.valueOf(sc.next().toUpperCase());
//		 BookStore add = new BookStore(isbn,authorName,price,quantity,cat);
//		 book.add(add);
//		
	}

}
