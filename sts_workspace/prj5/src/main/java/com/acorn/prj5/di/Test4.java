package com.acorn.prj5.di;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Test4 {
	
	public static Animal getAnimal() {
		//return new Cat();
		Animal animal = null;
		Properties p = new Properties();
		try {
			p.load(new FileReader("config.txt"));
			String className = p.getProperty("animal");
			Class<?> clazz = Class.forName(className);
			animal = (Animal) clazz.newInstance();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return animal;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal animal = getAnimal();
		
		animal.bark();

	}

}
