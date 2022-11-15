package week03.day4;

import java.util.Random;

public class Ex01 {

	public static void main(String[] args) {

		//static 매서드, 클래스명.매서드()

		//Math
		//static double	random()

		double result = Math.random(); // 0~ 1보다 작은 임의의 실수형 난수
		System.out.println(result);


		//API Random 클래스
		//int nextInt()
		Random r = new Random();
		int result2 = r.nextInt();

		System.out.println(result2);


	}

}
