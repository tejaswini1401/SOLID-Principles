package com.SRP;

public class MarkerPen {
	String name;
	String color;
	int price;
	
	MarkerPen(String name, String color, int price){
		this.name = name;
		this.color = color;
		this.price = price;
		
	}
}
/*
class Invoice{
	private MarkerPen marker;
	private int quantity;
	
	public Invoice(MarkerPen marker, int quantity) {
		this.marker = marker;
		this.quantity = quantity;
	}
	
	public int calculateTotalPrice() {
		int price = ((marker.price) * this.quantity);
		return price;
	}
	
	public void printInvoice() {
		//printing data
	}
	
	public void saveToDb() {
		//file/db
	}
}
*/

class Invoice{
	private MarkerPen marker;
	private int quantity;
	
	public Invoice(MarkerPen marker, int quantity) {
		this.marker = marker;
		this.quantity = quantity;
	}
	
	public int calculateTotalPrice() {
		int price = ((marker.price) * this.quantity);
		return price;
	}
}

class InvoicePrinter{
	private Invoice invoice;
	public InvoicePrinter(Invoice invoice) {
		this.invoice =  invoice;
	}
	public void printInvoice() {
		//print invoice
	}
}

class InvoiceDB{
	private Invoice invoice;
	public InvoiceDB(Invoice invoice) {
		this.invoice =  invoice;
	}
	public void saveToDB() {
		//save to file/ db
	}
}
