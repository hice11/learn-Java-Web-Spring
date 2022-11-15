package week02.day1;

import java.util.Scanner;

public class Ex11Array {
	
	public static void main(String[] args) {
		
		// 국어, 영어, 수학 점수를 입력 받아 개인 평균 , 과목별 평균 출력
		
		
		// 입력, 처리, 출력을 분리해서 문제를 해결하는 방법 (배열사용)
		
		/*
		 자료명세
		   입력
		   	- 국어성적배열:kors(5)
		   	- 영어성적배열:engs(5)
		   	- 수학성적배열:maths(5) 점수
		   출력
		   	- 개인 평균 배열:person_avgs(5)
		   	- 과목별 평균:kor_avg,eng_avg,math_avg
		   처리
		   	- 반복제어변수:i
		   	- 개인총점:person_tots(5)
		   	- 국어점수총점:kor_tot, 영어점수총점:eng_tot, 수학점수총점:math_tot
		   	- MAX=5;
		
		   처리과정
		   1. 반복
		      1.개인성적입력
		   2. 반복
		      1.개인총점 구하기
		      2. 개인평균 구하기
		      3. 각 과목별 총점 누적하기
		   3. 과목별평균 구하기 
		   4. 반복
		      1.개인의 평균 출력
		   5. 과목별평균 출력
		   6. 종료
		   
		   처리과정
		   1. 개인성적을 각 점수배열에 입력
		   2. 반복
		      1.개인의 총점 구하기
		      2.개인의 평균 구하기
		      3.각 과목별 총점 누적하기
		   3. 각 과목별 평균 구하기
		   4. 개인성적과 평균을 출력하기
		   5. 각 과목별 평균 출력하기
		 */
	
		Scanner scanner = new Scanner(System.in);
		
		//입력자료
		int[] kors = new int[5];
		int[] engs = new int[5];
		int[] maths = new int[5];

		//출력자료
		double[] persons_avg = new double[5];
		double kor_avg, eng_avg, math_avg;
		
		//처리자료
		int[] persons_tot = new int[5];
		int kor_tot=0, eng_tot=0, math_tot =0;
		
		//입력하기
		for(int i=0;i<5;i++) {
			System.out.println("국어 영어 수학 점수 입력");
			kors[i]=scanner.nextInt();
			engs[i]=scanner.nextInt();
			maths[i]=scanner.nextInt();
		}
		
		//처리하기
		for(int i=0;i<5;i++) {
			persons_tot[i]= kors[i] + engs[i] + maths[i];
			persons_avg[i] = persons_tot[i]/3.0;
			
			//각 과목별 총점 누적하기
			kor_tot += kors[i];
			eng_tot += engs[i];
			math_tot += maths[i];
		}
		
		//과목별 평균 구하기
		kor_avg = kor_tot/5.0;
		eng_avg = eng_tot/5.0;
		math_avg = math_tot/5.0;
		
		//출력하기
		for(int i=0;i<5;i++) {
			System.out.println("개인 평균 "+(i+1)+": "+persons_avg[i]);
		}
		System.out.println("국어 과목 평균: "+kor_avg);
		System.out.println("영어 과목 평균: "+eng_avg);
		System.out.println("수학 과목 평균: "+math_avg);
		
		///
	}

}
