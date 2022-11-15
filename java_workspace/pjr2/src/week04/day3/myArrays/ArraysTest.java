package week04.day3.myArrays;

import java.util.Arrays;

public class ArraysTest {

	public static void main(String[] args) {

		//Score
		Score[] arr1 = new Score[3];
		arr1[0]=new Score("가길동",90,70);
		arr1[1]=new Score("나길동",80,80);
		arr1[2]=new Score("다길동",70,60);
		//국어점수 기준
		//MyArrays.sort(arr1);
		Arrays.sort(arr1);
		//출력2
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		//Score2
		Score2[] arr2 = new Score2[3];
		arr2[0]=new Score2("가길동",90,70);
		arr2[1]=new Score2("나길동",80,80);
		arr2[2]=new Score2("다길동",70,60);
		//영어점수 기준
		Arrays.sort(arr2);
		
		//출력2
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		
		
		
	////	
	}

}
