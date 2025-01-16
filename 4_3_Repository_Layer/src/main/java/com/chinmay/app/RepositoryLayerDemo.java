package com.chinmay.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.chinmay.app.model.Alien;
import com.chinmay.app.model.Laptop;
import com.chinmay.app.service.LaptopService;


@SpringBootApplication
public class RepositoryLayerDemo {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(RepositoryLayerDemo.class, args);
           LaptopService lap=context.getBean(LaptopService.class);
           Laptop laptopinst=context.getBean(Laptop.class);
           lap.addlap(laptopinst);
		//	    System.out.println("Running the First Spring Boot Demo Application");
//	    Alien al=context.getBean(Alien.class);
//	    al.code();
	}
}
