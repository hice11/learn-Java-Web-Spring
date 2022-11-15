package week04.day1.abstractEx;

public class Ex01 {

	public static void main(String[] args) {
		
		Animal[] arrs = new Animal[3];
		
		arrs[0] = new Cat();
		arrs[1] = new Dog();
		arrs[2] = new Wolf();
		
		for (int i = 0; i < arrs.length; i++) {
			arrs[i].짖는다();
		}

		//Animal a = new Animal(); 
		// 추상클래스 -> 미완성클래스
		// 추상 클래스는 객체 생성 불가능
		// 추상클래스를 상속받은 자식클래스를 생성할 때 추상클래스의 내용들이 메모리에 생성됨
		// 자식을 통해서 생성됨
		
	////	
	}

}
