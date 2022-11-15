package week04.day1;

public class Ex02 {

	public static void main(String[] args) {
		
		//Animal a1,a2,a3;
		//참조형변수 3개를 배열로, 각각 null로 초기화
		Animal[] animals = new Animal[3];

		Cat cat = new Cat();
		Dog dog = new Dog();
		Cat cat2 = new Cat();
		cat.짖는다();
		dog.짖는다();
		cat2.짖는다();
		
		//상속받으면 다른 타입의 클래스를 하나의 객체배열에 참조할수있다
		animals[0] = new Cat();
		animals[1] = new Dog();
		animals[2] = new Cat();
		
		animals[0].짖는다();
		animals[1].짖는다();
		animals[2].짖는다();
		
		
		for (int i = 0; i < animals.length; i++) {
			animals[i].짖는다();
		}
		
		//다형성
		// 하나의 메시지 -> 각각 다르게 동작하는것 (각각 구현되어 있다)
	////	
	}

}
