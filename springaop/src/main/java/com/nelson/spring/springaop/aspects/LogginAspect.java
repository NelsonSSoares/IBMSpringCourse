package com.nelson.spring.springaop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LogginAspect {
	@Before("exection(* com.nelson.spring.springaop.ProductServiceImpl.multiply(..))")
	void logBefore(JoinPoint joinPoint) {
		System.out.println("Before Calling the method");
	}
	@After("exection(* com.nelson.spring.springaop.ProductServiceImpl.multiply(..))")
	void logAfter(JoinPoint joinPoint) {
		System.out.println("After the method invocation");
	}
	
}
