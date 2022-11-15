package week04.day4;

import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {

		
		//복습
		String[] strs = {"spring","summer","fall","winter"};
		
		for (int i = 0; i < strs.length-1; i++) {
			for (int j = i+1; j < strs.length; j++) {
				if(strs[i].compareTo(strs[j])>0) {
					String tmp = strs[i];
					strs[i]=strs[j];
					strs[j]=tmp;
				}
			}
		}
		
		System.out.println(Arrays.toString(strs));
		
		
		
	////	
	}

}
