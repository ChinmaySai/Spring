
package com.chinmay.javabasedconfig;

import java.beans.ConstructorProperties;

public class Alien {
	
	private int age;
	private Computer com;
	
	
/*public Alien(int age, Computer la) {
		System.out.println("Parameterized Constructor is called");
		this.age = age;
		this.la = la;
	}*/

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
