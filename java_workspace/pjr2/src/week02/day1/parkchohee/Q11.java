package week02.day1.parkchohee;

import java.util.Scanner;

public class Q11 {
	
	public static void main(String[] args) {
		
		//문제11. 원하는 단을 입력받아 출력하기
		
		Scanner scanner = new Scanner(System.in);
		// 입력 자료
		int n;
		
		// 반복문
		while(true) {
			// 수 입력
			System.out.print("구구단 단수를 입력하세요: ");
			n = scanner.nextInt();
			// 구구단 출력
			for (int i = 1; i <= 9; i++) {
				System.out.println(n+" x "+i+" = "+(n*i));
			}
			System.out.println();
		}
		
		
		
		///
	}

}
