package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	
	@GetMapping("/greeting")
	public String hello(){
//		return "hello";
		return "changes for conflict for branch2";
	}
	
	@GetMapping("/response")
	public String response(){
		return "how are you";
	}

}
