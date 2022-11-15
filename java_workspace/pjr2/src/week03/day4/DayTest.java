package week03.day4;

import java.util.Scanner;

public class DayTest {

	public static void main(String[] args) {
		//복습
		
		//객체변수
		//day: 참조형변수
		Day day = new Day("09:00","강의");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("시간    일정내용 입력: ");
		String time = scanner.next();
		String contents = scanner.next();
		
		Day day2 = new Day(time,contents);
		day2.printInfo();
		
		Day[] days = new Day[2];
		days[0] = new Day("11:00","강의");
		days[1] = new Day("12:00","강의");
		
		days[0].printInfo();
		days[1].printInfo();
		
		
	}

}
