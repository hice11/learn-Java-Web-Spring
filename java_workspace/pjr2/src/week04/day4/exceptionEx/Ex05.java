package week04.day4.exceptionEx;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		
		// 0 나누기 0 -> 예외발생
		// ArithmeticException
		
		
		Scanner scanner = new Scanner(System.in);
		int result;
		
		try {
			System.out.println("나누어지는수 입력");
			int divided = scanner.nextInt();

			System.out.println("나누는수를 입력");
			int divisor = scanner.nextInt();

			result = divided/divisor;
			System.out.println("결과: "+result);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		System.out.println("정상종료");
		
	}

}
