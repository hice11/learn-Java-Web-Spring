package week02.day1.star;

public class Star_sol7 {

	public static void main(String[] args) {
		
			System.out.println("1번");
			
			for(int z = 1 ; z < 6 ; z++) {
	//			
			for(int i = 0 ; i < z ; i++) {
				System.out.print("*");
			}
			System.out.println("");
			}
				
				
	//		int i1 = 0;
	//		while(i1++ < z) {
	//			System.out.print("*");
	//		}
	//		System.out.println("");
	//		}
			
			
			
			System.out.println("");
			
			
			
			System.out.println("2번");
			
			for(int i = 0 ; i < 5 ; i++) {
				System.out.println("*****");
			}
	//		
	//		int i2 = 0
	//		while(i2++ < 5 ) {
	//			System.out.println("*****");
	//		}
	//		
	//		
			
			
			System.out.println("");
			
			
			
			System.out.println("3번");
			
				for(int i = 0 ; i < 5 ; i++) { // 0 1 2 3 4
				
				for(int z = 5 ; z > i ; z--) { // 5 4 3 2 1 0
					System.out.print("*");
				}
				
				System.out.println("");
				}
			
				System.out.println("");
				
			
				
				System.out.println("4번");
				
				for(int i = 0 ; i < 5 ; i++) { // 0 1 2 3 4
					
					for(int z = i ; z>0 ; z--) { //i 숫자만큼 띄어쓰기
						
					System.out.print(" ");
					}
					for(int z = 5 ; z > i ; z--) { // 별숫자 5 4 3 2 1 0
						System.out.print("*");
					}
					
					System.out.println("");
					}
			
				
				System.out.println("5번");
				
				for(int i = 1 ; i < 6 ; i++) { // i =  1 2 3 4 5
					for(int z = i ; z < 5 ; z++) { // 띄어쓰기 4 3 2 1 0
						System.out.print(" ");
					}
					for(int z = 0 ; z < i ; z++) {  // 별 갯수 1 2 3 4 5
						System.out.print("*");
					}
					System.out.println("");
					}
				
				
				System.out.println("6번");
	
				for(int i = 1 ; i < 8 ; i += 2) { // 1 3 5 7
					
					for(int z = i ; z < 6 ; z +=2) { // 3 2 1 0
						System.out.print(" ");
					}
					for(int z = 0 ; z < i ; z++ ) { // 1 3 5 7
						System.out.print("*");
					}
					System.out.println("");
				}
				
				
				
				System.out.println("");
				System.out.println("7번");
	
				for(int c = 0 ; c < 2 ; c++ ) { 
					if( c == 0) {
						for(int i = 1 ; i < 8 ; i += 2) { // 1 3 5 7
							
							for(int z = i ; z < 6 ; z += 2) { // 3 2 1 0
								System.out.print(" ");
							}
							for(int z = 0 ; z < i ; z++ ) { // 1 3 5 7
								System.out.print("*");
							}
							System.out.println("");
						}
					}
					else if( c == 1) {
						for(int i = 5 ; i > 0 ; i -= 2) {
							for(int z = i ; z < 6 ; z += 2) {
								System.out.print(" ");
							}
							for(int z = 0 ; z < i ; z++) {
								System.out.print("*");
							}
							System.out.println("");
						}
					}
				}
	


	}

}
