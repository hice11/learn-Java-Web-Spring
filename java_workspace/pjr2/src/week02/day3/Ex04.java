package week02.day3;

public class Ex04 {

	public static void main(String[] args) {

		//3차원 배열은 2차원 배열을 여러개 가지는것
		//int[] [] [] arr3 = new int[3][5][5]; 
		//					 5행5열이 3개 있다는 뜻
		
		/*
		1. 2차원배열 3행3열 1~9까지 수를 배열에 저장하세요
		2. 2차원배열 5행5열 1~25까지 수를 배열에 저장하세요
		입력과 출력 분리해서 작업
		
		3. 2차원배열 5행5열 3개를 만들어서 
		   1면 1~25수를 넣고, 2면 짝수 , 3면 홀수 넣기
		*/
		
		// 1. 2차원배열 3행3열 1~9까지 수를 배열에 저장하세요
		System.out.println("1번");
		
		int[][] num1 = new int[3][3];
		int n1=1;
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				num1[i][j]=n1; 
				n1++;
			}
		}
		// 출력
		System.out.print("| ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(num1[i][j]+" ");
			}
			System.out.print("| ");
		}
		System.out.println();

		
		
		// 2. 2차원배열 5행5열 1~25까지 수를 배열에 저장하세요
		System.out.println("2번");
		System.out.print("| ");
		
		int[][] num2 = new int[5][5];
		int n2=1;
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				num2[i][j]=n2; 
				n2++;
			}
		}
		// 출력
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(num2[i][j]+" ");
			}
			System.out.print("| ");
		}
		System.out.println();

		
				
		// 3. 2차원배열 5행5열 3개를 만들어서 
		// 1면 1~25수를 넣고, 2면 짝수 , 3면 홀수 넣기
		System.out.println("3번의 1)");
		System.out.print("| ");
		int[][] num3 = new int[5][5];
		int[][] num4 = new int[5][5];
		int[][] num5 = new int[5][5];
		int n3=1, n4=1, n5=1;
		int k=0, l=0, m=0, o=0;
		
		
		//배열 1
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				num3[i][j]=n3; 
				n3++;
			}
		}
		//배열 1 출력
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(num3[i][j]+" ");
			}
			System.out.print("| ");
		}
		System.out.println();
		
		
		//배열 2
		System.out.println("3번의 2) 짝수 배열");
		
		// 기존 방식 -> 배열에 순서대로 들어가지 않음
		/*
		System.out.print("| ");
		for (int i = 0; i < 5; i++) {
			l=0;
			for (int j = 0; j < 5; j++) {
				if(n4%2==0) {
					num4[i][l]=n4;
					System.out.print(num4[i][l]+" ");
				}
				n4++;
			}
			System.out.print("| ");
		}
		*/
		
		// k,l 사용
		System.out.print("| ");
		for (int i = 0; i < 25; i++) {
			
			if(n4%2==0) {
				num4[k][l]=n4;
				l++;
				
				if(l==5) {
					l=0;
					k=k+1;
				}
			}
			n4++;
		}
		//
		
		//배열 2 출력
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(num4[i][j]+" ");
			}
			System.out.print("| ");
		}
		System.out.println();
		
		
		//배열 3
		System.out.println("3번의 3) 홀수 배열");
		
		// 기존 방식 -> 배열에 순서대로 들어가지 않음
		/*
		System.out.print("| ");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(n5%2!=0) {
					num5[i][j]=n5;
				}
				n5++;
			}
		}
		//
		*/
		
		// m,o 사용
		System.out.print("| ");
		for (int i = 0; i < 25; i++) {
			if(n5%2!=0) {
				num5[m][o]=n5;
				o++;
				
				if(o==5) {
					o=0;
					m=m+1;
				}
				//
			}
			n5++;
		}
		//
		
		//배열 3 출력
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(num5[i][j]+" ");
			}
			System.out.print("| ");
		}
		
		
		////
	}

}
