package com.acorn.prj5.di;

public class Test2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal animal = new Dog();
		
		//변경
		animal = new Cat();
		
		animal.bark();

	}

}
