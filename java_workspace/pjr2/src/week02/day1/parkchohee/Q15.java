package week02.day1.parkchohee;

import java.util.Scanner;

public class Q15 {
	
	public static void main(String[] args) {
		
		/*
		문제15. 화폐매수구하기
		사원명, 출장비를 입력받아  -> 각 화폐매수 구하기
		(반복, 5명사원에 대해서 작업하기)
		화폐매수 구할때 출력하지 않고 한꺼번에 출력함
		마지막에 화폐단위별 총매수도 함께 출력하시오
		*/
		
		Scanner scanner = new Scanner(System.in);
		
		// 입력 자료
		// 이름 배열
		String[] name = new String[5];
		// 출장비
		int money;
		
		// 출력 자료
		// 사람당 각 화폐매수 배열 
		//moneys[i][j] i번째 사람, j는 5만원, 만원, 오천원, 천원권 장수 순서
		int[][] moneys = new int[5][4];
		// 총 화페 매수 (5만원, 만원, 오천원, 천원권 순서)
		int five1=0, one1=0, five2=0, one2=0;
		
		
		// 반복문
		while(true) {
			
			for (int i = 0; i < 5; i++) {
				// 사원명 입력
				System.out.print("이름을 입력하세요: ");
				name[i] = scanner.next();
				
				// 출장비 입력
				System.out.print("출장비를 입력하세요: ");
				money = scanner.nextInt();
				// 화페 매수 구하기
				
				// 1. 나머지 연산자 이용
				// moneys[i][0]= (money-money%50000)/50000;
				// moneys[i][1]= (money%50000-(money%50000)%10000)/10000;
				// moneys[i][2]= ((money%50000)%10000-((money%50000)%10000)%5000)/5000;
				// moneys[i][3]= (((money%50000)%10000)%5000-((((money%50000)%10000)%5000)%1000))/1000;
				
				
				// 2. 몫의 정수 이용
				// 오만원 money/50000 -> 정수로 출력
				// 만원 (money%50000)/10000
				// 오천원 ((money%50000)%10000)/5000
				// 천원 (((money%50000)%10000)%5000)/1000
				moneys[i][0]= money/50000;
				moneys[i][1]= (money%50000)/10000;
				moneys[i][2]= ((money%50000)%10000)/5000;
				moneys[i][3]= (((money%50000)%10000)%5000)/1000;
				
				// 각 사원의 화폐 매수 출력
				System.out.println(name[i]+"사원의 출장비의 화폐 매수는 5만원권은 "+moneys[i][0]+"장, 만원권은 "+moneys[i][1]+"장, 오천원권은 "+moneys[i][2]+"장, 천원권은 "+moneys[i][3]+"장 입니다.");
				
				// 화폐단위별 총 매수 구하기
				five1 += moneys[i][0];
				one1 += moneys[i][1];
				five2 += moneys[i][2];
				one2 += moneys[i][3];
				
			}
			
			// 화폐단위별 총 매수 출력
			
			System.out.println();
			System.out.println("화폐단위별 총 매수: 오만원권은 총 "+five1+"장, 만원권은 총 "+one1+"장, 오천원권은 총 "+five2+"장, 천원권은 총 "+one2+"장 입니다.");
			
			System.out.println();
			System.out.println();
		}
		
		
		
		///
	}

}
