package com.jeevs_dolphin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DolphinJeevsController {
	
	@GetMapping(value = "/printSomething")
	public String printSomething() {
		
		return "Radhe Krishna";	
	}
}