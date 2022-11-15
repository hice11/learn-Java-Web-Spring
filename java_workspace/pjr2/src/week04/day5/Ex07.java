package week04.day5;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Ex07 {

	public static void main(String[] args) {

		
		//데이터를 콘솔이 아닌 파일에 담기

		ArrayList<Score> list = new ArrayList<>();

		list.add(new Score("lee",90,90));
		list.add(new Score("kee",90,80));
		list.add(new Score("woo",100,90));


		// 파일저장
		
		ObjectOutputStream oos=null;
		try {
			
			oos = new ObjectOutputStream(new FileOutputStream("scoreList.txt"));
			for (int i = 0; i < list.size(); i++) {
				oos.writeObject(list.get(i));
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		// 파일 읽어오기
		
		ObjectInputStream ois = null;
		
		try {
			
			ois = new ObjectInputStream(new FileInputStream("scoreList.txt"));
			/*
			Score data = (Score)ois.readObject();
			System.out.println(data);
			data = (Score)ois.readObject();
			System.out.println(data);
			data = (Score)ois.readObject();
			System.out.println(data);
			*/
			//반복문 사용 -> 4번이상 예외 발생 EOFException -> 예외처리하기
			try {
				while (true) {
				Score data = (Score)ois.readObject();
				System.out.println("객체정보 "+data);
				}
			} catch (EOFException e) {
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
	////	
	}

}
