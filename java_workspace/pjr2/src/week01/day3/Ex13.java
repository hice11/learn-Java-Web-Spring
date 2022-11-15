package week01.day3;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//매운맛 문제 6번 내가푼
		
		//출력자료
		double sum=0;
		
		//처리자료
		int SW=1; //반복제어변수
		int n=1; //분모
		double f=0; //분수항
		
		for(int i=1; i<=10; i++) {
			n = n*i;
			f = i/(float)n;
			sum = sum + (f*SW);
			System.out.println(i*SW);
			SW=-SW;
		}
		System.out.println(sum);

	}

}
