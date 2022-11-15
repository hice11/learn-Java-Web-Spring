package test;

public class MyClass {
	
	//문제2)  1~10까지의 합을 구하는 매서드를 작성하고 매서드를 실행하는 프로그램을 작성하시오  (10점)
	//- 클래스명 :  MyClass
	//- 매서드명: int getTenTotal() 
	public static int getTenTotal() {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		System.out.println(getTenTotal());
	}////
	

}
