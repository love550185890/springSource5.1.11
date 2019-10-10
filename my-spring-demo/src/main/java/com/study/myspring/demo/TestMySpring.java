package com.study.myspring.demo;

import com.study.myspring.demo.aop.MathCalResult;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Description
 * @Author
 * @Date 2019年10月9日09:25:28
 */
@ComponentScan("com.study.myspring.demo")
public class TestMySpring {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TestMySpring.class);
		MathCalResult calResult = context.getBean(MathCalResult.class);
		calResult.add(1,2);
		context.close();
	}
}
