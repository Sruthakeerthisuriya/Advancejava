package com.Spring.aop.first;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeforeAdviceTest {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Appconfig.class);
		
		BookService bs = ctx.getBean(BookService.class);
		
		bs.getBookByAuthor();
		
		bs.addBook();

	}

}