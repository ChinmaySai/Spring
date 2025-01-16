
package com.chinmay.app;

import java.beans.ConstructorProperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {
	
	@Value("29")
	private int age;
	@Autowired 
	@Qualifier("com1")
	private Computer com;


	public Computer getCom() {
		return com;
	}

	//@Autowired             //Setter Injection
	//@Qualifier("com1")
	public void setCom(Computer com) {
		this.com = com;
	}

		public int getAge() {
		return age;
	}

	public void setAge(int age) {
		//System.out.println("Inside the Setter Method");
		this.age = age;
	}

	public Alien() {
	System.out.println("Alien Object Created");
	}
	//@Autowired   //Constructor Injection
	public Alien(Computer com)
	{
		this.com=com;
	}

	public void code()
	{
	System.out.println("Coding");
	com.compile();
	}
}
