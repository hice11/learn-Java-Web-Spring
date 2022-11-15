package week02.day3;

public class Ex06 {

	public static void main(String[] args) {
		
		// 2차원 배열, 행의 크기가 다를때

		int[][] arr2 = new int[3][];
		arr2[0] = new int[3];  // 0 1 2 
		arr2[1] = new int[2];  // 0 1 
		arr2[2] = new int[4];  // 0 1 2 3
		
		int cnt=0;
		
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				arr2[i][j]= ++cnt; 
			}
		}
		
		System.out.print(arr2[0][0]+" ");
		System.out.print(arr2[0][1]+" ");
		System.out.print(arr2[0][2]+" ");
		System.out.println();
		
		System.out.print(arr2[1][0]+" ");
		System.out.print(arr2[1][1]+" ");
		System.out.println();
		
		System.out.print(arr2[2][0]+" ");
		System.out.print(arr2[2][1]+" ");
		System.out.print(arr2[2][2]+" ");
		System.out.print(arr2[2][3]+" ");
		
		
		
		////
	}

}
