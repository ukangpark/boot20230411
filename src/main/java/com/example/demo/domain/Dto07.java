package com.example.demo.domain;

import lombok.*;

public class Dto07 {

	private String lastName;
	private String firstName;
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	@Override
	public String toString() {
		return "Dto07 [lastName=" + lastName + ", firstName=" + firstName + "]";
	}
	
	
	
	
	
	
}
