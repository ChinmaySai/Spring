package com.chinmay.autowiredannotation;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {

	public Desktop()
	{
		System.out.println("Desktop Object/bean Created");
	}
	@Override
	public void compile()
	{
		System.out.println("Desktop Code Compilation is in Progress");
	}
}
