package com.theRed.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class BeforeAspect {
	@Before("execution(public void  run())")
	public void beforeVehicleRunning(JoinPoint joinPoint) {

		System.out.println("before from: " + joinPoint.getSignature().getDeclaringType().toString());
		System.out.println("hijacked : " + joinPoint.getSignature().getName());
		System.out.println("******");
	}
	
	@After("execution(public void run())")
	public void afterVehicleRunning(JoinPoint joinPoint) {

		System.out.println("******");
		System.out.println("after from: " + joinPoint.getSignature().getDeclaringType().toString());
		System.out.println("hijacked : " + joinPoint.getSignature().getName());
		System.out.println("******");
	}
}
