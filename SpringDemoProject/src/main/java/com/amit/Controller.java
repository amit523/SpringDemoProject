package com.amit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@Autowired
	private UserRepositoey  repo;

	@GetMapping("/{name}")
	public String home(@PathVariable String name) {
		
		User u1 = new User( name);
		repo.save(u1);
		System.out.println(name+" saved in database...");
		System.out.println("Home Method ");
		return "*** This is Amit Jangra ***";
	}
	
	
	

	
	 
	
}


