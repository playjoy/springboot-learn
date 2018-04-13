package com.comsys.aop;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

/**
 * 自定义切面
 * @author wyd
 *
 */
@Aspect
@Component
public class CustomAspect {
	@Before("execution(* com.comsys.service.UserService.*(..))")
	public void before(JoinPoint joinPoint){
		MethodSignature  signature= (MethodSignature)joinPoint.getSignature();
		Method method = signature.getMethod();
		System.out.println("before="+method.getName());
	}
	@After("execution(* com.comsys.service.UserService.*(..))")
	public void after1(JoinPoint joinPoint){
		MethodSignature  signature= (MethodSignature)joinPoint.getSignature();
		Method method = signature.getMethod();
		
		System.out.println("after="+method.getName());
	}
}
