package week02.day1;

import java.util.Scanner;

public class Ex08Memory {
	
	public static void main(String[] args) {
		
		// 정적메모리
		// 동적메몰
		
		Scanner sc = new Scanner(System.in);
		int a, b, c, d;
		int[] arr;
		
		System.out.println("배열의 크기를 입력하세요");
		int size = sc.nextInt();
		
		arr = new int[size];
		// new 메모리요청, 메모리 확보되면 확보된 메모리의 주소 반환
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("수입력: ");
			arr[i]=sc.nextInt();
		}
		
		// 처리
		
		// 출력
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+"  ");
		}
	
		
		
		///
	}

}
