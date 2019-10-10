package com.study.myspring.demo.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author
 * @Date
 */
@Component
@EnableAspectJAutoProxy
@Aspect
public class LogAspect {

	@Pointcut(value = "execution(public int com.study.myspring.demo.aop..*.*(..))")
	public void pointCut(){

	}
	@Before(value = "pointCut()")
	public void logStart(){
		System.out.println("before++++++++++++++++++++++++");
	}

	@After(value = "pointCut()")
	public void logAfter(){
		System.out.println("after+++++++++++++++++++++");
	}
}
