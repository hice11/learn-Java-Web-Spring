package com.acorn.prj5.di2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class ProgramTest2 {
	
	public static void main(String[] args) {
		
		//Program program = new Program();
		//Calculator calculator = new TempCalculator();
		//program.setCalculator(calculator);

		
		// xml지시서에 따라 객체생성및 주입이 완료됨
		ApplicationContext context = new GenericXmlApplicationContext("com/acorn/prj5/di2/setting2.xml");  
		//객체를 얻어옴
		Program program  = context.getBean(Program.class);   

		
		program.addNumbers(3, 5);
	}
	

}
