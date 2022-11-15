package week02.day1.parkchohee;

import java.util.Scanner;

public class Q05 {
	
	public static void main(String[] args) {
		
		//문제5. 두 수를 입력받아 큰값에서 작은값을 뺀 결과를 출력하시오
		
		
		Scanner scanner = new Scanner(System.in);
		
		// 입력 자료
		int n1, n2;
		
		// 반복문
		while(true) {
			// 수 입력
			System.out.print("첫번째 수를 입력하세요: ");
			n1 = scanner.nextInt();
			System.out.print("두번째 수를 입력하세요: ");
			n2 = scanner.nextInt();
			
			if(n1>=n2) {
				System.out.println(n1-n2);
			}else{
				System.out.println(n2-n1);
			}
			System.out.println();
		}
		
		
		///
	}

}
