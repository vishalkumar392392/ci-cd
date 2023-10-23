package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@GetMapping("/message")
	public String getMessage() {
		return "Congratulations you successfully deployed into K8..";
	}
	
	@GetMapping("/test/v2")
	public String test() {
		return "test v2";
	}
}
