package week01.day3;

public class Ex03 {

	public static void main(String[] args) {
		
		/*
		 * . FIBONACCI 다음과 같은 수열을 수열이라고 합니다
		 1,1,2,3,5,8,13,21 ....
		 , . 즉 앞의 두 항을 합하면 다음 항이 됩니다
		 50 FIBONACCI 개의 수열을 구하여 인쇄하는 순서도를 작성하시오
		 
		출력 자료 : a , b, c
		처리 자료 : i
		c= a+b
		b= a+c
		a= b+c
		 */

		int a=1, b=1, c=0, i=0;
		System.out.print(a+" "+b+" ");
		while(i<16) {
			i++;
			c=a+b;
			System.out.print(c+" ");
			a=b+c;
			System.out.print(a+" ");
			b=c+a;
			System.out.print(b+" ");
		}
		
	}
}
