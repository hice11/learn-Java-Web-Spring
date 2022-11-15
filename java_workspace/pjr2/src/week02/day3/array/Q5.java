package week02.day3.array;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {

		//배열문제 5번
		//수를 5개  입력받아 가장 큰값을 출력하시오 

		// 처리과정
		// - 숫자 5개 입력받기
		// - 가장 큰 값 구하기
		// - 가장 큰 값 출력
		
		Scanner scanner = new Scanner(System.in);
		int[] num = new int[5];
		int max=0;
		
		//입력
		System.out.print("숫자를 5개 입력하세요. 공백으로 구분해주세요. > ");
		for(int i=0; i<num.length; i++) {
			num[i] = scanner.nextInt();
		}
		
		//처리
		for(int i=0; i<num.length; i++) {
			if(num[i]>max) {
				max=num[i];
			}
		}
		
		//촐력
		System.out.println("숫자 5개 중 가장 큰 값은 > "+max);
		
		
		
		////
	}

}
