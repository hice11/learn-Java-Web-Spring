package week01.day3;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//순한맛 문제 4번 조재연님 
		
		// 출력
		int number=1;
		int sum=0;
		
		//처리변수
		int term=0;
		
		while(sum<=10) {
			term = number;
			sum=sum+term;
			number+=2;
			System.out.println(term+" "+number+" "+sum);
		}
		System.out.println(term+"  "+sum);
		
		
		//
	}

}
