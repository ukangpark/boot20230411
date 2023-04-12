package com.example.demo.controller;

import java.util.*;

import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;

import jakarta.servlet.http.*;

@Controller
@RequestMapping("sub7")
public class controller07 {

	@RequestMapping("link1")
	public void method1(HttpServletRequest req) {
		
		//3. add attribute
		req.setAttribute("myName", "서태웅");
		
		// /WEB-INF/views/sub7/link1.jsp로 포워드됨
	}
	
	@RequestMapping("link2")
	public String method2(Model model ) {
		//3. add attribute
		model.addAttribute("myName", "채치수");
		return "/sub7/link1";
	}
	
	@RequestMapping("link3")
	public void method03(Model model) {
		model.addAttribute("address", "incheon");
	}
	
	@RequestMapping("link4")
	public void method04(Model model) {
		model.addAttribute("list", List.of("java", "spring"));
	}
	
	@RequestMapping("link5")
	public void method05(Model model) {
		model.addAttribute("myMap", Map.of("address", "incheon", "age", "30", "email", "kang@gmail.com"));
	}
	
	@RequestMapping("link6")
	public void method06(Model model) {
		model.addAttribute("name", "이한나");
		model.addAttribute("job", "매니저");
		model.addAttribute("hobby",List.of("영화", "독서", "음악"));
	}
	
	@RequestMapping("link7")
	public void method07(Model model) {
		model.addAttribute("age", "20");
		model.addAttribute("country", "korea");
		model.addAttribute("movieList", List.of("laLaLand", "aboutTime", "beginAgain"));
	}
	
	@RequestMapping("link8")
	public void method08(Model model) {
		Dto01 o1 = new Dto01();
		o1.setName("박지성");
		o1.setAge(40);
		
		model.addAttribute("player",o1);
	}
	
	@RequestMapping("link9")
	public void method09(Model model) {
		Dto02 o2 = new Dto02();
		o2.setModel("venue");
		o2.setPrice(5000000);
		o2.setCompany("hyundai");
		
		model.addAttribute("value", o2);
	}
	
	@RequestMapping("link10")
	public void method10(Model model) {
		Dto04 obj = new Dto04();
		obj.setName("송태섭");
		obj.setAge(33);
		
		model.addAttribute("val", obj);
	}
}
