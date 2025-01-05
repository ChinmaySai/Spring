package com.chinmay.configuaration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.chinmay.beanname.Desktop;

@Configuration
public class AppConfig {
	
	//@Bean(name="desktop")
	@Bean(name= {"desktop","com1","Beast"})
	public Desktop desktop1()
	{
		return new Desktop();
	}

}
