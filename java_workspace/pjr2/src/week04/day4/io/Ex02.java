package week04.day4.io;

import java.io.IOException;

public class Ex02 {

	public static void main(String[] args) {
		
		
		try {
			int result = System.in.read();
			System.out.println(result);
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
}
