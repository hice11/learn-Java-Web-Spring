package week04.day2.objectEx;

import java.util.Arrays;

public class Ex08Sort {

	public static void main(String[] args) {

		int[] arr = {95,75,85,100,50};
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		//정렬
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]>arr[j]) {  // 오름차순
					int tmp=arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
		}
		System.out.println("\n정렬 후 >");
		//정렬 후 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		
		
	////	
	}

}
