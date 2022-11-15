package week03.day3;

import week03.day3.객체배열.주소록객체;

public class Ex02 {

	public static void main(String[] args) {
		
		//객체배열 연습
		
		//주소록객체 배열
		주소록객체[] list = new 주소록객체[3];
		
		//list[0] = new 주소록객체();
		//list[0].input("aa","010-1111-2222","aa@gmail.com","9/21");
		
		//생성자 사용
		list[0] = new 주소록객체("aa","010-1111-2222","aa@gmail.com","9/21");
		list[1] = new 주소록객체("bb","010-3333-4444","bb@gmail.com","9/22");
		list[2] = new 주소록객체("cc","010-5555-6666","cc@gmail.com","9/23");

		//출력
		//list[0].printInfo();
		//list[1].printInfo();
		//list[2].printInfo();
		
		//반복문 출력
		for (int i = 0; i < 3; i++) {
			System.out.println("========== "+(i+1)+" ==========");
			list[i].printInfo();
		}
		
	////	
	}

}
