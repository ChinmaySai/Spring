package com.chinmay.configuaration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


@Configuration
@ComponentScan("com.chinmay.autowiredannotation")
public class AppConfig {
	
//	@Bean
//	public Alien alien(@Qualifier("desktop") Computer com)
//	{
//		Alien al=new Alien();
//		al.setAge(25);
//		al.setCom(com);
//		return al;
//	}
//	@Bean
//	public Alien alien(Computer com)
//	{
//		Alien al=new Alien();
//		al.setAge(25);
//		al.setCom(com);
//		return al;
//	}
//	
//	@Bean
//	public Desktop desktop()
//	{
//		return new Desktop();
//	}
//	
//	@Bean
//	@Primary
//	public Laptop laptop()
//	{
//		return new Laptop();
//	}

}
