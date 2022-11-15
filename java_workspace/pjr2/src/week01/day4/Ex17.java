package week01.day4;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {

		// 1 2 3 4 ... 12 월 입력 -> 봄, 여름, 가을, 겨울
		// 12 1 2 : 겨울, 3 4 5 : 봄, 6 7 8 : 여름, 9 10 11 : 가을
		int month = 9;
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			System.out.print("월을 입력해주세요 : ");
			month = sc.nextInt();
			
			switch (month) {
			case 1: case 2: case 12: 
				System.out.println("겨울");
				break;
			case 3: case 4: case 5: 
				System.out.println("봄");
				break;
			case 6: case 7: case 8: 
				System.out.println("여름");
				break;
			case 9: case 10: case 11: 
				System.out.println("가을");
				break;
				
			default:
				System.out.println("1부터 12 사이의 숫자를 입력해주세요");
				break;
			}
		}
		
		

		
		
		//
	}

}
