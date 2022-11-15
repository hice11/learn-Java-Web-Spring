package week02.day1.star;

public class Star_Q7 {

	public static void main(String[] args) {
		
		// 별 찍기 문제

		String star = "";
		String blank="";
		
		star = "*";		
		blank=" ";
		
		// 7. 마름모 모양
		
		/*
		j  전체반복문 반복제어변수
		
		k  부호 변경용 변수
		i  빈칸 반복문의 반복제어변수, 0부터 1씩 증가, k미만
		
		m  별 반복문에서 2씩 감소
		n  부호 변경용 변수
		l  별 반복문의 반복제어변수, 7부터 1씩 감소, n초과
		 
		// 빈칸
		j  3-j(k) k  i(i<k) 
		0   3     3  012
		1   2     2  01
		2   1     1  0
		3   0     0  
		4  -1     1  0
		5  -2     2  01
		6  -3     3  012
		
		// 별
		j  m  n  l(l>n)
		0  6  6  7
		1  4  4  765
		2  2  2  76543
		3  0  0  7654321
		4 -2  2  76543  
		5 -4  4  765
		6 -6  6  7
		
		*/		
		
		
		// 별 반복문용 변수 
		int m=8;
		int n;
		// 전체 반복문 (7줄)
		for(int j=0; j<7; j++) {
			System.out.print("j="+j+"  ");
			// 1. 빈칸 반복문
			int i=0;
			int k=3-j;
			if(k<0) {k=-k;}
			
			while(i<k) {
				i++;
				System.out.print(blank);
			}
			//

			// 2. 별 반복문
			m=m-2;
			n=m;
			if(n<0) {n=-n;}

			for(int l=7; l>n; l--) {
				System.out.print(star);
			}
			//
			System.out.println();
		}	
		//
		

		
		
		///
	}
	
}
