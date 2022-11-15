package week03.day5.상속3;

// Coffee > Americano
public class Americano extends Coffee{

	protected int water;
	
	//생성자
	public Americano() {
	}
	public Americano(int espressoShot, int water) {
		super(espressoShot);
		this.water = water;
	}
	
	//
	public void setWater(int water) {
		this.water = water;
	}
	
	public void makeAmericano() {
		espressoShot=2;
		water = 100;
		System.out.println("아메리카노입니다");
	}
	
	public void printAmericanoInfo() {
		printInfo();
		System.out.println("물 "+water+"ml");
	}
	
	
}
