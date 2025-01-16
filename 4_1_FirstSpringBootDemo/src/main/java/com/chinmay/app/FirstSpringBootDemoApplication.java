package com.chinmay.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class FirstSpringBootDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(FirstSpringBootDemoApplication.class, args);
	    System.out.println("Running the First Spring Boot Demo Application");
	    Alien al=context.getBean(Alien.class);
	    al.code();
	}
}
