package week02.day3.array;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {

		//배열문제 4번
		//사용자가 원하는 개수의 배열을 만들게 하고 그 배열의 개수만큼 값을 입력하고 출력하시오 (입력과 출력 분리) 

		// 처리과정
		// - 원하는 배열의 개수 입력 받기
		// - 개수만큼의 숫자 입력 받기
		// - 배열 출력
		
		Scanner scanner = new Scanner(System.in);
		int index;
		
		//입력
		System.out.print("배열의 개수를 입력하세요. > ");
		index = scanner.nextInt();
		int[] num = new int[index];

		System.out.print("숫자를 배열의 개수만큼 입력하세요. 공백으로 구분해주세요. > ");
		for(int i=0; i<num.length; i++) {
			num[i] = scanner.nextInt();
		}
				
		
		//촐력
		System.out.print(" > ");
		for(int i=0; i<num.length; i++) {
			System.out.print(" "+num[i]);
		}
		
		
		
		
		////
	}

}
