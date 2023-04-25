package com.example.demo.controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;
import com.example.demo.mapper.*;
import com.fasterxml.jackson.annotation.JsonCreator.*;

@Controller
@RequestMapping("sub24")
public class Controller24 {
	
	@Autowired
	private mapper05 mapper;
	
	@RequestMapping("link1")
	public void method1() {
		int cnt = mapper.sql1();
		System.out.println(cnt + "개 행이 수정됨");
	}
	
	@RequestMapping("link2")
	public void method2(Integer key) {
		int cnt = mapper.sql2(key,  "마이바티스", 98765);
		System.out.println(cnt + "개 행 변경됨");
	}
	
	@RequestMapping("link3")
	public void method3() {
		int cnt = mapper.sql3(10, "새로운 고객명", "대한민국");
		System.out.println(cnt + "개 행 변경됨");
	}
	
	@RequestMapping("link4")
	public void method4() {
		Customer customer = new Customer();
		customer.setId(9);
		customer.setCity("서울");
		customer.setCountry("대한민국");
		customer.setAddress("신촌");
		customer.setName("서태웅");
		customer.setPostalCode("33333");
		int cnt = mapper.sql4(customer);
		System.out.println(cnt + "개 행 수정됨");
	}
	
	@RequestMapping("link5")
	public void method5(Customer customer) {
		int cnt = mapper.sql4(customer);
		System.out.println(cnt + "개 행 수정됨");
	}
	
	@RequestMapping("link6")
	public void method6(Integer id, Model model) {
		Customer customer = mapper.sql5(id);
		model.addAttribute("customer", customer);
	}
	
	// 직원 조회 및 수정 코드 작성
	// 직원 조회
	@RequestMapping("link7")
	public void method7(Integer id, Model model) {
		Employee employee = mapper.sql6(id);
		model.addAttribute("employee", employee);
		
	}
	
	// 직원 수정
	@RequestMapping("link8")
	public void method8(Employee employee) {
		int cnt = mapper.sql7(employee);
		System.out.println(cnt + "행이 수정됨");
	}

}
