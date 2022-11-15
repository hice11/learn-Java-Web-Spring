package week04.day5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex03 {

	public static void main(String[] args) {

		
		//파일 생성해서 파일에 데이터 입력
		try {
			FileOutputStream fos = new FileOutputStream("output2.txt");
			
			fos.write(99);
			fos.write(100);
			
			fos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		
		
	////	
	}

}
