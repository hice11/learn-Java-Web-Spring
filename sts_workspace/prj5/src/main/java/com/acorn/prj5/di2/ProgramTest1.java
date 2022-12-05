package com.acorn.prj5.di2;

public class ProgramTest1 {
	
	public static void main(String[] args) {
		
		Program program = new Program();
		Calculator calculator = new TempCalculator();
		
		program.setCalculator(calculator);
		program.addNumbers(3, 5);
	}
	

}
