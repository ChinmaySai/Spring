package com.chinmay.configuaration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.chinmay.javabasedconfig.Alien;
import com.chinmay.javabasedconfig.Computer;
import com.chinmay.javabasedconfig.Desktop;
import com.chinmay.javabasedconfig.Laptop;

@Configuration
public class AppConfig {
	
//	@Bean
//	public Alien alien(@Qualifier("desktop") Computer com)
//	{
//		Alien al=new Alien();
//		al.setAge(25);
//		al.setCom(com);
//		return al;
//	}
	@Bean
	public Alien alien(Computer com)
	{
		Alien al=new Alien();
		al.setAge(25);
		al.setCom(com);
		return al;
	}
	
	@Bean
	public Desktop desktop()
	{
		return new Desktop();
	}
	
	@Bean
	@Primary
	public Laptop laptop()
	{
		return new Laptop();
	}

}
