package week03.day1;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		//5명의 사람의 이름을 입력받아 출력하시오
		
		String[] names = new String[5];
		Scanner scanner = new Scanner(System.in);
		
		//이름 입력
		for (int i = 0; i < names.length; i++) {
			names[i] = scanner.next();
		}
		
		//이름배열 출력
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		
		
	////
	}


}
