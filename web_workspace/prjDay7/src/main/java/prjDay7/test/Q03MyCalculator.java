package prjDay7.test;

public class Q03MyCalculator {
	//문제3)  사칙연산을 하는 클래스를 작성하였다.  (MyCalculator)
	//static 매서드로 두 수를 입력받아 곱한 결과를 반환하는 매서드를 작성하고 
	//매서드를 이용해서 두 수를 곱한 결과를 모니터에 출력하시오 (10점)
	
	public static int multiply(int a, int b) {
		int mul = a * b;
		return mul;
	}
	
	
	public static void main(String[] args) {
		System.out.println(multiply(3, 5));
	}

}
