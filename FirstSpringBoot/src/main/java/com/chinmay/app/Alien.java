package com.chinmay.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Alien {

	@Autowired
	Laptop lop;
	public void code()
	{
		lop.compile();
	}
}
