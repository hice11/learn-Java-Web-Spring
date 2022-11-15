package week04.day3;

import java.util.Arrays;

public class Ex02Sort {

	public static void main(String[] args) {
		
		String[] strs= {"sprint","summer","fall","winter"};
		
		
		//정렬 직접
		for (int i = 0; i < strs.length-1; i++) {
			for (int j = i+1; j < strs.length; j++) {
				//compareTo의 반환정보 
				//0:같을때,양수:기준이 큰경우,음수:기준이 작은경우
				if(strs[i].compareTo(strs[j])>0) {
					String tmp = strs[i];
					strs[i]=strs[j];
					strs[j]=tmp;
				}
			}
		}
		
		
		System.out.println("[정렬 전]");
		//출력
		for (int i = 0; i < strs.length; i++) {
			System.out.print(strs[i]+" ");
		}
		
		System.out.println("\n[정렬 후]");
		Arrays.sort(strs);
		//출력
		for (int i = 0; i < strs.length; i++) {
			System.out.print(strs[i]+" ");
		}
		
		
	////
	}

}
