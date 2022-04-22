package com.example.spring.event;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;


@EnableAsync
@SpringBootApplication
public class EventdrivenApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventdrivenApplication.class, args);
	}

}
