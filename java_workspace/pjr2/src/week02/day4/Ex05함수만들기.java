package week02.day4;

public class Ex05함수만들기 {

	public static void main(String[] args) {
		
		//1차원 배열
		String[] week = {"월요일","화요일","수요일","목요일","금요일","토요일","일요일"};
		
		//1차원 배열 출력 함수 호출
		arrOut1(week);
				
		
		//1부터 n까지 2차원 배열 생성 함수 호출
		int[][] result = array(5, 3);
		//2차원 배열 출력 함수 호출 
		arrOut2(result);
		
	////
	}

	
	//함수만들기
	//1차원 배열 출력 함수
	public static void arrOut1(String[] arr) {
		System.out.print(" |");
		for(int i=0; i<arr.length; i++) {
			System.out.print(" "+arr[i]);
		}
		System.out.print(" |\n");
	//
	}
	
	//2차원 배열 출력 함수
	public static void arrOut2(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print("\n |\t");
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.print("|");
		}
	//	
	}
	
	//1부터 n까지 2차원 배열 생성 함수
	public static int[][] array(int a,int b) {
		int[][] arr = new int[a][b];
		int n=1;
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				arr[i][j]=n; 
				n++;
			}
		}
		return arr;
	}
		
}
