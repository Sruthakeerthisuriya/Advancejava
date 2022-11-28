package com.Spring.aop.third;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class AfterReturningAdviceTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		BookService bookService = ctx.getBean(BookService.class);

		bookService.getBookByAuthor();
		
		bookService.addBook();
		
		bookService.deleteBook();

	}

}