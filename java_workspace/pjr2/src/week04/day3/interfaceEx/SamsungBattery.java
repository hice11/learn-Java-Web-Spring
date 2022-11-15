package week04.day3.interfaceEx;

public class SamsungBattery implements Battery{

	public SamsungBattery() {
		System.out.println("Samsung battery 입니다");
	}
	
	@Override
	public void getEnergy() {
		System.out.println("에너지 얻어옴");
		
	}
//	public void getEnergy() {
//		System.out.println("에너지 얻어옴");
//	}
	
}
