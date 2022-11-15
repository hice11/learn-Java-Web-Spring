package week02.day1;

import java.util.Scanner;

public class Ex06Array {
	
	public static void main(String[] args) {
		
		// 국어성적 5개 입력받아 출력하기
		// 입력과 출력을 분리하기 (기억 처리가 불일치 할때 배열이 필요햇짐)
		
		int[] kors = new int[5];
		Scanner sc = new Scanner(System.in);
		// 국어점수 5개 입력
		for(int i=0; i<kors.length; i++) {
			
			System.out.print("국어점수 입력: ");
			kors[i] = sc.nextInt();
		}
		
		// 국어점수 5개 출력
		for(int i=0; i<kors.length; i++) {
			System.out.print(kors[i]+" ");
		}
		
		System.out.println();
		
		// 입력과 출력을 분리하지 않고 처리할 때
		int kor;
		for(int i=1; i<=5; i++) {
			System.out.print("국어점수 입력: ");
			kor= sc.nextInt();
			System.out.println(kor);
		}
		
		///
	}

}
