package week03.day1;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		//retrun 없음

		//5명의 사람의 이름을 입력받아 출력하시오

		String[] names = new String[5];
		
		//이름 입력
		input(names);

		//이름배열 출력
		print(names);
		
	////	
	}

	//이름 입력
	public static void input(String[] names) {
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < names.length; i++) {
			names[i] = scanner.next();
		}		
	}
	
	//이름배열 출력
	public static void print(String[] names) {
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
	}
	
	
	
//
}
