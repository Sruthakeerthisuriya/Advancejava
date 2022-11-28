package com.Spring.aop.first;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TrackBookServiceBefore {
	
	@Pointcut("execution(* BookService.get*(..))")
	public void myPointcut() {}
	
	@Before("myPointcut()")
	public void myAdvice(JoinPoint jp) {
		System.out.println("Logging from Aspect BEFORE calling " + jp.getSignature());
	}
	

}
	