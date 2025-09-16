package com.example.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerApp {
     @GetMapping("/")
	public String hello() {
		return "Hello from Dockerized Java (Spring Boot)! Time : " +  LocalDateTime.now();
	}
}
