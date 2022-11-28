package com.Spring.aop.fifth;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AfterThrowingAdviceTest {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		BookService bookService = ctx.getBean(BookService.class);
		
		bookService.getBookByAuthor();
		
		try {
			
			bookService.searchBooks("Java");
			
			bookService.searchBooks("Python");
			
		} catch (Exception e) {
			//e.printStackTrace();
		}
		
		

	}

}