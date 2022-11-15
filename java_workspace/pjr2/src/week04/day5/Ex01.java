package week04.day5;

import java.io.IOException;

public class Ex01 {

	public static void main(String[] args) {
		
		
		// 입력받고 출력
		
		int result;
		try {
			result = System.in.read();
			System.out.println((char)result);
			
			result = System.in.read();
			System.out.println((char)result);
			
			result = System.in.read();
			System.out.println((char)result);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	////	
	}
	
}
