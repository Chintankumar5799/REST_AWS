package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	
	@GetMapping("/greeting")
	public String hello(){

		return "hello, Final output";
//		return "changes for conflict";

	}
	
	@GetMapping("/response")
	public String response(){
		return "how are you";
	}

}
