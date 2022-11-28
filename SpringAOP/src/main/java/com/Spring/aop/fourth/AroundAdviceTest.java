package com.Spring.aop.fourth;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class AroundAdviceTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		BookService bookService = ctx.getBean(BookService.class);

		bookService.getBookByPriceLessThan();

	}

}