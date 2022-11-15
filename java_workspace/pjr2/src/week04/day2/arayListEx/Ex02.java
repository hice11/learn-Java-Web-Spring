package week04.day2.arayListEx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		//3개만 학생정보를 입력 받아서 출력
		
		ArrayList list = new ArrayList();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름 국어 영어");
		
		for (int i = 0; i < 3; i++) {
			String name = scanner.next();
			int kor = scanner.nextInt();
			int eng = scanner.nextInt();
			
			list.add(new Score(name, kor, eng));
		}
		//
		
		//출력
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i)); //toString 생략
		}
		
		
	////	
	}

}
