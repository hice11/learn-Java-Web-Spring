package week01.day4;

public class Ex08 {

	public static void main(String[] args) {

		/*
		 * 
		증감연산자 ++, --
		a++, ++b 차이
		공통점 : 변수의 값을 1증가 시킴
		차이점 : 연산의 반환값이 다름
		
		*/
		int su1=10;
		int su2=10;
		int result1;
		int result2;
		
		result1 = su1++; // 증가되기전의 값을 반환
			// su1: 11, result1: 10
		result2 = ++su2; // 증가된 후의 값을 반환
			// su2: 11, result2: 11
		
//		System.out.println(su1+" "+result1);
//		System.out.println(su2+" "+result2);
		
		// 1~10까지의 합을 구하시오
		
//		int sum=0;
//		int n=0;
//		
//		while(n<10) {
//			n++;
//			sum = sum+n;
//		}
//		System.out.println(sum);
		
		int sum=0;
		int n=0;
		while(++n<10) {
			System.out.println(n);
			sum = sum+n;
			System.out.println(sum);
			System.out.println("===");
		}
		
		
		
		//
		
	}

}
