package week04.day2.objectEx;

import java.util.Arrays;

public class Ex08선택정렬 {

	public static void main(String[] args) {

		/*
		// 선택정렬
		95 75 85 100 50
		
		1단계
		/75 /95 85 100 50
		/50 95 85 100 /75
		2단계
		50 /85 /95 100 75
		50 /75 95 100 /85
		3단계
		50 75 /85 100 /95
		4단계
		50 75 85 /95 /100
		*/
		
		int[] kor = {95,75,85,100,50};
		int tmp = 0;
		for(int i=0; i<kor.length-1; i++) {
			for(int j=i+1; j<kor.length; j++) {
				if(kor[i]>kor[j]) {
					tmp = kor[i];
					kor[i] = kor[j];
					kor[j] = tmp;
				}
			}
		}
		
		System.out.println(Arrays.toString(kor));
		
	////	
	}

}
