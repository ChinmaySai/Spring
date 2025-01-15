
package com.chinmay.componentannotation;

import java.beans.ConstructorProperties;

import org.springframework.stereotype.Component;

@Component
public class Alien {
	
	private int age;
	private Computer com;


	public Computer getCom() {
		return com;
	}

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

	public void code()
	{
	System.out.println("Coding");
	com.compile();
	}
}
