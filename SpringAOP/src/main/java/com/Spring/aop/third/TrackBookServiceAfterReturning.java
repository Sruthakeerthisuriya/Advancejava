package com.Spring.aop.third;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class TrackBookServiceAfterReturning {
	
	@AfterReturning(pointcut = "execution(int BookService.*(..))", returning = "result")
	public void myAdvice(JoinPoint jp, Object result) {
		System.out.println("Logging from Aspect AFTER RETURNING calling " + jp.getSignature() + " and result is " + result);
	}
}