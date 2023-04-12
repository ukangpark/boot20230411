package com.example.demo.controller;

import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;

@Controller
@RequestMapping("sub8")
public class controller08 {

	@RequestMapping("link1")
	public String method01(@ModelAttribute("val") Dto04 dto04) {
		
		dto04.setName("채소연");
		dto04.setAge(22);
		
		return "sub7/link10";
	}
	
	@RequestMapping("link2")
	public void method02(@ModelAttribute("product") Dto02 dto02) {
		dto02.setCompany("apple");
		dto02.setModel("ipad");
		dto02.setPrice(300);
	}
	
	@RequestMapping("link3")
	public void method03(Model model) {
		Dto02 dto02 = new Dto02();
		Dto03 dto03 = new Dto03();
		
		model.addAttribute("product", dto02);
		model.addAttribute("member", dto03);
		
	}
	
	@RequestMapping("link4")
	public void method04(@ModelAttribute("product") Dto02 dto02,
						@ModelAttribute("member") Dto03 dto03) {
		//3. add attribute
		
		//4.forward
	}
	
	@RequestMapping("link5")
	public void method05(@ModelAttribute("dto02") Dto02 dto02,
						@ModelAttribute("dto03") Dto03 dto03) {
		//3. add attribute
		dto02.setCompany("microsoft");
		dto03.setName("bill gates");
		//4.forward
		
	}
	
	@RequestMapping("link6")
	public String method06(@ModelAttribute("dto02") Dto02 dto02,
			@ModelAttribute("dto03") Dto03 dto03) {
		//3. add attribute
		dto02.setCompany("apple");
		dto03.setName("stieve jobs");
		//4.forward
		return "/sub8/link5";
	}
}
