package com.example.demo.controller;

import java.time.*;
import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;
import com.example.demo.mapper.*;

@Controller
//@RestController
@RequestMapping("sub39")
public class Controller39 {
	
	@GetMapping("view")
	public void view() {
		
	}
	
	@GetMapping("link1")
	@ResponseBody
	public String method1() {
		return "hello ajax";
	}
	
	//잘못된 요청
	@GetMapping("link2")
	@ResponseBody
	public ResponseEntity method2() {
		return ResponseEntity.badRequest().build();
	}
	
	@GetMapping("link3")
	public ResponseEntity method3() {
		return ResponseEntity.ok().build();
	}
	
	@GetMapping("link4")
	public ResponseEntity method4() {
		return ResponseEntity.internalServerError().build(); // 500번 에러 (서버에러)
	}
	
	@GetMapping("link9")
	@ResponseBody
	public String method9() {
		return "hello ajax!@!@";
	}
	
	@GetMapping("link10")
	@ResponseBody
	public String method10() {
		String date = LocalDate.now().toString();
		return date;
	}
	
	@GetMapping("link11")
	@ResponseBody
	public Map<String, Object> method11() {
		return Map.of("name","park","age",20);
	}
	
	@GetMapping("link12")
	@ResponseBody
	public Map<String, Object> method12() {
		return Map.of("address","seoul-incheon","city","seoul","phone","010-2222-3333");
	}
	
	static class Dto1 {
		public String getAddress() {
			return "seoul";
		}
		public String getCity() {
			return "jeju";
		}
		public String getPhone() {
			return "010";
		}
	}
	
	@GetMapping("link13")
	@ResponseBody
	public Dto1 method13() {
		return new Dto1();
	}

	@GetMapping("link14")
	@ResponseBody
	public List<String> method14() {
		return List.of("kang", "back", "song");
	}
	
	@Autowired
	Mapper02 mapper;
	
	@GetMapping("link15")
	@ResponseBody
	public List<Dto08> method21(Integer cid) {
		return mapper.sql7(cid);
	}
}
