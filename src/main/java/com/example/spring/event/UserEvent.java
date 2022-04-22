package com.example.spring.event;

public class UserEvent {

	private String name;

	public UserEvent(String name) {

		this.name = name;
	}
	
	
	public String getName() {
		
		return this.name;
	}
}
