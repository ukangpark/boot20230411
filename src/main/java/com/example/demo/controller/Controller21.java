package com.example.demo.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;
import com.example.demo.mapper.*;

@Controller
@RequestMapping("sub21")
public class Controller21 {
	
	@Autowired
	private Mapper02 mapper;
	
	@RequestMapping("link1")
	public void method1() {
		/*
		 * String sql = """ SELECT CustomerName FROM Customers """;
		 */
		List<String> list = mapper.sql1();
		/*
		 List<String> list = new ArrayList<>();
		 ResultSet rs = stmt.execueQuery(sql);
		 while (rs.next) {
		 	list.add(rs.getString(1));
		 }
		  */
		System.out.println(list);
		list.forEach(System.out::println);;
	}
	
	@RequestMapping("link2")
	public void method2() {
		
		List<String> list2 = mapper.sql2();
		list2.forEach(System.out::println);
	}
	
	@RequestMapping("link3")
	public void method3() {
		List<Dto07> names = mapper.sql3();
		System.out.println(names);
		names.forEach(System.out::println);
	}
	
	@RequestMapping("link4")
	public void method4() {
		List<Dto08> names = mapper.sql4();
		names.forEach(System.out::println);
	}
	
	@RequestMapping("link5")
	public void method5(Integer id) {
		List<String> names = mapper.sql5(id);
		names.forEach(System.out::println);
	}
	
	@RequestMapping("link6")
	public void method6(String country) {
		List<String> names = mapper.sql6(country);
		names.forEach(System.out::println);
	}
	
	@RequestMapping("link7")
	public void method7(Integer cid) {
		List<Dto08> names = mapper.sql7(cid);
		names.forEach(System.out::println);
	}

}
