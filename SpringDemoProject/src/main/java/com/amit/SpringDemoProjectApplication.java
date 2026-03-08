package com.amit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(excludeName={
"org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration",
"org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration"
})
public class SpringDemoProjectApplication {

	public static void main(String[] args) {
		System.out.println("Application Start -------> ");
		SpringApplication.run(SpringDemoProjectApplication.class, args);
		System.out.println("Application Ends -------> ");
	}

}
