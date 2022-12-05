package com.acorn.prj5.di3;

import java.util.Comparator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public Comparator<Score> score() {
		return new EngComparator();
	}
	
	@Bean
	public MyArrayList myArrayList() {
		MyArrayList my= new MyArrayList();
		my.setComparator(score());
		return my;
	}
	
}
