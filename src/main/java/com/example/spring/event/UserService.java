package com.example.spring.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class UserService {

	
	@Autowired
	private ApplicationEventPublisher publisher;
	
	
	public void addUser(String user) {
		
		
		System.out.println("Adding user "+user);
		
		
		this.publisher.publishEvent(new UserEvent("User Added"));
		
		System.out.println("Method ends");
	}
}
