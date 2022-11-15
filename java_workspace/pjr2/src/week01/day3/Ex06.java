package week01.day3;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 매운맛 문제 5번 등차수열
		// 2  6  18  54  162  486
		
		int sum=0; //누적
		int n;  // 항
		
		for(int i=0; i<7; i++) {
			n = (int)(2*Math.pow(3, i));	// 3 ^ i   3의 제곱 구하기
			System.out.print(n + " ");
			sum = sum + n;
		}
		
		System.out.println("\n합계= "+sum);
		
	}

}
