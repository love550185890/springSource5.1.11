package com.study.myspring.demo;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Description
 * @Author 550185890@qq.com
 * @Date 2019年10月10日02:30:25
 */
@Component
public class Dog {
	public Dog() {
		System.out.println("Dog...constructor...");
	}

	@PostConstruct
	public  void  init(){
		System.out.println("Dog...init...");
	}

	@PreDestroy
	public void destory(){
		System.out.println("Dog...destory");
	}
}
