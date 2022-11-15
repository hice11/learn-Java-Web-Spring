package week04.day3.interfaceEx;

public class LgBattery implements Battery{

	public LgBattery() {
		System.out.println("Lg battery 입니다.");
	}
	
	@Override
	public void getEnergy() {
		System.out.println("에너지 얻어옴");
		
	}
//	public void getEnergy() {
//		System.out.println("에너지 얻어옴");
//	}
	
}
