package week04.day3;

import java.util.Arrays;

public class Ex03 {

	public static void main(String[] args) {

		Score[] arr = new Score[3];
		
		arr[0]=new Score("가길동",90,100);
		arr[1]=new Score("나길동",70,99);
		arr[2]=new Score("다길동",90,89);
		
		//출력 정렬전
		System.out.println("[정렬 전]");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);  //toString 생략
		}
		
		/*
		//정렬
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i].getKor()>arr[j].getKor()) {
					Score tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		//
		*/
		
		//정렬 sort 이용
		Arrays.sort(arr);
		
		//출력 정렬후
		System.out.println("[정렬 후]");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);  //toString 생략
		}
		
		
	////	
	}

}
