package week01.day4;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {

		// 삼항연산자
		int su=2;
		String result=(su%2==0)?"짝수":"홀수";
		System.out.println(result);
		
		int input;
		Scanner sc = new Scanner(System.in);
		System.out.println("수입력: ");
		input=sc.nextInt();
		String result2 = (input%2==0)?"짝수":"홀수";
		System.out.println(result2);
		
	}

}
