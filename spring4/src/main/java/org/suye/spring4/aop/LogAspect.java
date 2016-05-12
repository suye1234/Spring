/**
 * 
 */
package org.suye.spring4.aop;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

/**
 * @author ye.su
 *
 */
@Aspect
@Component
public class LogAspect {
	
	@Pointcut("@annotation(org.suye.spring4.aop.Action)")
	public void annotationPointCut(){};

	
	@After("annotationPointCut()")
	public void after(JoinPoint joinPoint){
		MethodSignature signature = (MethodSignature)joinPoint.getSignature();
		
		Method method = signature.getMethod();
		
		Action action = method.getAnnotation(Action.class);
		
		System.out.println("Annotation Interceptor " + action.name());
	}
	
	
	@Before("execution(* org.suye.spring4.aop.DemoMethodService.*(..))")
	public void before(JoinPoint joinPoint){
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		
		Method method = signature.getMethod();
		
		System.out.println("Method rule interceptor " + method.getName());
		
	}
}
