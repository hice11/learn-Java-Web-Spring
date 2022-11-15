package week03.day3;

import week03.day3.객체배열.Beverage;

public class Ex01 {

	public static void main(String[] args) {

		//Beverage class => 음료객체 여러개 사용
		//a는 참조형 변수 기본값: null ->아무것도 참조하고 있지 않은 상태값
		Beverage a=null; //참조형 변수 초기화 null 사용
		//System.out.println(a); //초기화되지 않음
		
		Beverage b = new Beverage();
		//b.printinfo();

		
		//객체배열
		// 참조형변수 3개를 배열로 만들기
		Beverage[] arrs = new Beverage[3]; //연속적
		
		//arrs[0].printinfo(); // NullPointerException 오류
		// 참조형 변수 각각 3개 만들기
		Beverage c=null,d=null,e=null; //연속적이지 X
		
		
		//객체 생성, 초기화 -> 참조형변수 사용
		c= new Beverage();
		d= new Beverage();
		e= new Beverage();
		//객체 생성, 초기화 -> 배열 사용
		arrs[0] = new Beverage(); //객체 하나
		arrs[1] = new Beverage();
		arrs[2] = new Beverage();
		
		arrs[0].printinfo();
		arrs[1].printinfo();
		arrs[2].printinfo();
		
	}

}
