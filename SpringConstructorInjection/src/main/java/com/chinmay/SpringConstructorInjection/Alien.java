
package com.chinmay.SpringConstructorInjection;

import java.beans.ConstructorProperties;

public class Alien {
	
	private int age;
	private Laptop la;
	
	@ConstructorProperties({"age","la"})
	public Alien(int age, Laptop la) {
		System.out.println("Parameterized Constructor is called");
		this.age = age;
		this.la = la;
	}

	public Laptop getLa() {
		return la;
	}

	public void setLa(Laptop la) {
		this.la = la;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		System.out.println("Inside the Setter Method");
		this.age = age;
	}

	public Alien() {
		System.out.println("Object Created");
	}

	public void code()
	{
	System.out.println("Coding");
	la.compile();
	}
}
