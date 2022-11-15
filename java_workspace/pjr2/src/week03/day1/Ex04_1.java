package week03.day1;

import java.util.Scanner;

public class Ex04_1 {

	public static void main(String[] args) {
		
		int[] cnt= new int[3];

		addCount(cnt);	//1
		System.out.println(cnt[0]);
		addCount(cnt);	//2
		addCount(cnt);	//3
		
	////	
	}

	public static void addCount(int[] a) {
		a[0]=a[0]+1;
	}
	
	
	
//
}
