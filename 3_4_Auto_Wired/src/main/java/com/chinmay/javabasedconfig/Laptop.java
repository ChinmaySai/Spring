package com.chinmay.javabasedconfig;

public class Laptop implements Computer {
	
	public Laptop()
	{
		System.out.println("Laptop Bean Created");
	}
	@Override
	public void compile()
	{
		System.out.println("Laptop Code Compilation is in Progress");
	}

}
