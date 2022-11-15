package week04.day5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex02 {

	public static void main(String[] args) {
		
		//파일 읽기 
		
		try {
			// FileInputStream : byte 단위
			FileInputStream fis = new FileInputStream("a.txt");
			
			int input;
			/*
			input = fis.read();
			System.out.print((char)input);
			input = fis.read();
			System.out.print((char)input);
			input = fis.read();
			System.out.print((char)input);
			input = fis.read();
			System.out.print((char)input);
			input = fis.read();
			System.out.print((char)input);
			*/
			//반복문으로
			while( (input = fis.read()) != -1){
				System.out.print((char)input);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	////	
	}

}
