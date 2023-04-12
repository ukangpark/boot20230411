package com.example.demo.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("sub5")
public class controller05 {

	@RequestMapping("link1")
	public void method01(String name, int age, double score ) {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("점수: " + score);
	}
	
	@RequestMapping("link3")
	public void method03(String address, double height, double width) {
		System.out.println(address);
		System.out.println(height);
		System.out.println(width);
	}
	
}
