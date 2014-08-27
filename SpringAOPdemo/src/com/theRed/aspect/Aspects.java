package com.theRed.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Aspects {
	@Before("execution(public void  run())")
	public void beforeVehicleRunning(JoinPoint joinPoint) {

		System.out.println("before from: "
				+ joinPoint.getSignature().getDeclaringType().toString());
		System.out.println("hijacked : " + joinPoint.getSignature().getName());
		System.out.println("******");
	}

	@After("execution(public void run())")
	public void afterVehicleRunning(JoinPoint joinPoint) {

		System.out.println("******");
		System.out.println("after from: "
				+ joinPoint.getSignature().getDeclaringType().toString());
		System.out.println("hijacked : " + joinPoint.getSignature().getName());
		System.out.println("******");
	}

	@AfterReturning(pointcut = "execution(public String in())", returning = "fuel")
	public void afterReturningFuelIn(JoinPoint joinPoint, Object fuel) {

		System.out.println("after fuel return in(): "
				+ joinPoint.getSignature().getDeclaringType().toString());
		System.out.println("hijacked : " + joinPoint.getSignature().getName());
		System.out.println("Method returned value is : " + fuel);
		System.out.println("******");
	}
	@AfterThrowing(pointcut = "execution(public void throwExceptionFuelIn())", throwing = "error")
	public void throwingExeption(JoinPoint joinPoint, Throwable error) {

		System.out.println("Exeption in "
				+ joinPoint.getSignature().getDeclaringType().toString());
		System.out.println("hijacked : " + joinPoint.getSignature().getName());
		System.out.println("Error : " + error);
		System.out.println("******");
	}

}
