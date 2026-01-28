package com.amit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/")
	public String home() {
		System.out.println("Home Method ");
		return "*** This is Amit Jangra ***";
	}
	
	
	

	
	 
	
}

