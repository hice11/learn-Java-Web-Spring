package week02.day4;

import java.util.Iterator;
import java.util.Scanner;

public class Ex06화폐3 {

	public static void main(String[] args) {

		
		//화폐매수 구하기
		/*
		사원명, 출장비를 입력받아  -> 각 화폐매수 구하기
		(반복, 5명사원에 대해서 작업하기)
		화폐매수 구할때 출력하지 않고 한꺼번에 출력함
		마지막에 화폐단위별 총매수도 함께 출력하시오
		*/
		
		/*
		//자료명세
		입력자료 : 사원명 name[], 
		         출장비 pay[]
		출력자료 : 화폐매수 배열 money[][] 행:사원,열:각 화폐매수
		         총 화폐매수 오만원, 만원, 오천원, 천원,오백원, 백원, 오십원, 십원
		          -> 배열로 moneyTot[]
	    처리자료 : 반복제어변수 i,j , 
	             화폐단위배열
	             나머지저장변수 r(초기값은 출장비), 
		*/
		
		/*
		//처리과정
		1. 반복 1 (5번)
		   1 사원명 입력받기
		   2 출장비 입력받기
		2. 반복 2 (5번)
		   1 사원의 출장비의 화폐매수 구하기
		     1) r을 화폐단위로 나눈 몫을 화폐매수에 저장한다
		     2) r을 화폐단위로 나눈 나머지를 나머지저장변수 r에 대입한다
		   	 3) 각 화폐매수 누적
		3. 반복 3 (5번)
		   1 사원명 출력하기
		   2 각 사원의 출장비의 화폐매수 출력하기
		4. 화폐단위별 총매수 출력하기
	    5. 종료
		*/
		
		// 입력자료
		//사원명
		String[] name = new String[5];
		//출장비
		int[] pay = new int[5];
		
		// 출력자료
		//화폐매수
		int[][] money = new int[5][8];
		//총 화폐매수
		int[] moneyTot = new int[8];
		
		// 처리자료 
		//화폐단위
		int[] m = {50000,10000,5000,1000,500,100,50,10}; 
		int r;
		
		
		
		Scanner scanner = new Scanner(System.in);
		//입력받기
		for(int i=0; i<2; i++) {
			System.out.print("이름을 입력하세요. > ");
			name[i]=scanner.next();
			System.out.print("출장비를 입력하세요. > ");
			pay[i]= scanner.nextInt();
		}
		
		//화폐매수 구하기
		for (int i = 0; i < 2; i++) {
			r = pay[i];
			
			for (int j = 0; j < money[i].length; j++) {
				money[i][j] = r/m[j];
				r= r%m[j];
				moneyTot[j]+=money[i][j];
			}
		}
		
		//출력하기
		for(int i=0; i<2; i++) {
			System.out.println("이름: "+name[i]+", 출장비: "+pay[i]);
			for(int j=0; j<8; j++) {
				System.out.print(m[j]+"원권: "+money[i][j]+"장 | ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		for(int i=0; i<8; i++) {
			System.out.print(m[i]+"원권: 총 "+moneyTot[i]+"장 | ");
		}
		/*
		*/
		
		
	////	
	}
	
	
	

}
