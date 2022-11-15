package week01.day3;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 매운맛 문제 6번
		
		// d = 1 - 2/2! + 3/3! - 4/4! + 5/5!
		
		// 출력 : d
		// 처리변수 : 항:p, 분모:fac, 벤복제어변수,분자:i
		//			홀수항합계:b, 짝수항합계:c
		
		int fac=1;
		double p, b=0, c=0, d;
		for(int i=1; i<=5; i++) {
			fac = fac*i;	// 분모를 구한다
			p = i/(double)fac;	// 항을 구한다
			System.out.println(p);
			
			if(i%2==0) {
				c = c + p;	//짝수항 누적
			}else {
				b = b + p;	//홀수항 누적
			}
		}
		
		//
		d= b-c;	// 홀수항 - 짝수항
		System.out.println("전체합= "+d);
		
	}

}
