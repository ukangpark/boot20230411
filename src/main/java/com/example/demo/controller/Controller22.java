package com.example.demo.controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;
import com.example.demo.mapper.*;

@Controller
@RequestMapping("sub22")
public class Controller22 {
	
	@Autowired
	private Mapper03 mapper;
	
	@RequestMapping("link1")
	public void method1() {
		int cnt1 = mapper.sql1(77, "java");
		int cnt2 = mapper.sql1(77, "spring");
		int cnt3 = mapper.sql1(77, "scc");
		
		System.out.println(cnt1);
		System.out.println(cnt2);
		System.out.println(cnt3);
	}
	
	@RequestMapping("link2")
	public void method2( ) {
		int cnt1 = mapper.sql2(3.14, "실수");
		int cnt2 = mapper.sql2(1.21, "실수2");
		
		System.out.println(cnt1 + "개 행 입력됨");
		System.out.println(cnt2 + "개 행 입력됨");
		
	}
	
	@RequestMapping("link3")
	public void method3(Double val1, String val2) {
		int cnt = mapper.sql2(val1, val2);
		System.out.println(cnt + "개 행이 추가됨");
	}
	
	@RequestMapping("link4")
	public void method4() {
		Dto09 dto = new Dto09();
		dto.setProp1(300);
		dto.setProp2("hello mybatis");
		dto.setProp3(33.33);
		
		int cnt = mapper.sql3(dto);
		System.out.println(cnt + "개 행이 추가됨");
	}
	
	@RequestMapping("link5")
	public void method5() {
		Dto10 dto = new Dto10();
		dto.setName("손흥민");
		dto.setAge(33);
		dto.setScore(99.99);
		
		int cnt = mapper.sql5(dto);
		System.out.println(cnt + "개 행이 추가됨");
		
		
	}
	
	
	@RequestMapping("link6")
	public void method6(@ModelAttribute Dto10 dto) {
		int cnt = mapper.sql5(dto);
		System.out.println(cnt);
	}
	
	@RequestMapping("link7")
	public void method7(Dto09 dto) {
		int cnt = mapper.sql3(dto);
		System.out.println(cnt + "개 행이 추가됨");
	}
	
	@RequestMapping("link8")
	public void method8() {
		Dto09 dto1 = new Dto09();
		Dto10 dto2 = new Dto10();
		dto1.setProp1(354);
		dto2.setName("서태웅");
		dto1.setProp3(3.33);
		int cnt = mapper.sql6(dto1, dto2);
		System.out.println(cnt + "개 행이 입력됨");
	}
	
	@RequestMapping("link9")
	public void method9() {
		Dto09 dto1 = new Dto09();
		Dto10 dto2 = new Dto10();
		dto1.setProp1(1);
		dto2.setAge(22);
		dto1.setProp2("abc");
		dto2.setName("2abc");
		dto1.setProp3(3.14);
		dto2.setScore(99.99);
		
		int cnt = mapper.sql7(dto1, dto2);
		System.out.println(cnt + "개 행이 추가됨");
		
	}
	
	// /sub22/link10?prop1=7&prop2=lunch&prop3=3.14&age=8&name=song&score=3.14
	@RequestMapping("link10")
	public void method10(Dto09 dto1, Dto10 dto2) {
		int cnt = mapper.sql7(dto1, dto2);
		System.out.println(cnt + "개 행이 추가됨");
	}
	
	@RequestMapping("link11")
	public String method11(Dto11 dto) {
		System.out.println("prop1: " + dto.getProp1());
		int cnt = mapper.sql8(dto);
		System.out.println(cnt + "행 입력 완료!!");
		System.out.println("prop1: " + dto.getProp1());
		System.out.println("prop1: " + dto.getProp1());
		
		return dto.getProp1() + "번째 데이터 입력완료";
	}
	
	@RequestMapping("link12")
	public void method12(Dto12 dto) {
		int cnt = mapper.sql9(dto);
		System.out.println(dto.getId() + "번째 id로 " + cnt + "행 입력 완료!!");
		System.out.println("id: " + dto.getId());
		
	}
	

}
