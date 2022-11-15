package fibonacci;

public class Ex02 {

	public static void main(String[] args) {
		
		// 피보나치 예제
		
		// 1 1 2 3 5 8 13 21 55
		
		long num1=1;
		long num2=1;
		long sum=2;
		long num3;
		
		System.out.println(num1+"  "+num2+"  ");
		for(int i=2; i<49; i++) {
			num3 = num1 + num2;
			sum = sum + num3;
			System.out.println(i+": "+num3+ "  ");
			
			// 갱신
			num1 = num2;
			num2 = num3;
		}
		System.out.println("\n합 "+sum);
		
	}
	
}
