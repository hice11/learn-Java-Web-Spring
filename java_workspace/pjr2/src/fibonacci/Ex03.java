package fibonacci;

public class Ex03 {

	public static void main(String[] args) {
		
		// 조재연님 예시
		
		
		int p=1, n=1;
		System.out.print(p + " " + n + " ");
		for(int i=3; i<=10; i++) {
			n= n+p;
			System.out.print(n + " ");
			p= n-p;
		}
	}
	
}
