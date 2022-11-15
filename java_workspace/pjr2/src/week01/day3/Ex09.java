package week01.day3;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//  1  1  2  3  5  8  13  21
		
		int num1=1;
		int num2=2;
		int num3;
		int[] p = new int[8];
		
		p[0]=1;
		p[1]=1;
		
		for(int i=2; i<p.length; i++) {
			num3=num1+num2;
			p[i]=num3;
			num1=num2;
			num2=num3;
			
		}
		// 배열 출력 -> 반복문 이용
		for(int i=0; i<p.length; i++) {
			System.out.println(p[i]);
		}
		//
	}

}
