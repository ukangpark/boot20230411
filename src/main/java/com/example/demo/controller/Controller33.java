package com.example.demo.controller;

import org.springframework.security.core.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("sub33")
public class Controller33 {
	
	@GetMapping("mylogin")
	public void loginForm() {
		
	}
	
	@GetMapping("loginSuccess")
	public void loginSuccess() {
		
	}
	
	@GetMapping("viewAuth")
	public void viewAuth(Authentication authentication) {
		System.out.println("로그인 정보 확인");
		System.out.println(authentication.getName());
	}

}
