package com.Spring.aop.second;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class AfterAdviceTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		BookService bookService = ctx.getBean(BookService.class);

		bookService.getBookByAuthor();

	}

}