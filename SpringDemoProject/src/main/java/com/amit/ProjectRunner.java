package com.amit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ProjectRunner implements CommandLineRunner{
	
	@Autowired
	private Controller controller = new Controller();
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Runner ========> ");
		controller.home("Amit");
	}

}

