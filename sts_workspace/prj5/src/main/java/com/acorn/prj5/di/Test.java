package com.acorn.prj5.di;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Cat animal = new Cat();
		
		//Dog 변경
		Dog animal = new Dog();
		
		animal.bark();
		
		String date = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
		System.out.println(date);
		String time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HHmmss"));
		System.out.println(time);
		
		String a = "aaa";
		System.out.println(a.split(",")[0]); 

	}

}
