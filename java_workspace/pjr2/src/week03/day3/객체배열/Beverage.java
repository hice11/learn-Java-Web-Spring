package week03.day3.객체배열;

import java.util.Scanner;

public class Beverage {   // 클래스  => 객체를 만들기 위한 설계도  ( 객체 : 한 개)

	private String[] 음료이름목록= {"콜라","포카리스웨트","알로에쥬스"};	
	private String 이름;
	private String 종류; 
	private int 가격;
 
 
	
	Scanner sc = new Scanner(System.in);
	
	public void 음료이름정하기() {
		int index = (int)(Math.random()*3); 
		이름=  음료이름목록[index];
		가격정하기();
	}
	
	
	private void 가격정하기() {
		if(이름.equals("콜라")) {
			가격=2000;
			종류="탄산음료";
		}
		else if(이름.equals("포카리스웨트")) {
			가격=1800;
			종류="이온음료";
		}
		else
			가격=2200;
			종류="탄산이나 이온음료 아님"; 
		 
	}	
	 
 
	//객체정보 출력기능
    public void printinfo() {
		System.out.println(종류);	 
		System.out.println(이름);
		System.out.println(가격);
	 
		
	}
	 

}
