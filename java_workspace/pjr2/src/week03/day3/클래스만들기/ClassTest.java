package week03.day3.클래스만들기;

public class ClassTest {

	public static void main(String[] args) {
		//1번
		OrderInfo order = new OrderInfo("20220519001", "abc123", "2022년5월19일", "홍길순", "PM0345-12", "서울시 중구 을지로 299");
		order.printOrderInfo();
		
		System.out.println("=================================");
		
		//2번
		PersonalData pData = new PersonalData(40, "james", "married", 3);
		pData.printPersonalData();
		
		System.out.println();
		
		//Day
		Days days = new Days();
		//  일정등록 & 변경 (인덱스, 일정시간, 일정내용)
		days.inputDays(0, 9, "아침");
		days.inputDays(1, 10, "운동");
		days.inputDays(2, 11, "치과");
		days.inputDays(3, 12, "점심");
		days.inputDays(1, 10, "일정변경");
		
		//  일정조회
		days.printSchedule();
		
	////
	}
}
