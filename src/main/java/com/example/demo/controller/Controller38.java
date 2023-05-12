package com.example.demo.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;
import com.example.demo.mapper.*;

@RequestMapping("sub38")
@RestController
//@Controller
//@ResponseBody
public class Controller38 {
	
	@Autowired
	Mapper02 mapper;
	
	@GetMapping("link20")
	public List<String> method20() {
		return mapper.sql1();
	}
	
	@GetMapping("link21")
	public List<Dto07> method21() {
		return mapper.sql3();
	}
	
	@GetMapping("link22")
	public List<Dto08> method22(Integer cid) {
		return mapper.sql7(cid);
	}

}
