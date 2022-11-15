package week04.day3.interfaceEx;

public class HandPhone2 {

	//lg 배터리 사용 핸드폰
	
	private LgBattery lgBattery;
	
	//생성자에 lg 배터리 사용
	public HandPhone2() {
		lgBattery = new LgBattery(); 
	}

	void powerOn() {
		lgBattery.getEnergy();
		System.out.println("핸드폰이 켜집니다.");
	}
	
}
