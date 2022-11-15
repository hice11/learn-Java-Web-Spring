package week02.day3.array;

import java.util.Scanner;

public class Q6and7 {

	public static void main(String[] args) {

		//배열문제 6번
		//일주일의 일정을 등록할 수 있는 배열을 만들고 조회될 수 있도록 작성하시오
		//7번
		//6번에서 일정을 변경할 수 있도록 작성하시오
		// 처리과정
		// - 배열 만들기
		// - 일정 등록 처리하기
		// - 일정 출력 처리하기
		// - 일정 변경 처리하기
		// - 일정 종료 처리하기
		
		Scanner scanner = new Scanner(System.in);
		
		String[] plan = new String[7];
		for (int i = 0; i < plan.length; i++) {
			plan[i]="일정이 비어있습니다.";
		}
		String[] week = {"일요일","월요일","화요일","수요일","목요일","금요일","토요일"};
		
		int num = 0; // case 선택
		int day = 0; // 인덱스
		
		loop1: while(true) {
			System.out.print("일정 1.등록 2.조회 3.변경 4.종료 \n번호를 입력하세요. > ");
			num = scanner.nextInt();
			switch (num) {
			case 1:
				System.out.println("\n일정을 등록할 요일의 번호를 선택해주세요.");
				System.out.print("1.일요일 2.월요일 3.화요일 4.수요일 5.목요일 6.금요일 7.토요일 > ");
				day = scanner.nextInt();
				if(0<day&&day<=7) {
					System.out.print(week[day-1]+"에 등록할 일정을 입력해주세요.\n > ");
					plan[day-1] = scanner.next();
					System.out.println("등록되었습니다.\n");
				}else {
					day=0;
					System.out.println("잘못 입력하셨습니다.\n");
				}
				break;
			case 2:
				System.out.println("\n일정을 조회할 요일의 번호를 선택해주세요.");
				System.out.print("1.일요일 2.월요일 3.화요일 4.수요일 5.목요일 6.금요일 7.토요일");
				System.out.println("\n전체 일정 조회는 0을 입력해주세요. \n > ");
				day = scanner.nextInt();
				if(0<day&&day<=7) {
					System.out.println(week[day-1]+" 일정: "+plan[day-1]+"\n");
				}else if(day==0) {
					System.out.println();
					for(int i=0; i<week.length; i++) {
						System.out.println(week[i]+" 일정: "+plan[i]);
					}
					System.out.println();
				}else {
					day=0;
					System.out.println("잘못 입력하셨습니다.\n");
				}
				break;
			case 3:
				System.out.println("\n일정을 변경할 요일을 선택해주세요.");
				System.out.print("1.일요일 2.월요일 3.화요일 4.수요일 5.목요일 6.금요일 7.토요일 > ");
				day = scanner.nextInt();
				if(0<day&&day<=7) {
					System.out.print("변경할 "+week[day-1]+"의 일정: "+plan[day-1]);
					System.out.print("\n변경할 내용을 입력해주세요. \n > ");
					plan[day-1] = scanner.next();
					System.out.println("변경되었습니다.\n");				
				}else {
					day=0;
					System.out.println("잘못 입력하셨습니다.\n");
				}
				
				break;
			case 4:
				System.out.println("종료합니다.\n");
				break loop1;
				
			default:
				System.out.println("다시 입력해주세요.\n");
				break;
			}
		}
		
		
		
		
		////
	}

}
