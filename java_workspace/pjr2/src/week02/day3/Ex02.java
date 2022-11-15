package week02.day3;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		//학생의 점수 배열		
		//국영수 점수 입력 받고 출력 분리
		int[][] score = new int[3][3];

		Scanner scanner = new Scanner(System.in);
		
		//입력
		//행 0 1 2 
		for(int i=0; i<3; i++) {
			//열 0:국어점수, 1:영어점수, 2:수학점수
			//score[i][0]=scanner.nextInt();
			//score[i][1]=scanner.nextInt();
			//score[i][2]=scanner.nextInt();
			
			System.out.println("국어, 영어, 수학 점수 입력");
			for (int j=0; j<3; j++) {
				score[i][j]=scanner.nextInt();
			}
		}
		
		/*
		//첫번째 행 출력
		System.out.println(score[0][0]);
		System.out.println(score[0][1]);
		System.out.println(score[0][2]);
		
		//두번째 행 출력
		System.out.println(score[1][0]);
		System.out.println(score[1][1]);
		System.out.println(score[1][2]);
		
		//세번째 행 출력
		System.out.println(score[2][0]);
		System.out.println(score[2][1]);
		System.out.println(score[2][2]);
		*/
		
		//출력 반복문
		//고정반복 (i)
		//변화반복 (j)
		for (int i = 0; i < 3; i++) {
			System.out.print((i+1)+"번째 학생의 국어, 영어, 수학 점수는 ");
			for (int j = 0; j < 3; j++) {
				System.out.print(score[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		////
	}

}
