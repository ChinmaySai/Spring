package com.chinmay.configuaration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.chinmay.javabasedconfig.Desktop;

@Configuration
public class AppConfig {
	
	@Bean
	public Desktop desktop()
	{
		return new Desktop();
	}

}
