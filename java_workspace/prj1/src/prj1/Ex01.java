package prj1;

public class Ex01 {
	public static void main(String[] args) {
		
		// 1 2 3 4  6 7 8 9 10
		
		int sum = 0; // 출력변수 초기화
		int N = 0;
		int tot; // 사용하지 않은 변수는 표시가 뜸
		
		while(N < 10){
			N++;
			sum +=N;
		}
		
		System.out.println("sum=" + sum);
	}
}
