package com.Spring.aop.second;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TrackBookServiceAfter {
	@Pointcut("execution(* BookService.*(..))")
	public void myPointcut() {}
	
	@After("myPointcut()")
	public void myAdvice(JoinPoint jp) {
		System.out.println("Logging from Aspect AFTER calling " + jp.getSignature());
	}
}