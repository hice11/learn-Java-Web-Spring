package com.acorn.prj5.di3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// xml 지시서
		
		// 1. setter로 주입
		ApplicationContext context = new GenericXmlApplicationContext("com/acorn/prj5/di3/setting2.xml");		
		MyArrayList list = context.getBean(MyArrayList.class);
		
		list.add(new Score("가", 60, 90));
		list.add(new Score("나", 50, 100));
		list.add(new Score("다", 90, 80));
		
		list.sortScore();
		Test.print(list);
		
		
		// 2. 생성자로 주입
		ApplicationContext context2 = new GenericXmlApplicationContext("com/acorn/prj5/di3/setting3.xml");
		MyArrayList list2 = context2.getBean(MyArrayList.class);
		
		list2.add(new Score("가", 60, 90));
		list2.add(new Score("나", 50, 100));
		list2.add(new Score("다", 90, 80));
		
		list2.sortScore();
		Test.print(list2);
		

	}////
	

}
