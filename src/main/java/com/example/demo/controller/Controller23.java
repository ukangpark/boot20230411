package com.example.demo.controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.mapper.*;

@Controller
@RequestMapping("sub23")
public class Controller23 {
	
	@Autowired
	private Mapper04 mapper;
	
	@RequestMapping("link1")
	public void method1() {
		int cnt = mapper.sql1();
		System.out.println(cnt + "개 행 삭제됨");
	}
	
	@RequestMapping("link2")
	public void method2(Integer id) {
		int cnt = mapper.sql2(id);
		System.out.println(cnt + "개 행이 삭제됨");
	
	}
	
	@RequestMapping("link3")
	public void method3(Integer key) {
		int cnt = mapper.sql3(key);
		System.out.println(cnt + "개 행이 삭제됨");
	}

}
