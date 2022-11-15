package week04.day5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Ex06 {

	public static void main(String[] args) {
		
		//데이터를 콘솔이 아닌 파일에 담기
		//객체 데이터를 파일에 입력
		
		ObjectOutputStream oos=null;
		
		try {
			
			oos = new ObjectOutputStream(new FileOutputStream("obj2.txt"));
			Score data = new Score("홍길동",100,100);
			oos.writeObject(data);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			
			try {
				
				oos.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		
		// 입력한 파일 읽어오기
		ObjectInputStream ois = null;
		
		try {
			ois = new ObjectInputStream(new FileInputStream("obj2.txt"));
			Score data = (Score)ois.readObject();
			System.out.println(data);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	////	
	}

}
