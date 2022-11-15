package week04.day1.abstractEx;



// 추상클래스 : 추상메서드를 한개라도 
public abstract class Animal {
	
	

	public void 먹는다() {
		System.out.println("먹는다");
	}
	
	//자식에서 이 메서드를 구현하도록 강제
	public abstract void 짖는다();
	
}
