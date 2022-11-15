package week01.day3;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//순한맛 문제 4번 김소영님
		
		int sum=1, n=1;
		
		while(sum<1000) {
			n=n+2;
			sum=sum+n;
		}
		
		System.out.println(n+", "+sum);
	}

}
