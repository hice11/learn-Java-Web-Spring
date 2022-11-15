package week03.day5;

public class AnimalTest {

	public static void main(String[] args) {
		
		Cat c = new Cat();
		c.먹는다();
		c.짖는다();
		c.쥐잡기();
	
		Dog d= new Dog();
		d.먹는다();
		d.짖는다();

		
		//상속 관계에서만 부모형 참조변수로 다룰 수 있다
		//단 부모형 참조변수로 다루게 되면 부모형으로 축소된다
		// (부모형 멤버만 사용할수 있다)
		Animal a = c;
		Animal a2 = new Cat();
		Animal a3 = new Dog();
		
		
		
		
	////	
	}

}
