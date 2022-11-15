package week04.day4.io;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex05 {

	public static void main(String[] args) {

		
		// buffer -> 속도 증가
		BufferedReader bs = new BufferedReader(new InputStreamReader(System.in));
		
		String input;
		
		try {
			
			while (true) {
				input = bs.readLine();
				if(input.equals("stop"))
					break;
				System.out.println(input);
			}
			
		} catch (Exception e) {
			
		}
		
		
		
	////	
	}

}
