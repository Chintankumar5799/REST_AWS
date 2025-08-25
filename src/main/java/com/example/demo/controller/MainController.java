package com.example.demo.controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.controller.repository.NameRepo;
import com.example.demo.entity.NameList;

@RestController
public class MainController {
	
	@Autowired
	private NameRepo nameRepo;

	
	
	@GetMapping("/greeting")
	public String hello(){
		return "hello, Final output, for QA";
	}
	
	@GetMapping("/getName")
	public Optional<NameList> getName(@RequestParam int id){
		return nameRepo.findById(id);
	}
	
	@PostMapping("/addName")
	public String addName(@RequestBody NameList nameList) {
		nameRepo.save(nameList);
		return "Saved successfully";
		
	}

}
