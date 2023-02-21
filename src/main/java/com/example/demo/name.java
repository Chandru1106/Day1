package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class name {
	@RequestMapping("/")
	public String getName() 
	{
		String stdname="Chandru";
		return "Welcome "+stdname+"!";
	}
	

}
