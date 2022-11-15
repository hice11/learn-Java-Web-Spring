package week04.day1;

public class Ex01 {

	public static void main(String[] args) {
		
		//new 힙메모리 사용하는 방식, 메모리 요청하는 방식
		//요청된 메모리의 주소를 참조하는 방식으로 데이터를 다룬다
		
		
		//인스턴스 타입과 참조형변수의 type 일치해야 함
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		
		//상속관계에서 업캐스팅 upcasting
		//상속관계에서만 가능
		//부모형으로 참조가 되면 의미가 축소
		Animal animal = new Cat();
		
		//다운캐스팅
		Cat cat2 = (Cat)animal; 
		cat2.쥐잡기();
		//((Cat)animal).쥐잡기(); //한줄로
		
		
		//Animal 객체를 cat으로 변환하는것
		Animal a = new Animal();  //주의해야함
		Cat c = (Cat)a;
		c.쥐잡기();
		
		
	}
	
	
	
}
