package week03.day1;

public class 자판기Test {

	public static void main(String[] args) {

		//클래스를 이용해서 객체 생성
		//자판기 s = new 자판기();	//생성자를 만들지 않아서 기본 생성자를 사용할경우
		자판기 s = new 자판기(1000,1000,1000,1000);	//생성자 이용할 경우
		
		
		//클래스가 가진 객체 기능 사용
		
		//s.initCoffee();

		s.fillCoffee();
		s.printInfo();

		String result = s.밀크커피만들기(100);
		System.out.println(result);
		
		
	////	
	}

}
