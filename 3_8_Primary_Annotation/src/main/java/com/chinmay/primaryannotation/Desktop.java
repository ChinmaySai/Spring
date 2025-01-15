package com.chinmay.primaryannotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
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
