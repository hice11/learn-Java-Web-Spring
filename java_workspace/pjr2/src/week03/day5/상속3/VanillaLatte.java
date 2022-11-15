package week03.day5.상속3;

// CafeLatte > VanillaLatte
public class VanillaLatte extends CafeLatte{

	protected int vanillaSyrup;
	
	//생성자
	public VanillaLatte() {
	}
	public VanillaLatte(int espressoShot,int milk,int vanillaSyrup) {
		super(espressoShot,milk);
		this.vanillaSyrup=vanillaSyrup;
	}
	
	//
	public void setVanillaSyrup(int vanillaSyrup) {
		this.vanillaSyrup = vanillaSyrup;
	}
	
	public void makeVanillaLatte() {
		espressoShot=2;
		milk=120;
		vanillaSyrup=15;
		System.out.println("바닐라라떼입니다");
	}
	
	public void printVanillaLatteInfo() {
		printCafeLatteInfo();
		System.out.println("바닐라시럽 "+vanillaSyrup+"ml");
	}
	
	
}
