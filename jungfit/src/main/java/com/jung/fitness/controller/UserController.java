package com.jung.fitness.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@PostMapping("/user")
	public ResponseEntity<String> join() {
		return new ResponseEntity<String>("SUCCESS", HttpStatus.ACCEPTED);
	}
}
