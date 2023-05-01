package com.example.demo.controller;

import java.io.*;
import java.util.*;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.*;

import lombok.*;

@Controller
@RequestMapping("sub29")
public class Controller29 {
	
	// 경로 : /sub29/link1?name=son&age=33
	@GetMapping("link1")
	public void method1() {
		
	}
	
	
	@PostMapping("link2")
	public void method2(@RequestParam("myfile") MultipartFile file) {
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getSize());
	}
	
	@GetMapping("link3")
	public void method3() {
		// 파일 input이 있는 form을 포함한 뷰(link3.jsp)로 포워드
	}
	
	@PostMapping("link4")
	public void method4(@RequestParam("files") MultipartFile[] file) {
		for (MultipartFile f : file) {	
		System.out.println(f.getOriginalFilename());
		System.out.println(f.getSize());
		}
	}
	
	@GetMapping("link5")
	public void method5() {
		
	}
	
	@PostMapping("link6")
	public void method6(@RequestParam("files") MultipartFile[] f) {
		for (MultipartFile file :  f) {
			System.out.println(file.getOriginalFilename());
			System.out.println(file.getSize());
		}
	}
	
	@GetMapping("link7")
	public void method7() {
		
	}
	
	@Data
	static class Sub29Dto {
		private String name;
		private Integer age;
		
	}
	
	@PostMapping("link8")
	public void method8(Sub29Dto dto,
			@RequestParam("files") MultipartFile[] files) {
		System.out.println(dto);
	
		
		for(MultipartFile file : files) {
			System.out.println(file.getOriginalFilename());
			System.out.println(file.getSize());
		}
	}
	
	@GetMapping("link9")
	public void method9() {
		
	}
	
	@PostMapping("link10")
	public void method10(@RequestParam("file1") MultipartFile file) {
		
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getSize());
		
		try (InputStream fis = file.getInputStream();
				BufferedInputStream bis = new BufferedInputStream(fis);) {
			
			String targetFileName = "copy_" + file.getOriginalFilename();
			
			try (FileOutputStream fos = new FileOutputStream(targetFileName);
					BufferedOutputStream bos = new BufferedOutputStream(fos)) {
				
				byte[] datas = new byte[1024];
				int len = 0;
				while ((len = bis.read(datas)) != -1) {
					System.out.println(Arrays.toString(datas));
					bos.write(datas, 0, len);
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@PostMapping("link11")
	public void method11(@RequestParam("file1") MultipartFile file) throws Exception {
		
		File target = new File("c:/study/copy11_" + file.getOriginalFilename());
		file.transferTo(target);
		
	}

}
