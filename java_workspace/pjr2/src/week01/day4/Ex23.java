package week01.day4;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {

		// 1회 작업이 될 수 있도록 코딩한다
		// 반복을 적용한다
				
		/*
		1. 반복
			1. 메뉴와 수량을 입력받는다, stop이면 종료
			2. 단가를 구한다
			3. 주문금액을 구한다
			4. 주문금액 출력
		 */
		
		String coffee;
		int qty;
		int price;
		int amount;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			// 입력1
			System.out.print("메뉴 : ");
			coffee = sc.next();
			// 탈출 조건
			if(coffee.equals("stop")) break;
			// 입력2
			System.out.print("수량 : ");
			qty = sc.nextInt();
			// 스위치
			switch(coffee) {
			case "아메리카노":
				price=2500;
				break;
			case "모카라떼":
				price=2500;
				break;
			case "카푸치노":
				price=2500;
				break;
			default:
				price=0;
				System.out.println("메뉴선택 오류");
			}
			amount=qty*price;
			System.out.println("주문금액 : "+amount);
			System.out.println("=============");
		}
		System.out.println("종료합니다.");
		
		
		/*
		switch(coffee) {
		case "아메리카노":
			price=2500;
			break;
		case "모카라떼":
			price=2500;
			break;
		case "카푸치노":
			price=2500;
			break;
		default:
			price=0;
			System.out.println("메뉴선택 오류");
		}
		amount=qty*price;
		System.out.println("총 가격 : "+amount);
		 */
		
		
		////
	}

}
