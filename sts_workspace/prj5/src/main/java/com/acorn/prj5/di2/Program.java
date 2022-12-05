package com.acorn.prj5.di2;

public class Program {
	
	Calculator calculator;
	
	public Program() {
		// TODO Auto-generated constructor stub
	}
	public Program(Calculator calculator) {
		super();
		this.calculator = calculator;
	}


	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	public void addNumbers(int su1, int su2) {
		int result = calculator.add(su1, su2);
		System.out.println(result);
	}
	
	

}
