package week04.day2.objectEx;

public class Ex09 {

	public static void main(String[] args) {

		String[] arr = {"one","two","three"};
		
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				// comparTo() 메서드 - 기준이 크면 양수, 작으면 음수
				if( arr[i].compareTo(arr[j]) > 0 ) { //오름차순
					String tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]+" ");
		}
		
		
	////	
	}

}
