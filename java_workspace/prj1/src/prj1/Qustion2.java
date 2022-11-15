package prj1;

public class Qustion2 {
	public static void main(String[] args) {
		
		int N = 0;
		int sum = 0;
		int SUM = 0;
		while(N<100) {
			N++;
			sum += N;
			SUM += sum;					
		}
		System.out.println(SUM);
		
		
	}
}
