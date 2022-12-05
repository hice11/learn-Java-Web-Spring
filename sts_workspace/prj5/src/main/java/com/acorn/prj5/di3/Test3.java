package com.acorn.prj5.di3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Configuration 사용
		
		ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
		
		MyArrayList list = factory.getBean(MyArrayList.class);
		
		list.add(new Score("가", 60, 90));
		list.add(new Score("나", 50, 100));
		list.add(new Score("다", 90, 80));
		
		list.sortScore();
		Test.print(list);
		
		

	}////
	

}
