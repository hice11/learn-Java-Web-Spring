package week02.day3;

public class Ex05 {

	public static void main(String[] args) {

		//Ex04 3번 3차원 배열 사용
		
		// 3. 1면 1~25를 넣고, 2면 짝수 , 3면 홀수 넣기
		
		int[][][] num = new int[3][5][5];
		
		int n3=1, n4=1, n5=1;
		int k=0, l=0, m=0, o=0;


		//배열 1
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				num[0][i][j]=n3; 
				n3++;
			}
		}
		//
		
		
		//배열 2 짝수 배열
		// k,l 사용
		for (int i = 0; i < 25; i++) {

			if(n4%2==0) {
				num[1][k][l]=n4;
				l++;

				if(l==5) {
					l=0;
					k=k+1;
				}
			}
			n4++;
		}
		//

		
		//배열 3 홀수 배열
		// m,o 사용
		for (int i = 0; i < 25; i++) {
			if(n5%2!=0) {
				num[2][m][o]=n5;
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

		
		//3차원 배열 출력
		System.out.println("3차원 배열 출력");
		for(int i=0; i<3; i++) {
			System.out.print("| ");
			for(int j=0; j<5; j++) {
				for(int q=0; q<5; q++) {
					System.out.print(num[i][j][q]+" ");
				}
				System.out.print("| ");
			}
			System.out.println();
		}
		
		
		
		
		////
	}

}
