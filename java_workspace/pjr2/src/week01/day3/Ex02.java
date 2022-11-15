package week01.day3;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		/*
		 * 
		 * 
		 * 매운맛 문제2. 입력자료로 사원의 이름과 구분코드와 작업시간이 들어온다. 이때 구분코드가 1이면 시간당 2000원 2이면 시간당 2500원 3이면 시간당 3000원 4이면 시간당 4000원으로 계산하여 임금을 출력
		■자료명세표
		1. 출력자료: name, money
		2. 입력자료: name, code, time

		■처리과정
		1. 입력받기
		2. 계산하기
		3. 출력하기
		 */

		String name;
		int code, time;
		int money=0;
		
		Scanner sc = new Scanner(System.in); // Scanner : class, 입력 받음
		
		System.out.print("이름입력: "); 
		name = sc.next();
		System.out.print("구분코드: ");
		code = sc.nextInt();
		System.out.print("시간: ");
		time = sc.nextInt();
		
		switch(code) {
		case 1:
			money = time*2000;
			break;
		case 2:
			money = time*2500;
			break;
		case 3:
			money = time*3000;
			break;
		case 4:
			money = time*3500;
			break;
		}
		
		System.out.println("임금= "+money);
		
	}
}
