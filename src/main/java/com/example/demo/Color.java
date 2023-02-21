package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Color {
	@RequestMapping("/color")
	public String getMyfav() 
	{
		String color="Green";
		return "My favorite color is "+color;
	}
	

}
