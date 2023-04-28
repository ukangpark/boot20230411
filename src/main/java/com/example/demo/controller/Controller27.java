package com.example.demo.controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.mapper.*;

@Controller
@RequestMapping("sub27")
public class Controller27 {

	@Autowired
	private Mapper07 mapper;
	
	// 경로 : /sub27/link1?s=ell
	@GetMapping("link1")
	public String method1(Model model,
			@RequestParam(value = "s", defaultValue = "") String keyword) {
		
		model.addAttribute("customerList", mapper.sql1(keyword));
		
		return "/sub13/link1";
		
	}
	
	// 경로 : /sub27/link2?search=eve
	@GetMapping("link2")
	public String method2(Model model,
			@RequestParam(value="search", defaultValue = "") String keyword) {
		
		model.addAttribute("employeeList",mapper.sql2(keyword));
		return "/sub13/link2";//직원 lastName, firstName
	}
}
