package com.acorn.prj5.di2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProgramTest3 {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		//Program program = new Program();
		//Calculator calculator = new TempCalculator();
		//program.setCalculator(calculator);

		Program p = new Program();

		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("setting.txt")));
		String className = br.readLine();
		
		Class clazz = Class.forName(className);
		Calculator calculator = (Calculator) clazz.newInstance();
		
		p.setCalculator(calculator);
		p.addNumbers(3, 5);
	}
	

}
