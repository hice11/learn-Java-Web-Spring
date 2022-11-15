package fibonacci;

public class Ex01 {

	
	public static void main (String[] args) {
		
		// 김준서님 피보나치 예제
		
		int a=1, b=1, c;
		System.out.println(a + " " + b + " ");
		for( int i=1; i<=10; i++) {
			c= a+b;
			System.out.println(c + " ");
			a= b+c;
			System.out.println(a + " ");
			b= a+c;
			System.out.println(b + " ");
		}
		
	}
}
