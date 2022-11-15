package week01.day4;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {

		// 반복문
				
		// do while 반복문
		
		
		Scanner sc = new Scanner(System.in);
		int input;
		int sum=0;

		do {
			input = sc.nextInt();
			sum = sum+input;
		}while(input !=0);
		
		System.out.println(sum);
		/*
		
		
		 */
		
		/*
		while(true){
			input = sc.nextInt();
			if(input==0) break;  // 탈출
			sum+= input;
		}
		
		System.out.println(sum);
		*/
		
		
		////
	}

}
