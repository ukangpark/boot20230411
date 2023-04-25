package com.example.demo.config;

import org.springframework.context.annotation.*;

import com.example.demo.conponent.*;
import com.example.demo.domain.*;

@Configuration
public class MyConfig1 {

	@Bean
	public Object bean1() {
		return new Object();
	}
	
	@Bean
	public Employee employee() {
		return new Employee();
	}
	
	@Bean
	public ComponentA bean2() {
		
	ComponentA o = new ComponentA(bean3()); // combponentB에 의존하고있으니까
	return o;
	}
	
	@Bean
	public ComponentB bean3() {
		return new ComponentB();
	}
	
	@Bean
	public ComponentC bean4() {
		ComponentC o = new ComponentC();
		o.set(bean3());
		
		return o;
	}
}
