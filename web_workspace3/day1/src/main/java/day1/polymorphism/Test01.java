package day1.polymorphism;

public class Test01 {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		animal.bark();
		
		Cat cat = new Cat();
		cat.bark();
		
		Dog dog = new Dog();
		dog.bark();
		
		//상속관계 
		// 업캐스팅
		Animal cat2 = new Cat();
		Animal dog2 = new Dog();
		 
		//부모의 매서드 (bark매서드를 자신에 맞게 오버라딩한다)		
		cat2.bark();
		dog2.bark();
		


		// 참조형변수 2개를 배열로
		Animal[] animals = new Animal[2];  
		/*
		     Animal cat2= null;
		     Animal dog2= null ;
		 */		
		
		//animals[0].bark();   //오류  NullPointException		
		// 객체생성코드 있어야 함
		animals[0]= new Cat();
		animals[1]= new Dog();

		animals[0].bark();
		animals[1].bark();	
		
		//부모의 기능만 사용가능
		//animals[0].catchMouse() 

		//
		// down캐스팅,  부모형 -> 자식형으로 다루는것 
		Cat newCat =  ((Cat)animals[0]);  
		newCat.catchMouse();

		((Cat)animals[0]).catchMouse();		

		/*	
		 *  배열: 동일한 자료형의 변수를 연속적으로 사용 , 반복문으로 접근가능
		int a;
		int b;
		// 변수 2개 배열로
		int[] nums= new int[2];

		 */


		
	}
	
}
