package week04.day4.exceptionEx;

import java.io.IOException;

public class Ex02 {

	public static void main(String[] args) {

		
		try {
			// 한 바이트 입력
			int result = System.in.read();
			System.out.println(result);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	////	
	}

}
