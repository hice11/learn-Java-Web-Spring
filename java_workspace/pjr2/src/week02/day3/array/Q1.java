package week02.day3.array;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {

		//배열문제 1번
		//이름을 5개 입력받아  출력하시오 (입력과 출력 분리)
		
		Scanner scanner = new Scanner(System.in);
		String[] name = new String[5];
		
		//입력
		System.out.print("이름을 5개 입력하세요. 공백으로 구분해주세요. > ");
		for(int i=0; i<5; i++) {
			name[i] = scanner.next();
		}
		
		//출력
		for(int i=0; i<5; i++) {
			System.out.print(" "+name[i]);
		}
		
		
		////
	}

}
