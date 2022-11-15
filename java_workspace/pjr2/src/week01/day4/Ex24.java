package week01.day4;

import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
						
		/*

		 */
				
		Scanner sc = new Scanner(System.in);
		String msg="";
		msg = sc.next();
		
		while(true) {
			if(msg.equals("stop")) break;  
			// 문자열 비교 equals() 기능 : 문자열 비교 후 같으면 true
			System.out.println(msg);
			msg=sc.next();
		}
		System.out.println("종료합니다");
		
		
		/*
		
		 */
		
		
		////
	}

}
