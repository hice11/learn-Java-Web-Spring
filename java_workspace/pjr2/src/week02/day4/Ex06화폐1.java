package week02.day4;

public class Ex06화폐1 {

	public static void main(String[] args) {

		
		//화폐매수 구하기
		/*
		사원명, 출장비를 입력받아  -> 각 화폐매수 구하기
		(반복, 5명사원에 대해서 작업하기)
		화폐매수 구할때 출력하지 않고 한꺼번에 출력함
		마지막에 화폐단위별 총매수도 함께 출력하시오
		*/
		
		
		// 입력자료
		String worker;
		int salary;
		
		// 출력자료
		int m_50000;
		int m_10000;
		int m_5000;
		int m_1000;
		int m_500;
		int m_100;
		int m_50;
		int m_10;
		
		//처리 변수
		int balance;
		
		worker="ch";
		salary=312510;
		
		balance= salary;
		m_50000= balance/50000;  //6
		
		balance= balance%50000;  //12510
		m_10000= balance/10000;  //1
		
		balance= balance%10000;  //2510
		m_5000= balance/5000;    //0
		
		balance= balance%5000;  //2510
		m_1000= balance/1000;   //2
		
		balance= balance%1000;  //510
		m_500= balance/500;  //1
		
		balance= balance%500;  //10
		m_100= balance/100;  //0
		
		balance= balance%100;  //10
		m_50= balance/50;  //0
		
		balance= balance%50;  //10
		m_10= balance/10;  //1
		
		System.out.println(m_50000);
		System.out.println(m_10000);
		System.out.println(m_5000);
		System.out.println(m_1000);
		System.out.println(m_500);
		System.out.println(m_100);
		System.out.println(m_50);
		System.out.println(m_10);
		
		
	////	
	}

}
