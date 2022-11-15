package week02.day1;

import java.util.Scanner;

public class Ex02 {
	
	public static void main(String[] args) {
		
		// 메뉴입력 처리하는 문제 : 반복
		
		int menu=0;	// 1.입력 2.수정 3.삭제 4.조회합니다 5.종료합니다
		/*
		  1. 반복
		  	 1. 메뉴입력
		  	 2. 메뉴에 따른 처리
		 */
		
		Scanner sc = new Scanner(System.in);
		
		// 메뉴입력
		loop1 : while(true) {
			System.out.println("메뉴입력: 1.입력 2.수정 3.삭제 4.조회 5.종료");
			menu = sc.nextInt();
			switch (menu) {
			case 1: 
				System.out.println("입력합니다");
				break;
			case 2: 
				System.out.println("수정합니다");
				break;
			case 3: 
				System.out.println("삭제합니다");
				break;
			case 4: 
				System.out.println("조회합니다");
				break;
			case 5: 
				System.out.println("종료합니다");
				break loop1;
				
			default:
				System.out.println("잘못된 메뉴입니다");
				break;
			}
		}
		
		
		
		///
	}

}
