package day3.thread;

public class Cat {

	String name;
	int age;
	
	public void disp() {
		System.out.println( this.name +  this.age + "입니다");
		
	}

	public Cat() {
		// TODO Auto-generated constructor stub
	}
	public Cat(String name, int age) {
	 
		this.name = name;
		this.age = age;
	}
	
}
