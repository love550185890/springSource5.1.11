package com.study.myspring.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @Description
 * @Author
 * @Date 2019年10月10日01:58:35
 */
@Configuration
public class MainConfigurationMyTest {

	//@Scope(value = "prototype")
	@Bean(initMethod = "init",destroyMethod = "destory")
	public Car car(){
		return new Car();
	}

}
