package week01.day4;

public class Ex11 {

	public static void main(String[] args) {
		
		// 10 9 8 7 6 5 4 3 2 1		=>55
		
		int sum1=0;
		int sum2=0;
		int sum3=0;
		int n=11;
		int a=11;
		int b=11;
		while(n>=1) {								//	n n-1 sum | --b b sum2| a--  a	sum1
			n=n-1;									// 11  10 10  | 10 10 10  | 11  10	10 
			sum1 = sum1+n;							// 10  9  19  | 9  9  19  | 10	 9	19 
			System.out.print(n+" ");				//	9  8  27  | 8  8  27  | 9	 8	27
		}											//	8  7  34  | 7  7  34  | 8	 7	34  
			System.out.println();					//	7  6  40  | 6  6  40  | 7	 6	40 
			System.out.println(sum1);				//	6  5  45  | 5  5  45  | 6	 5	45 
		while(a-->=1) {								//	5  4  49  | 4  4  49  | 5	 4	49 
			System.out.print(a+" ");				//	4  3  52  | 3  3  52  | 4	 3	52 
			sum2 = sum2+a;							//	3  2  54  | 2  2  54  | 3	 2	54 			
		}											//	2  1  55  | 1  1  55  | 2	 1	55 
			System.out.println();					//	1  0  55  | 0  0  55  | 1	 0	55
			System.out.println(sum2);
		while(--b>=0) {
			System.out.print(b+" ");	
			sum3 = sum3+b;		
		}	
			System.out.println();
			System.out.println(sum3);						
												
	}
}
													
