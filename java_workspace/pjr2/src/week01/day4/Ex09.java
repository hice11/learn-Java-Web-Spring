package week01.day4;

public class Ex09 {

	public static void main(String[] args) {

		/*
		 * 
		증감연산자 ++, --
		a++, ++b 차이
		공통점 : 변수의 값을 1증가 시킴
		차이점 : 연산의 반환값이 다름
		
		*/
		
		
		// 10~1까지의 합을 구하시오
		
		int sum=0;
		int n=10;
		while(n>0) {
			sum = sum+n;
			n--;
		}
		
//			System.out.println("n: "+n);
			System.out.println("sum: "+sum);
//			System.out.println("=======");
//		for(int i=10; i>0; i--) {
//			sum += i;
//		}
//			System.out.println("sum: "+sum);
		
		
		
		//
		
	}

}
