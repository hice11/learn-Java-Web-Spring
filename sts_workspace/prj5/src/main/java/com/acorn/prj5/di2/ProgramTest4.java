package com.acorn.prj5.di2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProgramTest4 {
	
	public static void main(String[] args) {
		
		ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Program p = factory.getBean(Program.class);
		p.addNumbers(5, 3);
		
	}
	

}
