package com.Spring.aop.fourth;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TrackBookServiceAround {
	@Pointcut("execution(* BookService.*(..))")
	public void myPointcut() {}
	
	@Around("myPointcut()")
	public Object myAdvice(ProceedingJoinPoint jp) throws Throwable {
		System.out.println("Logging from Aspect BEFORE calling " + jp.getSignature());
		Object obj = jp.proceed();
		System.out.println("Logging from Aspect AFTER calling " + jp.getSignature());
		return obj;
	}
}