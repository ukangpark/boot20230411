package com.example.demo.conponent;

public class ComponentA {
	
	private ComponentB comp; //필드로 가지고 있으려면, 
	
	// 1. 생성자 생성해서 가지기
	public ComponentA(ComponentB comp) {
		this.comp = comp;
	}
	
	// 2. set메소드를 생성해서 가지기
	public void setComp(ComponentB comp) {
		this.comp = comp;
	}
	
	public ComponentB getComp() {
		return comp;
	}

}
