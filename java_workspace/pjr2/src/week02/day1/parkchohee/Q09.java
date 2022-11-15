package week02.day1.parkchohee;

import java.util.Scanner;

public class Q09 {
	
	public static void main(String[] args) {
		
		//문제9. 10개의 수를 입력 받아 짝수의 개수를 출력하시오
		
		
		Scanner scanner = new Scanner(System.in);
		
		// 입력 자료
		int[] n= new int[10];
		// 출력 자료
		int even=0; // 짝수의 개수
		
		// 반복문
		while(true) {
			
			for (int i = 0; i < n.length; i++) {
				// 수 입력
				System.out.print("수를 입력하세요: ");
				n[i] = scanner.nextInt();
				
				// 짝수의 개수 구하기
				if(n[i]%2==0) {
					even ++;
				}
			}
			// 짝수의 개수 출력
			System.out.println("짝수의 개수는 "+even+" 입니다");
			System.out.println();
		}
		
		
		///
	}

}
