package com.example.spring.boot.profile;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Profile;

@Profile("dev")
@org.springframework.context.annotation.Configuration
public class Configuration {
	
	@PostConstruct
	public void execute() {
		System.out.println("Dev specific configuration");
	}

}
