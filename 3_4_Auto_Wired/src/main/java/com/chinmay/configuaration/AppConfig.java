package com.chinmay.configuaration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.chinmay.javabasedconfig.Alien;
import com.chinmay.javabasedconfig.Computer;
import com.chinmay.javabasedconfig.Desktop;

@Configuration
public class AppConfig {
	
	@Bean
	public Alien alien(Computer com)
	{
		Alien al=new Alien();
		al.setAge(25);
		al.setCom(com);
		return al;
	}
//	@Bean
//	public Alien alien()
//	{
//		Alien al=new Alien();
//		al.setAge(25);
//		al.setCom(desktop());
//		return al;
//	}
	
	@Bean
	public Desktop desktop()
	{
		return new Desktop();
	}

}
