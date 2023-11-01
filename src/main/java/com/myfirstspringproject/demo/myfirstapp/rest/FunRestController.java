package com.myfirstspringproject.demo.myfirstapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	
//	expose "/" that return Hello World
	
	@GetMapping("/")
public String helloworld() {
		return "Hello World from faiza";
	}
	
	@GetMapping("/workout")
	public String workout() {
			return "Running 5k today";
		}
	
	@Value("${coach.name}")
			private String coachName;
	
	@Value("${team.name}")
			private String teamName;
	
	@GetMapping("/teaminfo")
	public String TeamInfo() {
			return "Coach name is: " +coachName+ " and Team name is:   "+teamName  ;
		}
}
