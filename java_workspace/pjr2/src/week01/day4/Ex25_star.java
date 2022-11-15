package week01.day4;

import java.util.Scanner;

public class Ex25_star {

	public static void main(String[] args) {
						
		// 별 찍기

		// 1. 삼각형
		String star = "";
		for(int i=0; i<5; i++) {
			star+="*";
			System.out.println(star);
		}
		//
		
		System.out.println("======");
		star = "";
		
		// 2. 역삼각 왼쪽 정렬
		for(int i=5; i>0; i--) {
			for(int j=0; j<i; j++) {
				star="*";
				System.out.print(star);
			}
			System.out.println();
		}
		//
		
		System.out.println("======");
		star = "";
		
		String blank="";
		
		// 3. 역삼각 오른쪽 정렬
		for(int i=5; i>0; i--) {
			System.out.print(blank);
			for(int j=0; j<i; j++) {
				star="*";
				System.out.print(star);
			}
			blank+=" ";
			System.out.println();
		}
		//
		
		System.out.println("======");
		star = "";
		
		blank="";
		
		// 4. 삼각형 오른쪽 정렬
		for(int j=0; j<5; j++) {
			for(int i=4; i>j; i--) {
				blank=" ";
				System.out.print(blank);
				//System.out.print(i);
			}
			star+="*";
			System.out.print(star);
			System.out.println();
		}
		//
		
		System.out.println("======");
		star = "";
		
		blank="";
		
		// 5. 5x5 
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//		
		
		System.out.println("======");
		star = "*";
		
		blank=" ";
		
		// 6. 트리 모양
		for(int j=0; j<4; j+=1) {
			for(int i=0; i<3-j; i++) {
				System.out.print(blank);
			}
			System.out.print(star);
			star+="**";
			System.out.println();
		}
		//
		
		System.out.println("======");
		star = "*";
		
		blank=" ";
		
		// 7. 마름모 모양
		int m=8;
		int n;
		for(int j=0; j<7; j++) {
			// 빈칸 반복문
			int i=0;
			int k=3-j;
			if(k<0) {k=-k;}
			while(i<k) {
				i++;
				System.out.print(blank);
//				System.out.print(j);
//				System.out.print(i+",");
//				System.out.print(k);
			}
			// 별 반복문
			m=m-2;
			n=m;
			if(n<0) {n=-n;}
//			System.out.print(m+" ");
			for(int l=7; l>n; l--) {
				System.out.print(star);
//				System.out.print(j+" ");
//				System.out.print(n);
			}
			
			System.out.println();
		}
						
		//
		/*
		 
		 빈칸
		j  3-j(k) k  i(i<k) 
		0   3     3  012
		1   2     2  01
		2   1     1  0
		3   0     0  
		4  -1     1  0
		5  -2     2  01
		6  -3     3  012
		
		 별
		j  m  n  l(l>n)
		0  6  6  7
		1  4  4  765
		2  2  2  76543
		3  0  0  7654321
		4 -2  2  76543  
		5 -4  4  765
		6 -6  6  7
		
		 */
		
		
		
		/*
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				
			}
		}


		 */
		
		////
	}

}
