package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

	
	
	//@Before("execution(public void add*())")  //any method call void addAccount() please call this
	//@Before("execution(void add*())") //any method call void add*() please call this
	//@Before("execution(* add*(..))") //any method call "any return type" add*() please call this
	
	
	@Before("forDaoPackageNoGetterSetter()")   //any method call "any return type" add*() please call this
	public void beforeAddAccountAdvice() {
		
		System.out.println("\n=====>>> Executing @Before advice on method");
	}
	
	@Before("forDaoPackageNoGetterSetter()")
	public void performApiAnalytics() {
		
		System.out.println("\n=====>>> Performing API analytics");
	}
	
	@Before("forDaoPackageNoGetterSetter()")
	public void logToCloudAsync() {
		
		System.out.println("\n=====>>> Logging to Cloud in async fashion");
	}
	
}
