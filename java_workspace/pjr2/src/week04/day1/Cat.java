package week04.day1;


//상속
public class Cat extends Animal{
	
	public void 쥐잡기() {
		System.out.println("쥐를 잡는다");
	}
	
	//오버라이드 (상속관계에서만 오버라이드)
	@Override
	public void 짖는다() {
		System.out.println("야옹");
	}
	
}
