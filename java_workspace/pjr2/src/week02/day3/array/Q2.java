package week02.day3.array;

public class Q2 {

	public static void main(String[] args) {

		//배열문제 2번
		//국어점수가 다음과 같이 배열에 준비되어 있을 때{ 80,70,90,85,81,66}
		//평균보다 높은 점수는 몇개인가?

		// 처리과정
		// - 국어 점수의 총합 구하기
		// - 국어 점수의 평균 구하기
		// - 평균보다 높은 점수의 개수 구하기
		// - 평균보다 높은 점수의 개수 출력
		
		int[] kors = { 80,70,90,85,81,66} ;
		int kor_tot=0;
		double kor_avg;
		int score=0;
		
		//처리
		for(int i=0; i<kors.length; i++) {
			kor_tot += kors[i];
		}
		kor_avg = (double)kor_tot/kors.length;
		
		for(int i=0; i<kors.length; i++) {
			if(kors[i]>kor_avg) score++;
		}
		
		//출력
		System.out.printf("평균 점수는 "+kor_avg+"이고 평균보다 높은 점수의 개수는 ");
		System.out.print(score+"개 이다.");
		
		
		////
	}

}
