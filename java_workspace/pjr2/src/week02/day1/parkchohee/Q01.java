package week02.day1.parkchohee;

import java.util.Scanner;

public class Q01 {
	
	public static void main(String[] args) {
		
		//문제1. 수를 입력받아 짝수 홀수를 판단하는 프로그램을 작성하시오
					
		
		Scanner scanner = new Scanner(System.in);
		
		int n;
		while(true) {
			// 수 입력
			System.out.print("정수를 입력해주세요 (0을 입력하면 종료합니다): ");
			n = scanner.nextInt();
			
			// 짝수 홀수 판단
			if(n%2==0) {
				
				if(n==0) { 
				System.out.println("종료합니다");
				break;
				}
				System.out.println("짝수입니다");
				
			}else {
				System.out.println("홀수입니다");
			}
			//		
		}
		//
		
		
		
		
		///
	}

}
