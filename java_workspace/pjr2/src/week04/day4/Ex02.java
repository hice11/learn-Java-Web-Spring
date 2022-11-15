package week04.day4;

import java.util.Arrays;

import week04.day4.sortAndComparator.Customer;

public class Ex02 {

	public static void main(String[] args) {

		
		char[] str1 = {'h','e','l','l','o'};
		char[] str2 = {'h','a','l','l','o'};
		
		// 두 문자열의 비교
		
		int result = str1[0] - str2[0];  // 0
		int result2 = str1[1] - str2[1];
		
		System.out.println(result);
		System.out.println(result2);
		
		Customer[] arr = new Customer[3];
		arr[0] = new Customer("이사람",28);
		arr[1] = new Customer("박사람",25);
		arr[2] = new Customer("김사람",26);
		
		
		
	////	
	}

}
