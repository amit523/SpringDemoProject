package com.amit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpringDemoProjectApplication {

	public static void main(String[] args) {
		System.out.println("Application Start -------> ");
		SpringApplication.run(SpringDemoProjectApplication.class, args);
		System.out.println("Application Ends -------> ");
	}

}
