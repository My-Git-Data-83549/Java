/*
 Q1. Create a class called Invoice that a hardware store might use to represent an invoice for an item
sold at the store. An Invoice should include four pieces of information as fields—a part number
(type String), a part description (type String), a quantity of the item being purchased (type int) and a
price per item (double). Your class should have a constructor
that initializes the four instance variables. Provide a set and a get method for each instance variable.
calculates the invoice amount (i.e. multiplies the quantity by the price per item), then returns the
amount as a double value.
If the quantity is not positive, it should be set to 0.
If the price per item is not positive, it should be set to 0.0.
Write a test application named InvoiceTest that demonstrate class Invoice’s capabilities.
 */

package com.app.invoice;

public class Invoice 
{
	private String number;
	private String description;
	private int quantity;
	private double price;
	
//	public Invoice()
//	{
//		System.out.println("Inside Parameterless Constructor - ");
//		number = " ";
//		description = " ";
//		quantity = 0;
//		price = 0.0;
//		
//	}
	
	public Invoice(String number, String description, int quantity, double price)
	{
		this.number=number;
		this.description=description;
		this.quantity=quantity;
		this.price=price;
	}
	
	public void setNumber(String number)
	{
		this.number=number;
	}
	
	public String getNumber()
	{
		return number;
	}
	
	public void setDescription(String description)
	{
		this.description=description;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public void setQuantity(int quantity)
	{
		this.quantity=quantity;
	}
	
	public int getQuantity()
	{
		return quantity;
	}
	
	public void setPrice(double price)
	{
		this.price=price;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public double invoice()
	{
		 if(quantity < 0)
		 {
			 setQuantity(0);
		 }
		 else if(price < 0)
		 {
			 setPrice(0.0);
		 }
		 
		 return quantity*price;
	}
	
	public void calculateAmount()
	{
		
		System.out.println("===========================");
		System.out.println("Number - " + "Description  " + "Quantity" + "Price");
		System.out.println("Amount - "+invoice());
		System.out.println("===========================");
	}
	
}
