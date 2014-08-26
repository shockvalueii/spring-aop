package com.theRed.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class BeforeAspect {
	@Before("execution(public void run())")
	public void beforeMotoRunning(JoinPoint joinPoint) {

		System.out.println("before vehicle is running!");
		System.out.println("hijacked : " + joinPoint.getSignature().getName());
		System.out.println("******");
	}
}
