package week03.day5.상속3;

// Coffee > CafeLatte
public class CafeLatte extends Coffee{

	protected int milk;
	
	//생성자
	public CafeLatte() {
	}
	public CafeLatte(int espressoShot,int milk) {
		super(espressoShot);
		this.milk=milk;
	}
	
	//
	public void setMilk(int milk) {
		this.milk = milk;
	}
	
	public void makeCafeLatte() {
		espressoShot=2;
		milk=120;
		System.out.println("카페라떼입니다");
	}
	
	public void printCafeLatteInfo() {
		printInfo();
		System.out.println("우유 "+milk+"ml");
	}
	
}
