package com.example.demo.conponent;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

@Component
public class ComponentE {
	
	@Autowired
	private ComponentD comp;
	
	public ComponentD getComp() {
		return comp;//comp라는 객체를 꺼냈을 때
	}

}
