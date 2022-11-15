package week03.day1;

public class 자판기2Test {

	public static void main(String[] args) {

		//객체 생성
		자판기2 s = new 자판기2(10000,1000,1000,1000);
		
		System.out.println("==영업 전 자판기 정보==");
		s.printInfo();
		
		
		//밀크커피 3번
		String result = s.milkCoffee(200);
		System.out.println(result);
		result = s.milkCoffee(100);
		System.out.println(result);
		result = s.milkCoffee(50);
		System.out.println(result);
		
		System.out.println("==밀크커피 판매 후 자판기 정보==");
		s.printInfo();
		
		//추가로 채우기
		s.fillCoffee();
		
		System.out.println("==채운 후 자판기 정보==");
		s.printInfo();
		
	////	
	}

}
