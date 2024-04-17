/*Q1. Store book details in a library in hashing based data structure : HashSet
Book details : isbn(string), category(enum), price(double), authorName(string), quantity(int) .
Unique ID : isbn
Write a menu driven code that have below menus.
1. Accept book details and add in collection
2. Display all books from collection
3. Sort the book details as per category and display it.
4. Sort the book details as per author and display it.
5. Find book by id.*/


package library.book;

import java.util.Objects;
import java.util.Scanner;

public class BookStore {
	
	private String isbn;
	private String authorName;
	private double price;
	private int quantity;
	private Category cat;
	
	
	public BookStore() {
	
	}

	public BookStore(String isbn, String authorName, double price, int quantity,int ch) {
		this.isbn = isbn;
		this.authorName = authorName;
		this.price = price;
		this.quantity = quantity;
		cat= Category.values()[ch];
		//System.out.println(cat);
		this.cat=cat;
	}

	


	@Override
	public String toString() {
		return "BookStore [isbn=" + isbn + ", authorName=" + authorName + ", price=" + price + ", quantity=" + quantity
				+ ", cat=" + cat + "]";
	}

	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getAuthorName() {
		return authorName;
	}


	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
public Category getCat() {
	return cat;
}
public void setCat(Category cat) {
	this.cat = cat;
}


	@Override
	public int hashCode() {
		return Objects.hash(isbn);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookStore other = (BookStore) obj;
		return Objects.equals(isbn, other.isbn);
	}

//	@Override
//	public int compareTo(BookStore o) {
//		// TODO Auto-generated method stub
//		return 0;
//	}

	
	
	
	
	
	
	
}
