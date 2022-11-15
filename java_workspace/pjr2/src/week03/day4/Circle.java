package week03.day4;

public class Circle {

	int radius;
	String name;
	
	public Circle(int radius, String name) {
		this.radius=radius;
		this.name=name;
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	
}
