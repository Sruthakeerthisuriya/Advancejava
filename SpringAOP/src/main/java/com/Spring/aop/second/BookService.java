package com.Spring.aop.second;


public class BookService {
	
	public void getBookById() {
		System.out.println("Book -> getBookById");
	}
	
	public void getBookByName() {
		System.out.println("Book -> getBookByName");
	}
	
	public void getBookByAuthor() {
		System.out.println("Book -> getBookByAuthor");
	}
	
	public void getBookByPriceLessThan() {
		System.out.println("Book -> getBookByPriceLessThan");
	}
	
	public int addBook() {
		System.out.println("Book -> addBook");
		return 5;
	}
	
	public int deleteBook() {
		System.out.println("Book -> deleteBook");
		return 5;
	}
	
	private void sortBooks() {
		System.out.println("Book -> sortBooks");
	}
}