package week04.day3;

public class Ex01 {

	public static void main(String[] args) {

		// arr, arr2 참조형 변수
		
		//int[] arr = {5,8,9,10,3};
		int[] arr = new int[] {5,8,9,10,3};
		
		//배열복사 //얕은복사, 깊은복사
		
		//배열의 얕은 복사
		int[] arr2 = arr;
		print(arr2);	
		//배열의 깊은 복사
		int[] result = copy(arr);
		print(result);
		
		arr[4]=33;
		print(arr2);
		print(result);
		
		
	////	
	}
	
	//배열의 깊은 복사
	private static int[] copy(int[] arr) {
		int[] newarr = new int[arr.length];
		for (int i = 0; i < newarr.length; i++) {
			newarr[i]=arr[i];
		}
		return newarr;
	}

	private static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	

}
