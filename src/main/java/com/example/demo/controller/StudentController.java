package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@GetMapping("/message")
	public String getMessage() {
		return "Congratulations you successfully deployed into K8..";
	}
	
	@GetMapping("/test/v3")
	public String test() {
		return "test v3";
	}
	
	@GetMapping("/greet")
	public String greet() {
		return "Hurry, You learned alot in few days...";
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello world....";
	}
	
	@GetMapping("/congrats")
	public String congrats() {
		return "Congrations you completed Devops Project 1 - CI/CD with Git Jenkins Ansible Kubernetes course..";
	}
}
