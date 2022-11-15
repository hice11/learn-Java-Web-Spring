package week03.day4;

import java.util.Scanner;

// 일정 관리 프로그램
public class DayManagement {
	
	Day[] days;
	int index;
	Scanner sc = new Scanner(System.in);
	//생성자
	public DayManagement() {
		days = new Day[10];
		index = 0;
	}
	public DayManagement(int max) {
		days = new Day[max];
		index = 0;
	}
	
	//일정 등록
	public void register() {
		System.out.println("[등록]");
		System.out.println("시간 & 일정 입력하세요");
		String time= sc.next();
		String contents= sc.next();
		days[index] = new Day(time,contents);
		index++;
	}
	
	//일정 변경
	public void update() {
		System.out.println("[변경]");
		//전체 조회
		printInfoAll();
		//선택
		System.out.print("변경하고 싶은 일정을 선택 > ");
		int select = sc.nextInt();
		//입력
		System.out.println("변경할 시간 & 일정 입력하세요");
		String time= sc.next();
		String contents= sc.next();
		//setter 사용
		days[select-1].setTime(time);
		days[select-1].setContents(contents);
	}
	
	//일정 전체 조회
	public void printInfoAll() {
		System.out.println("[전체 일정]");
		for (int i = 0; i < index; i++) {
			System.out.printf("%02d ",(i+1));
			days[i].printInfo();
		}
	}
	
	//일정관리 프로그램의 시작, 메뉴 1.등록 2.조회 3.종료
	public void run() {
		System.out.print("[ 일정관리 프로그램 1.0 ]\n");
		loop1: while(true) {
			System.out.print("메뉴선택 1.등록 2.조회 3.변경 4.종료 > ");
			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				register();
				break;
			case 2:
				printInfoAll();
				break;
			case 3:
				update();
				break;
			case 4:
				System.out.println("[종료]");
				break loop1;

			default:
				System.out.println(" ! 잘못된 메뉴");
				break;
			}
		}
	}

}
