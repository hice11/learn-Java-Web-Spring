package week04.day3.interfaceEx;

public class TestMain {

	public static void main(String[] args) {
		
		HandPhone handPhone = new HandPhone();
		//LgBattery lg = new LgBattery();
		//handPhone.setBattery(lg);
		
		SamsungBattery ss = new SamsungBattery();
		handPhone.setBattery(ss);
		handPhone.powerOn();
		
		HandPhone2 handPhone2 = new HandPhone2();
		handPhone2.powerOn();

	}

}
