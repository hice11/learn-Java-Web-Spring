package week01.day4;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {

		// switch 대상에 따라 여러갈래로 분기됨
		int menu; // 1.등록 2.조회 3.변경 4.조회
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("메뉴를 선택하세요");
		menu = sc.nextInt();

		switch(menu) {
		case 1:
			System.out.println("등록합니다");
			break;
		case 2:
			System.out.println("조회합니다");
			break;
		case 3:
			System.out.println("변경합니다");
			break;
		case 4:
			System.out.println("조회합니다");
			break;
		default:
			System.out.println("잘못된 선택입니다");
		}
		
		

		
		
		//
	}

}
