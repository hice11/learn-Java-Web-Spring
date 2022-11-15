package week02.day4;

import java.util.Scanner;

public class Ex06화폐2 {

	public static void main(String[] args) {

		// 함수 사용
		
		//화폐매수 구하기
		/*
		사원명, 출장비를 입력받아  -> 각 화폐매수 구하기
		(반복, 5명사원에 대해서 작업하기)
		화폐매수 구할때 출력하지 않고 한꺼번에 출력함
		마지막에 화폐단위별 총매수도 함께 출력하시오
		
		1. 반복
		  - 사원이름 출장비입력
		  - 출장비에 대한 화폐매수구하기
		  - 화폐매수 출력하기
		*/
		String worker;
		int expense;
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<3; i++) {
			//입력
			System.out.print("이름 > ");
			worker = scanner.next();
			System.out.print("출장비 > ");
			expense = scanner.nextInt();
			//화폐매수
			int[] result = getMoneycount(expense);
			//출력
			for(int j=0; j<result.length; j++) {
				System.out.print(result[j]+"\t");
			}
			System.out.println();
		}
		
	////	
	}
	
	//화페매수 구하기
	public static int[] getMoneycount(int expense) {
		//int[] money_cnt = {6,1,1,0,0,1,0,1};
		int[] money_cnt = new int[8];
		
		int m_50000; // 5만원 매수
		int m_10000;
		int m_5000;
		int m_1000;
		int m_500;
		int m_100;
		int m_50;
		int m_10;
		//처리(나머지 잔액을 구할 변수)
		int balance;
		balance = expense;
		m_50000= balance/50000; // 오만원 화폐매수 구하기 6
		balance = balance%50000; // 15210
		m_10000= balance/10000; // 만원 화폐매수 구하기 1
		balance = balance%10000; // 2510
		m_5000= balance/5000; // 오천원 화폐매수 구하기 0
		balance = balance%5000; // 2510
		m_1000= balance/1000; // 천원 화폐매수 구하기 2
		balance = balance%1000; // 510
		m_500= balance/500; // 오백원 화폐매수 구하기 1
		balance = balance%500; // 10
		m_100= balance/100; // 백원 화폐매수 구하기 0
		balance = balance%100; // 10
		m_50 = balance/50 ; // 오십원 화폐매수 구하기 0
		balance = balance%50; // 10
		m_10 = balance/10; // 십원 화폐매수 구하기 1
		balance = balance%10; // 0 money_cnt[0]=m_50000;
		
		money_cnt[0]=m_50000;
		money_cnt[1]=m_10000;
		money_cnt[2]=m_5000;
		money_cnt[3]=m_1000;
		money_cnt[4]=m_5000;
		money_cnt[5]=m_100;
		money_cnt[6]=m_50;
		money_cnt[7]=m_10;
		
		return money_cnt;
	}

}
