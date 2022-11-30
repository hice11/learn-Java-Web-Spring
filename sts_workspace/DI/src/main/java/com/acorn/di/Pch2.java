package com.acorn.di;

public class Pch2 implements Calculator {

	@Override
	public int add(int x, int y) {
		// TODO Auto-generated method stub
		return x+y;
	}

	@Override
	public int sub(int x, int y) {
		// TODO Auto-generated method stub
		return (x>y) ? x-y : y-x;
	}

}
