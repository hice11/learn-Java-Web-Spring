package week02.day4;

public class Ex03Func {

	public static void main(String[] args) {

		int result = getTenTotal();
		System.out.println(result);
		
	////
	}
	
	public static int getTenTotal () {
		int sum=0;
		for(int i=1; i<=10; i++) {
			sum+=i;
		}
		return sum;
	//	
	}
		
}
