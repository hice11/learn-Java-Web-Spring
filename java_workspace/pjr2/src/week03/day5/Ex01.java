package week03.day5;

public class Ex01 {

	public static void main(String[] args) {
		
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		//cat.짖는다();
		print(cat);
		
		//dog.짖는다();
		print(dog);
		
		print2(cat);
		print2(dog);
		
		
	////	
	}

	public static void print(Cat cat) {
		cat.짖는다();
	}
	
	public static void print(Dog dog) {
		dog.짖는다();
	}
	
	//매개변수의 다형성
	public static void print2(Animal animal) {
		animal.짖는다();
		// instanceof : 객체타입 확인 
		if (animal instanceof Cat) {
			// down 캐스팅(형변환)
			// 반드시 형 체크해야함
			((Cat)animal).쥐잡기();
		}
	}
	
	
	
}
