package com.example.demo.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("sub3")
public class controller03 {
	
	@RequestMapping("link1")
	public void method1() {
		System.out.println("method1이 실행됨");
	}
	
	@RequestMapping("link2")
	public void method2() {
		System.out.println("method2가 실행됨");
	}

}
