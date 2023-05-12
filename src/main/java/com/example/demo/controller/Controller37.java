package com.example.demo.controller;

import java.time.*;
import java.util.*;

import org.springframework.http.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import lombok.*;

@Controller
@RequestMapping("sub37")
public class Controller37 {
	
	@GetMapping("view")
	public void view() {
		
	}
	
	@GetMapping("link1")
	public ResponseEntity method1() {
		ResponseEntity res = new ResponseEntity(HttpStatusCode.valueOf(404));
		return res;
	}
	
	@GetMapping("link2")
	public ResponseEntity method2() {
		ResponseEntity res = ResponseEntity.ok().build();
		return res;
	}
	@GetMapping("link3")
	public ResponseEntity method3() {
		ResponseEntity res = ResponseEntity.notFound().build();
		return res;
	}
	
	@GetMapping("link4")
	public ResponseEntity method4() {
		
		HttpHeaders header = new HttpHeaders();
		header.add("my-header1", "my-value1");
		header.add("my-header2", "my-value2");
		ResponseEntity res = new ResponseEntity(header, HttpStatusCode.valueOf(200));
		
		return res;
	}
	
	//body추가
	@GetMapping("link5")
	public ResponseEntity method5() {
		
		ResponseEntity<String> res = new ResponseEntity<String>("hello response", HttpStatusCode.valueOf(200));
				
		return res;
	}
	
	@GetMapping("link6")
	public ResponseEntity<String> method6() {
		
		return ResponseEntity.ok("hello response");
	}
	
	@GetMapping("link7")
	public ResponseEntity<String> method7() {
		String date = LocalDate.now().toString();
		return ResponseEntity.ok(date);
	}
	
	@ResponseBody
	@GetMapping("link8")
	public String method8() {
		String date = LocalDateTime.now().toString();
		return date;
	}
	
	@ResponseBody
	@GetMapping("link9")
	public String method9() {
		String time = LocalTime.now().toString();
		return time;
	}
	
	@ResponseBody
	@GetMapping("link10")
	public String method10() {
		String data = """
				{"name" : "lee", "age" : 33}
				""";
		
		return data;
	}
	
	@GetMapping("link11")
	public ResponseEntity<String> method11() {
		String data = """
				{"name" : "lee", "age" : 33}
				""";
		
		HttpHeaders header = new HttpHeaders();
		header.set("Content-Type", "application/json");
		return new ResponseEntity(data, header, 200);
	}
	
	@GetMapping("link12")
	@ResponseBody // + 리턴 타입이 Map, JavaBean이면 
	//json string으로 변환해주고, AND Content-Type도 application/json로 셋팅해줌
	public Map method12() {
		
		Map<String, Object> map = new HashMap<>();
		map.put("name", "박지성");
		map.put("age", 44);
		
		return map;
		
	}
	
	@GetMapping("link13")
	@ResponseBody
	public Map method13() {
		
		Map<String, Object> map = new HashMap<>();
		map.put("address", "seoul");
		map.put("age", 3.14);
		
		return map;
	}
	
	@GetMapping("link14")
	@ResponseBody
	public Map<String,Object> method14() {
		var data = new HashMap<String,Object>();
		data.put("name", "cha");
		data.put("score", 33);
		data.put("married", true);
		data.put("position", null);
		data.put("child", List.of("chaA", "chaB"));
		data.put("food", Map.of("beverage", "coke", "meal", "chicken") );
		return data;
		
	}
	
	static class Dto1 {
		public String getName() {
			return "강백호";
		}
		public Integer getAge() {
			return 33;
		}
	}
	
	@GetMapping("link15")
	@ResponseBody
	public Dto1 method15() {
		Dto1 dto = new Dto1();
		
		return dto;
	}
	
	static class Dto2 {
		public String getCity() {
			return "jeju";
		}
		public Integer getScore() {
			return 20;
		}
		public Boolean isCap() {
			return true;
		}
		public List<String> getFood() {
			return List.of("pizza", "chicken", "buger");
		}
		public Dto1 getSub1() {
			return new Dto1();
		}
		public Map<String,Object> getSub2() {
			return Map.of("model", List.of("abc","def"), "price", 33.0);
		}
		
	}
	
	@GetMapping("link16")
	@ResponseBody
	public Dto2 method16() {
		Dto2 dto = new Dto2();
		return dto;
	}
	
	@GetMapping("link17")
	@ResponseBody
	public List<String> method17() {
		return List.of("java", "css", "html");
	}
	
	@GetMapping("list18")
	@ResponseBody
	public List<Map<String,Object>> method18() {
		return List.of(Map.of("name","강백호"),
				Map.of("name","강백호"),
				Map.of("name","강백호"));
				
	}
	
	@GetMapping("link19")
	@ResponseBody
	public List<Dto2> method19() {
		return List.of(new Dto2());
	}

}
