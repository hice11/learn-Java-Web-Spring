package week02.day1.parkchohee;

import java.util.Scanner;

public class Q13 {
	
	public static void main(String[] args) {
		
		//문제13. 10개의 수를 입력 받아 짝수만 배열에 저장한 다음 한꺼번에 출력하시오( 배열은 넉넉히 10개로 준비합니다)
		
		Scanner scanner = new Scanner(System.in);
		
		// 입력 자료
		int n;
		// 출력 자료
		int[] even= new int[10]; // 짝수의 배열
		// 처리 자료
		int j=0;
				
		// 반복문
		while(true) {
			
			for (int i = 0; i < 10; i++) {
				// 수 입력
				System.out.print("수를 입력하세요: ");
				n = scanner.nextInt();
				
				// 짝수의 배열 구하기
				if(n%2==0) {
					even[j] = n;
					j++;
				}
			}
			// 짝수의 배열 출력
			for (int i = 0; i < j; i++) {
				System.out.print(even[i]+"  ");
			}
			System.out.println();
			System.out.println();
		}
		
		
		///
	}

}
