package week02.day1.parkchohee;

import java.util.Scanner;

public class Q06 {
	
	public static void main(String[] args) {
		
		//문제6. 0을 입력받을때 까지 계속 입력한 수를 누적하시오. 0이면 누적한 값을 출력하고 종료합니다.
		
		
		Scanner scanner = new Scanner(System.in);
		
		// 입력 자료
		int n;
		// 출력 자료
		int sum=0;
		
		// 반복문
//		while(true) {
//			// 수 입력
//			System.out.print("수를 입력하세요: ");
//			n = scanner.nextInt();
//			// 수 누적
//			sum+=n;
//			// 누적 값 출력
//			if(n==0) {
//				System.out.println(sum);
//				break;
//			}
//		}
		System.out.print("수를 입력하세요: ");
		n = scanner.nextInt();
		while(n!=0) {
			sum+=n;
			System.out.print("수를 입력하세요: ");
			n = scanner.nextInt();
		}
		System.out.println(sum);
		
		
		///
	}

}
