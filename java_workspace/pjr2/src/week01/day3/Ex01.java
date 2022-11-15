package week01.day3;

public class Ex01 {

	public static void main(String[] args) {
		
		/*
		 * 
		 * <매운맛>
			문제1. 1999년 H시의 인구는 250만명, 연증가율은 3.6%이고 k시의 인구는 180만명이며 연증가율은 4.2%일 때 K시의 인구가 H시의 인구보다 많아지게 되는 해를 구하는 순서도를 작성하시오
			■자료명세표
			1. 출력자료:year(해)
			2. 처리자료:H(H시), K(K시), I(반복수)
			
			■처리과정
			1. 반복
				1-1. year가 1증가
				1-2. k시의 인구 구하기
				1-3. h시의 인구 구하기
			
			START
			2. YEAR 출력
			3. 종료
		 */
		int year=1999;
		double H=2500000, K=1800000;	//float, double
		
		while(K < H) {
			year += 1;
			H *= 1.036;
			K *= 1.042;
		}
		System.out.println(year);
		
	}
	
}
