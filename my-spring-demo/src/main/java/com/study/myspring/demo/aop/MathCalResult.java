package com.study.myspring.demo.aop;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author
 * @Date
 */
@Component
public class MathCalResult {

	public int add(int a, int b) {
		System.out.println("add Method invoke ....");
		return a+b;
	}
}
