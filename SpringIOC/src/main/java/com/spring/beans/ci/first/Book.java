package com.spring.beans.ci.first;


public class Book {
	private String bookName;
	private double price;
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public Book(String bookName, double price) {
		super();
		this.bookName = bookName;
		this.price = price;
	}
}