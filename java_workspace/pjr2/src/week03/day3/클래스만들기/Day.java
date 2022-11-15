package week03.day3.클래스만들기;

//일정 정보
public class Day {

	private int scheduleTime;
	private String scheduleDetails;
	
	//생성자
	public Day() {
		scheduleTime = 0;
		scheduleDetails = "--";
	}
	/*
	public Day(int scheduleTime,String scheduleDetails) {
		this.scheduleTime = scheduleTime;
		this.scheduleDetails = scheduleDetails;
	}
	*/
	
	//입력
	public void inputDay(int scheduleTime,String scheduleDetails) {
		this.scheduleTime = scheduleTime;
		this.scheduleDetails = scheduleDetails;
	}
	
	//출력
	public void printPersonalData() {
		System.out.printf(" 일정시간: %02d시   ",scheduleTime);
		System.out.print("일정내용: "+scheduleDetails+"\n");
	}
}
