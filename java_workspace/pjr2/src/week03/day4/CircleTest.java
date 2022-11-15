package week03.day4;

public class CircleTest {

	public static void main(String[] args) {

		Circle c1 = new Circle(10, "자바피자");
		Circle c2 = new Circle(20, "자바피자2");
		
		double r = c1.getArea();
		//c1.getArea(c1); => c1.getArea(this); // 자기참조
		
		double r2 = c2.getArea();
		
		System.out.println(r);
		System.out.println(r2);
		
	////	
	}

}
