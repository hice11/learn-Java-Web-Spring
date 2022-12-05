package com.acorn.prj5.di2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public Calculator calculator() {
		return new TempCalculator(); //변경
	}
	
	@Bean
	public Program program() {
		Program p = new Program();
		p.setCalculator(calculator());
		return p;
	}

}
