package week02.day4;

import java.util.Iterator;
import java.util.Scanner;


public class Ex06화폐4 {
	
	//Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		// 함수 사용하기
		
		/*
		//자료명세
		입력자료 : 사원명 name[]
		         출장비 pay[]
		출력자료 : 화폐매수 money[][] 행:사원,열:각 화폐매수
		         총 화폐매수 moneyTot[]
	    처리자료 : 반복제어변수 i,j
	             화폐단위배열
	             나머지저장변수 r(초기값은 출장비)
		*/
		
		/*
		// 함수1 개인 화폐매수 구하기 getMoney
		 * 입력값 : 출장비 pay[], 사원수 num
		   
		   반복1 (사원수)
		     - 나머지저장변수 r에 출장비 값을 받는다
		       반복2 (8번)  
		       - r을 화폐단위로 나눈 몫을 화폐매수에 저장한다
		       - r을 화폐단위로 나눈 나머지를 나머지저장변수 r에 대입한다
		     
		// 함수2 총 화폐매수 구하기 getTotalMoney
		 * 입력값 : 화폐매수 money[][]
		   
		   반복1 (사원수)
		       반복2 (8번)  
		       - 각 화폐매수 누적
		       
        // 함수3 출장비 입력받기 inputPay
        * 입력값 : 사원명 name[], 사원수 num

        // 함수4 사원명 입력받기 inputName
        * 입력값 : 사원수 num
		
		
		//처리과정
		1. 사원수 초기값 설정하기
		2. 사원명 입력받는 함수 호출
		3. 출장비 입력받는 함수 호출
		4. 화폐매수, 총 화폐매수 함수 호출
		5. 출력 반복 (사원수)
		   1 사원명, 출장비 출력하기
		   2 각 사원의 출장비의 화폐매수 출력하기
		6. 화폐단위별 총매수 출력하기
	    7. 종료
	    
		*/
		
		// 처리자료 
		//화폐단위
		int[] m = {50000,10000,5000,1000,500,100,50,10}; 
		//사원수
		int num = 2;
		
		// 입력받기
		//사원명
		String[] name = inputName(num);
		//출장비
		int[] pay = inputPay(name,num);

		
		//화폐매수 구하기
		int[][] money = getMoney(pay, num);
		//총 화폐매수 구하기
		int[] moneyTot = getTotalMoney(money);
		
		
		//화폐매수 출력하기
		System.out.println();
		System.out.println("=== 개인 화폐매수 ===");
		for(int i=0; i<money.length; i++) {
			System.out.println("이름: "+name[i]+", 출장비: "+pay[i]+"원");
			for(int j=0; j<money[i].length; j++) {
				System.out.print(m[j]+"원권: "+money[i][j]+"장 | ");
			}
			System.out.println();
			System.out.println();
		}
		
		//총 화폐매수 출력하기
		System.out.println();
		System.out.println("=== 총 화폐매수 ===");
		for(int i=0; i<moneyTot.length; i++) {
			System.out.print(m[i]+"원권: 총 "+moneyTot[i]+"장 | ");
		}
		
		
		
	////	
	}
	
	/*
    // 함수1 사원명 입력받기 inputName
	 * 입력값 : 사원수 num
	
    // 함수2 출장비 입력받기 inputPay
	 * 입력값 : 사원명 name[], 사원수 num

	 
	// 함수3 개인 화폐매수 구하기 getMoney
	 * 입력값 : 출장비 pay[], 사원수 num
	   
	// 함수4 총 화폐매수 구하기 getTotalMoney
	 * 입력값 : 화폐매수 money[][]
	   
	*/
	
	//함수 사용
	
	
	//사원명 입력받는 함수
	public static String[] inputName(int num) {
		
		String[] name = new String[num];
		Scanner scanner = new Scanner(System.in);

		for(int i=0; i<name.length; i++) {
			System.out.print("이름을 입력하세요. > ");
			name[i]=scanner.next();
		}

		return name;
	//
	}
	
	//출장비 입력받는 함수
	public static int[] inputPay(String[] name,int num) {
		
		int[] pay = new int[num];
		Scanner scanner = new Scanner(System.in);

		for(int i=0; i<pay.length; i++) {
			System.out.print(" "+name[i]+" 사원의 출장비를 입력하세요. > ");
			pay[i]= scanner.nextInt();
		}
		
		return pay;
	//
	}
	
	
	//화페매수 구하는 함수
	public static int[][] getMoney(int[] pay,int num) {
		//화폐매수
		int[][] money = new int[num][8];
		//화폐단위
		int[] m = {50000,10000,5000,1000,500,100,50,10}; 
		int r;
		
		//화폐매수 구하기
		for (int i=0; i < money.length; i++) {
			r = pay[i];
			
			for (int j=0; j < money[i].length; j++) {
				money[i][j] = r/m[j];
				r= r%m[j];
			}
		}
		
		return money;
	//
	}
	
	//총 화폐매수 구하는 함수
	public static int[] getTotalMoney(int[][] money) {
		//총 화폐매수
		int[] moneyTot = new int[8];

		for (int i=0; i < money.length; i++) {
			for (int j=0; j < money[i].length; j++) {
				moneyTot[j]+=money[i][j];
			}
		}
		
		return moneyTot;
	//	
	}
	

	
}
