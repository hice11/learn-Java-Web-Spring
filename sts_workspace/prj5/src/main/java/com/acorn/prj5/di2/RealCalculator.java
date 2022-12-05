package com.acorn.prj5.di2;

public class RealCalculator extends Calculator {
	@Override
	public int add(int num1, int num2) {
		System.out.println("RealCalculator");
		return  num1+ num2;
	}
}
