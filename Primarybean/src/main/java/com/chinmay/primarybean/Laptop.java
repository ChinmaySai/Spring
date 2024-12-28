package com.chinmay.primarybean;

public class Laptop implements Computer {
	
	public Laptop()
	{
		//System.out.println("Laptop Object Created");
	}
	@Override
	public void compile()
	{
		System.out.println("Code Compilation in the Primary Bean Code");
	}

}
