package week02.day1.star;

public class Star_sol8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		왼쪽 12345
		for(int i = 1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
			System.out.print("*");
			}
			System.out.println();
		}
		
//		왼쪽 54321
		System.out.println("========================");
		
		for(int i = 5; i>=1; i--) {
			for(int j=1; j<=i; j++) {
			System.out.print("*");
			}
			System.out.println();
		}
		
//		오른쪽 54321
		System.out.println("========================");
		
		for(int i = 1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=6-i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//		오른쪽 12345
		System.out.println("========================");
		
		for(int i = 1; i<=5; i++) {
			for(int j=1; j<=6-i; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//		트리
		System.out.println("========================");
		
		for(int i = 1; i<=4; i++) {
			for(int j=1; j<=4-i; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=2*i-1; k++) {
				System.out.print("*");
			}
			for(int j=1; j<=4-i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		

//		마름모
		System.out.println("========================");
		for(int i = 1; i<=4; i++) {
			for(int j=1; j<=4-i; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=2*i-1; k++) {
				System.out.print("*");
			}
			for(int j=1; j<=4-i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		for(int i = 3; i>=1; i--) {
			for(int j=1; j<=4-i; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=2*i-1; k++) {
				System.out.print("*");
			}
			for(int j=1; j<=4-i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}

	 

}
