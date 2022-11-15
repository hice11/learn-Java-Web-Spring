package week02.day3.array;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {

		//배열문제 3번
		//수를 5개 입력받아 거꾸로 출력하시오 (입력과 출력분리)

		// 처리과정
		// - 수를 입력 받기
		// - 수를 배열에 저장 
		// - 배열을 출력
		
		Scanner scanner = new Scanner(System.in);
		int[] num = new int[5];
		
		//입력
		System.out.print("숫자를 5개 입력하세요. 공백으로 구분해주세요. > ");
		for(int i=4; i>=0; i--) {
			num[i] = scanner.nextInt();
		}
		
		//촐력
		for(int i=0; i<num.length; i++) {
			System.out.print(" "+num[i]);
		}
		
		
		
		
		////
	}

}
