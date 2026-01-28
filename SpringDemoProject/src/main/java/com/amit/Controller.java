package com.amit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class Controller {

	@GetMapping("/")
	public String home() {
		return new String("*** This is Amit Jangra ***");
	}
	
	
	

	
	 
	
}
