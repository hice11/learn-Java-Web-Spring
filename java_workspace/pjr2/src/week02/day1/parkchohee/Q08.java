package week02.day1.parkchohee;

import java.util.Scanner;

public class Q08 {
	
	public static void main(String[] args) {
		
		//문제8. 수를 입력받아 1부터 입력받은 수까지의 합을 출력하시오
		
		
		Scanner scanner = new Scanner(System.in);
		
		// 입력 자료
		int n;
		
		// 반복문
		while(true) {
			int sum=0;
			// 수 입력
			System.out.print("수를 입력하세요: ");
			n = scanner.nextInt();
			// 합 구하기
			for (int i = 1; i <= n; i++) {
				sum+=i;
			}
			// 누적 값 출력
			System.out.println("1부터"+n+"까지의 합은 "+sum+" 입니다");
		}
		
		
		///
	}

}
