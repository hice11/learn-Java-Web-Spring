package week04.day2.objectEx;

import java.util.Arrays;

public class Ex07 {

	public static void main(String[] args) {

		String str = "AWESOME-amazing";
		//String str = new String("AWESOME-amazing");
		
		System.out.println("문자열의 길이 = "+str.length());
		System.out.println("대문자로 변환 = "+str.toUpperCase());
		System.out.println("2번째 문자 출력 = "+str.charAt(1));
		System.out.println("2번째 문자부터 부분만 가져오기 = "+str.substring(1));
		System.out.println("1번째 문자 이후부터 4번째 문자열 전까지 가져오기 = "+str.substring(0,3));
		
		String[] result = str.split("-");
		System.out.println(Arrays.toString(result));
		
		for(String n : result) { //for each 구문
			System.out.println(n);
		}
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}

	}

}
