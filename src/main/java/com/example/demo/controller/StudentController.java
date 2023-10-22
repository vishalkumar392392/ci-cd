package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@GetMapping("/message")
	public String getMessage() {
		return "Congratulations you successfully deployed into K8..";
	}
	
	@GetMapping("/test")
	public String test() {
		return "test";
	}
}
