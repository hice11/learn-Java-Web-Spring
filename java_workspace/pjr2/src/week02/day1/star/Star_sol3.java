package week02.day1.star;

public class Star_sol3 {

	public static void main(String[] args) {
		 
		//1번
		
		for(int n=1;n<=5;n++) {
			for(int i=1;i<=n; i++) {
				System.out.print("*");
			}	
			System.out.println();
		}
		
		System.out.println();
		
		//2번
		
		for(int n=1;n<=5;n++) {
			for(int i=5;i>=n; i--) {
				System.out.print("*");
			}	
			System.out.println();
		}
		
		System.out.println();
			
		//3번
			
		for(int n=1;n<=5;n++) {
			for(int i=1;i<=n; i++) {
				System.out.print(" ");
			}	
			for(int  i=5;i>=n; i--) {
					System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();	
				
		//4번
				
		for(int n=1;n<=5;n++) {
			for(int i=4;i>=n; i--) {
					System.out.print(" ");
			}
			for(int i=1;i<=n; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
			
		//5번
			
		for(int n=1;n<=5;n++) {
			for(int i=1;i<=5; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
				
				
		//6번
				
		for(int n=1;n<=4;n++) {
			for(int i=1;i<=4-n; i++) {
				System.out.print(" ");
			}
			for(int i=1;i<=2*n-1; i++) {
				System.out.print("*");
			}
			for(int i=1;i<=4-n; i++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println();
					
		//7번

		for(int n=1;n<=4;n++) {
			for(int i=1;i<=4-n; i++) {
				System.out.print(" ");
			}
			for(int i=1;i<=2*n-1; i++) {
				System.out.print("*");
			}
			for(int i=1;i<=4-n; i++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		for(int n=3;n>=1;n--) {
			for(int i=1;i<=4-n; i++) {
					System.out.print(" ");
			}
			for(int i=1;i<=2*n-1; i++) {
					System.out.print("*");
			}
			for(int i=1;i<=4-n; i++) {
					System.out.print(" ");
			}
			System.out.println();
		}
		
		
	}

}
