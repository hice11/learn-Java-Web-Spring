package ch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NextLine {

	// 프로그램 실행 메서드
		public static void run() {
			//극장 배열 데이터 입력
			ScreenData.theaterArray();
			Scanner sc = new Scanner(System.in);
			loop1: while(true) {

				String menu1;
				int menu=0;
				// 문자 입력시 예외처리
				while (true) {
					try {
						System.out.print("선택하세요 : ");
						menu1 = sc.nextLine();
						menu = Integer.parseInt(menu1);
						break;
					} catch (Exception e) {
						System.out.println("잘못 입력하셨습니다. 숫자를 입력해주세요.\n");
						
						
						//sc = new Scanner(System.in); //초기화
					}				 
				}//while
				
				switch(menu) {
				case 1 :
					System.out.println("");
					break;
				case 2 :
					System.out.println("");
					break;
				case 3 :
					System.out.println("");
					break;				
				default :
					System.out.println("올바르게 입력하세요\n");
				}//switch
			}//while
		}//
		
		
		public static void main(String[] args) {
			NextLine.run();
		}
		
	
	
}
