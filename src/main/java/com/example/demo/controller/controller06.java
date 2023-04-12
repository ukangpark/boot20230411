package com.example.demo.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import jakarta.servlet.http.*;

@Controller
@RequestMapping("sub6")
public class controller06 {
	
	@RequestMapping("link1")
	public String method01() {
		System.out.println("link1 메소드 일함");
		return "forward:/sub6/link2";
	}
	
	@RequestMapping("link2")
	public void method02() {
		System.out.println("link2 메소드 일함");
		
	}
	
	@RequestMapping("link3")
	public String method03() {
		System.out.println("link3 메소드 일함");
		return "forward:/sub6/link4";
	}
	
	@RequestMapping("link4")
	public void method04(HttpServletRequest req, HttpServletResponse res) throws Exception {
		System.out.println("link4 메소드 일함");
		
		String view = "/WEB-INF/views/abc.jsp";
		req.getRequestDispatcher(view).forward(req, res);
	}
	
	@RequestMapping("link5")
	public String method05() {
		
		System.out.println("link5에서 일함");
		return "forward:/WEB-INF/views/abc.jsp";
	}
	
	@RequestMapping("link6")
	public String method06() {
		return "abc";
	}
	
	@RequestMapping("link7")
	public String method07() {
		return "def";
	}
	
	@RequestMapping("link8")
	public String method8() {
		System.out.println("8번 메소드 일함");
		//default view name : /sub/link8
		return "/sub/link8";//view name 명시
	}
	
	@RequestMapping("link9")
	public void method9() {
		System.out.println("9번 메소드 일함");
		//default view name : /sub/link8
	}
	
	@RequestMapping("link10")
	public String method10() {
		
		return null; //forward default view name을 사용하여 forward하게됨. void타입과 같은 역할
	}
	
	@RequestMapping("link11")
	public String method11() {
		return "/sub6/link11";
		//return "sub6/link11"; 연속된 //는 /로 합쳐짐
	}
	
	/*
	@RequestMapping("link11")
	public String method11_1() {
		return null;
	}
	*/
	
	/*
	@RequestMapping("link11")
	public void method11_2() {

	}
	*/
	
	//1. request param 수집/가공
	//2. business logic(생략)
	//3. add attribute(생략)
	//4. /WEB-INF/views/sub6/link12.jsp 로 포워드 하는 것을 작성하겠다.
	@RequestMapping("link12")
	public void method12(String name, int age) {
	}
	

}
