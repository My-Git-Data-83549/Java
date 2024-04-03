package com.app.invoice;

public class InvoiceTest {

	public static void main(String[] args) {
		Invoice in = new Invoice("1"," Blank ",5,100.0);
		in.calculateAmount();
	}

}
