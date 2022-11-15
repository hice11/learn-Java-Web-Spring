package fibonacci;

public class Ex02_1 {

	public static void main(String[] args) {
		
		// 피보나치 수열 연습
		
		long n1 = 1;
		long n2 = 1;
		long N;
		N = n1;
		//System.out.println(N+" ");
		N = n2;
		//System.out.println(N+" ");
		
		for(int i=3; i<=50; i++) {
			System.out.println("i  : "+i+" ");
			System.out.println("n1 : "+n1+" ");
			System.out.println("n2 : "+n2+" ");
			N = n1 + n2;
			n1 = n2;
			n2 = N;
			System.out.println("N  : "+N+" ");
			System.out.println("================");
		}
		
	}
	
}
