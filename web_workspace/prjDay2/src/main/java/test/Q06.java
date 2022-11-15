package test;

import java.util.Random;

public class Q06 {

	//문제6)  난수에 관련된 Random 클래스 (java.util.Random)를 사용하여  
	//정수형 난수를 하나 출력하는 프로그램을 작성하시오    (10점) 

	public static void printRandom() {
		
		Random random = new Random();
		int n = random.nextInt();
		System.out.println(n);
		
	}
	
	public static void main(String[] args) {
		printRandom();
	}
	
}
