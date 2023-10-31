package com.myfirstspringproject.demo.myfirstapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	
//	expose "/" that return Hello World
	
	@GetMapping("/")
	
public String helloworld() {
		return "Hello World";
	}
}
