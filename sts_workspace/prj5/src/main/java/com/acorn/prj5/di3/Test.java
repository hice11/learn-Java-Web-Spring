package com.acorn.prj5.di3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.acorn.prj5.di2.Calculator;

public class Test {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		ArrayList<Score> list = new ArrayList<Score>();
		list.add(new Score("가", 60, 90));
		list.add(new Score("나", 50, 100));
		list.add(new Score("다", 90, 80));
		
		
		//1. 외부 파일 1 (config2.txt)
		Comparator<Score> score = null;
		Properties p = new Properties();
		
		p.load(new FileReader("config2.txt"));
		String className = p.getProperty("score");
		Class clazz = Class.forName(className);
		score = (Comparator<Score>) clazz.newInstance();
		
		list.sort(score);
		print(list);
		
		
		
		//2. 외부 파일 2 (setting2.txt)
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("setting2.txt")));
		
		String className2 = br.readLine();
		Class clazz2 = Class.forName(className2);
		Comparator<Score> score2 = (Comparator<Score>) clazz2.newInstance();
		
		list.sort(score2);
		print(list);
		
		
		
		//3. xml 지시서
		ApplicationContext context = new GenericXmlApplicationContext("com/acorn/prj5/di3/setting.xml");
		Comparator<Score> score3 = context.getBean(Comparator.class);
		
		list.sort(score3);
		print(list);
		

	}////
	
	public static void print(ArrayList<Score> list) {
		for (Score s : list) {
			System.out.println(s);
		}
		System.out.println("======================");
	}

}
