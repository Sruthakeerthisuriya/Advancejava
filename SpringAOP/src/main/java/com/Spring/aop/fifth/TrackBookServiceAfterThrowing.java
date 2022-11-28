package com.Spring.aop.fifth;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TrackBookServiceAfterThrowing {
	
	@AfterThrowing(pointcut = "execution(* BookService.*(..))", throwing = "error")
	public void myAdvice(JoinPoint jp, Throwable error) {
		System.out.println("Logging from Aspect AfterThrowing calling " + jp.getSignature() + " Exception is " + error);
	}
}