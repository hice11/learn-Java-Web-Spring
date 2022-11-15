package week02.day3;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		
		// 국어점수, 영어점수, 수학점수를 입력 받아서 개인총점, 과목별평균
		
		/*
		 	//처리과정
		 
		 	- 학생성적 입력 (배열)
		 	- 학생성적 처리 (배열)
		 	- 학생성적 출력
		 	- 각 과목별 평균 출력
		 	
		 */
		
		
		// 첫번째학생 : 80,90,100 (각 배열의 0번째 index)
		// 두번째학생 : 70,100,99 (각 배열의 1번째 index)
		// 세번째학생 : 100,99,80 (각 배열의 2번째 index)
		
		// 0   1   2
		// 90  90  90  //kor
		// 80  80  80  //eng
		// 100 90  80  //math
		// 270 260 250 //person_tot
		
		final int MAX=3;
		int[] kor = new int[MAX];
		int[] eng= new int[MAX];
		int[] math = new int[MAX];
		
		//출력자료
		int[] person_tot = new int[MAX];
		double[] person_avg = new double[MAX];
		double kor_avg, eng_avg, math_avg;
		//처리자료
		int kor_tot=0, eng_tot=0, math_tot=0;
		
		Scanner scanner = new Scanner(System.in);
		
		//입력
		for (int i = 0; i < MAX; i++) {
			System.out.println("국어 영어 수학");
			kor[i]=scanner.nextInt();
			eng[i]=scanner.nextInt();
			math[i]=scanner.nextInt();
		}
		
		//처리
		//개인성적 처리, 과목별성적 처리
		for (int i = 0; i < MAX; i++) {
			person_tot[i]= kor[i]+eng[i]+math[i];
			person_avg[i]= person_tot[i]/3.0;
			kor_tot = kor_tot + kor[i];
			eng_tot = eng_tot + eng[i];
			math_tot = math_tot + math[i];
		}
		//과목별평균
		kor_avg = (double)kor_tot/MAX;
		eng_avg = (double)eng_tot/MAX;
		math_avg = (double)math_tot/MAX;
		
		//출력
		System.out.println("=============성적출력=============");
		
		for (int i = 0; i < MAX; i++) {
			System.out.println(person_tot[i]+"  "+person_avg[i]+"  ");
		}
		
		System.out.println("과목별 평균");
		System.out.println("국어평균"+kor_avg);
		System.out.println("영어평균"+eng_avg);
		System.out.println("수학평균"+math_avg);
		
		
		////
	}

}
