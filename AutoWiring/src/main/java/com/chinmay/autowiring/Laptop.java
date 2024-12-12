package com.chinmay.autowiring;

public class Laptop implements Computer {
	
	public Laptop()
	{
		//System.out.println("Laptop Object Created");
	}
	@Override
	public void compile()
	{
		System.out.println("Laptop Code Compilation is in Progress");
	}

}
