package com.chinmay.autowiring;

public class Desktop implements Computer {

	@Override
	public void compile()
	{
		System.out.println("Desktop Code Compilation is in Progress");
	}
}
