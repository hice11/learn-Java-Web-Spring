package com.acorn.prj5.di2;

public class TempCalculator extends Calculator {

	@Override
	public int add(int num1, int num2) {
		// TODO Auto-generated method stub
		System.out.println( "TempCalculator");
		return  num1+num2;
	}
	
}
