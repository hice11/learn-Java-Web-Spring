package week02.day2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex01FileCopy {

	public static void main(String[] args) throws IOException {

		// FileInputStream : byte단위로 파일을 읽어 오는 클래스
		
		// 파일복사 파일열기 -> 파일 한 byte씩 읽어서 새파일에 한 byte씩 쓰기
		// 반복문 사용
		
		//FileInputStream fIn = new FileInputStream("in.txt");
		//FileOutputStream fOut = new FileOutputStream("out.txt");
		
		FileInputStream fIn = new FileInputStream("image.jpeg");
		FileOutputStream fOut = new FileOutputStream("image2.jpeg");
		
		int x;
		//x = fIn.read(); // 1byte 읽어옴
		//x=3;
		//fOut.write(x);
		
		
		while((x=fIn.read())!= -1) {
			fOut.write(x);
			System.out.println(x+" "+(char)x+" ");
		}
		
		/*
				
		*/
		
		
		
		
		
		///
	}

}
