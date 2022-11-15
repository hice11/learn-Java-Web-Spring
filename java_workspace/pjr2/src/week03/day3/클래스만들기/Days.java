package week03.day3.클래스만들기;

//일정정보 10개
public class Days {

	//Day객체 배열
	private Day[] days = new Day[10];
	
	//생성자 (초기화)
	public Days() {
		for (int i = 0; i < days.length; i++) {
			days[i] = new Day();
		}
	}
	
	//등록 & 변경
	public void inputDays(int index,int scheduleTime,String scheduleDetails) {
		days[index].inputDay(scheduleTime, scheduleDetails);
	}
	
	
	//조회
	public void printSchedule() {
		System.out.println("=========== 전체일정 조회 ===========");
		for (int i = 0; i < days.length; i++) {
			System.out.printf(" %02d ",(i+1));
			days[i].printPersonalData();
		}
	}
	
}
