package com.chinmay.scopevalueannotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("com1")
@Scope("prototype")
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
