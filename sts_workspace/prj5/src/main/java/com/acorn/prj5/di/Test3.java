package com.acorn.prj5.di;

public class Test3 {
	
	public static Animal getAnimal() {
		//return new Cat();
		return new Dog();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal animal = getAnimal();
		//Animal animal2 = getAnimal();
		//Animal animal3 = getAnimal();
		
		
		animal.bark();

	}

}
