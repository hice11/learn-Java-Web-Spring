package week01.day4;

public class Ex02 {

	public static void main(String[] args) {

		/*
		1byte (8bit)
		bit : 0 or 1
		0~9 숫자 : 인간
		0~1 숫자 : 기계
		8bit -> 0~255 or -128~127
		*/
		byte b =127; //ok
//		byte b =128; //에러
		int su =25000;
		
		/*
		리터럴(값 자체)도 저장된 다음부터 사용된다 (상수영역)
		정수 숫자 -> int
		실수 숫자 -> double
		*/
		
//		long su2 = 2200000000; //에러
		long su2 = 2200000000L; //ok long형 상수를 저장할때는 숫자 끝에 "l" 또는 "L"을 붙여야 한다
		
		double avg =96.88;
		
//		 float height1 =165.2; //에러
		 float height2 =165.2f; // float형 상수를 사용하고 싶을때 f를 붙여야 함
		 double height3 = 165.2; // 기본값이 double이라 에러X
		
		 // 변수 = 값
		 // 변수(공간)이 작으면 문제가 발생한다
		 long l_var =125;
		 int i_var =125;
		 
		 l_var =i_var;	// 큰 공간 = 작은값 (작은값이 큰값으로 자동형변환)
		 i_var =(int)l_var;	// 작은 공간 = 큰값 (명시적으로 형변환 해야함)
		 // (int) -> 형변환 연산자, 캐스트 연산자
		 
		 //
		 double term = 1/2; // 0.5 기대 -> 0이 나옴
		 double term1 =1/2.0;	// 0.5
		 double term2 =1/(double)2;	// 0.5
		 System.out.println(term);
		 System.out.println(term1);
		 System.out.println(term2);
		 // 정수 / 정수 -> 정수 연산
		 // 정수 / (실수형) 정수 -> 실수형 연산
	}

}
