package week02.day1;

import java.util.Scanner;

public class Ex10Array {
	
	public static void main(String[] args) {
		
		// 국어, 영어, 수학 점수를 입력 받아 개인 평균 , 과목별 평균 출력
		// 100 90 80 -> 90
		// 90 100 80 -> 90
		// 80 90 100 -> 90
		// 국어평균 영어평균 수학평균
		
		/*
		 자료명세
		   입력 : 국어:kor,영어:eng,수학:math 점수
		   출력 : 개인 평균:person_avg, 과목별 평균:kor_avg,eng_avg,math_avg
		   처리 : 반복제어변수:i, 개인총점:person_tot, 국어점수총점:kor_tot, 영어점수총점:eng_tot, 수학점수총점:math_tot
		         MAX=5;
		
		   처리과정
		   1. 반복
		      1 개인성적입력
		      2 개인평균 구하기
		      3 개인평균 출력하기
		      4 과목별 총점 누적하기
		   2. 과목별 평균 구하기
		   3. 과목별 평균 출력하기
		   4. 종료
		 */
	
		Scanner scanner = new Scanner(System.in);
		
		int kor, eng, math;
		double kor_avg, eng_avg, math_avg, person_avg;
		int person_tot, kor_tot=0, eng_tot=0, math_tot =0;
		final int MAX=3;
		for(int i=0; i<MAX; i++) {
			System.out.print("국어 점수를 입력하세요: ");
			kor = scanner.nextInt();
			System.out.print("영어 점수를 입력하세요: ");
			eng = scanner.nextInt();
			System.out.print("수학 점수를 입력하세요: ");
			math = scanner.nextInt();
			
			person_tot = kor+eng+math;
			person_avg = person_tot/3.0;
			System.out.println("개인 평균: "+person_avg);
			
			kor_tot+=kor;
			eng_tot+=eng;
			math_tot+=math;
		}
		kor_avg=(double)kor_tot/MAX;
		eng_avg=(double)eng_tot/MAX;
		math_avg=(double)math_tot/MAX;
		
		System.out.println("국어 평균: "+kor_avg);
		System.out.println("영어 평균: "+eng_avg);
		System.out.println("수학 평균: "+math_avg);
		
		
		
		
		///
	}

}
