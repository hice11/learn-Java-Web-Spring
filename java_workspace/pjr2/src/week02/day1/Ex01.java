package week02.day1;

public class Ex01 {
	
	public static void main(String[] args) {
		
		// break
		// 자신이 속한 반복을 빠져나감
		
		// 1 ~ 10합
		int n=0;
		int sum=0;
		while(true) {
			n++;
			sum += n;
			if(n >= 10) break;  
		}
		System.out.println(sum);
		
		
		
		///
	}

}
