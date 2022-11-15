package week02.day1.parkchohee;

import java.util.Scanner;

public class Q02 {
	
	public static void main(String[] args) {
		
		//문제2. 국어점수와 영어점수를 입력받아 두 과목다 90이상이면 장학금 이라는 메시지를 출력합니다. 
		
		
		Scanner scanner = new Scanner(System.in);
		
		// 입력 자료
		int kor, eng;
		
		// 반복문
		while(true) {
			// 국어점수, 영어점수 입력
			System.out.print("국어점수를 입력하세요: ");
			kor = scanner.nextInt();
			System.out.print("영어점수를 입력하세요: ");
			eng = scanner.nextInt();
			
			if(kor>=90 && eng>=90) {
				System.out.println("장학금 지급 대상입니다");
			}else {
				System.out.println("장학금 지급 대상이 아닙니다");
			}
			System.out.println();
		}
		
		
		///
	}

}
