package week01.day4;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {

		// 반복문
				
		// 구구단 3단 출력
		/*
		for(int i=1; i<=9; i++) {
			System.out.println("3 x "+i+" = "+3*i);
		}
		
		// 입력 받아 3단 출력
		Scanner sc = new Scanner(System.in);
		int input=9;
		
		System.out.print("구구단 3단 : ");
		input = sc.nextInt();
		if(1>input||input>20) {
			input = 9;
		}
		for(int i=1; i<=input; i++) {
			System.out.println("3 x "+i+" = "+3*i);
		}
		while(true) {
			System.out.print("구구단 3단 : ");
			input = sc.nextInt();
			System.out.println("3 x "+input+" = "+3*input);
		}
		
		
		// 전체 구구단
		// 중첩 반복문
		 
		// for문 이용
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i+" x "+j+" = "+i*j);
			}
			System.out.println("==========");
		}
		 */
		
		// while문 이용
		int i=2;
		while(i<=4) {
			int j=1;
			while(j<=9) {
				System.out.println(i+" x "+j+" = "+i*j);
//				System.out.println("j:"+j);
				j++;
			}
//			System.out.println("i:"+i);
			i++;
			System.out.println("==========");
		}
		
		
		////
	}

}
