package com.study.myspring.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author
 * @Date 2019年10月10日02:20:01
 */
@Component
public class Cat implements InitializingBean, DisposableBean {


	public Cat() {
		System.out.println("Cat.....constructor.....");
	}

	@Override
	//容器销毁调用
	public void destroy() throws Exception {
		System.out.println("Cat.....destroy.....");
	}

	@Override
	//Bean所有的属性设置完毕后执行
	public void afterPropertiesSet() throws Exception {
		System.out.println("Cat.....init.....");
	}
}
