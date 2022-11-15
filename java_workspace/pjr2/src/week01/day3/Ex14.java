package week01.day3;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//매운맛 문제 5번 내가푼
		// 2! 3! 4! 5! 6! 7!
		
		//출력자료
		int sum=0;
		
		//처리자료
		int n=1; //팩토리얼 값

		for(int i=2; i<=7; i++) {
			n=n*i;
			sum=sum+n;
		}
		System.out.println(sum);
	}

}
