package com.example.spring.event;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Autowired
	private UserService service;
	
	@PostMapping("/addUser")
	public String addUser(@RequestBody Map<String,String> request) {
		
		
		this.service.addUser(request.get("name"));
		
		return "success";
	}
}
