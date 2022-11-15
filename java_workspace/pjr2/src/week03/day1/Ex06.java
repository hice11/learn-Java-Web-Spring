package week03.day1;

public class Ex06 {

	public static void main(String[] args) {
		// 한 학생성적 정보
		// -> 사용자정의 자료형 필요함, 구조적인 데이터, class
		
		String name;
		int kor;
		int eng;
		int total;
		double avg;
		
		name="홍길동";
		kor=90;
		eng=90;
		total=kor+eng;
		avg=total/2.0;
		
		print(name,kor,eng,total,avg);
		
		
	////	
	}

	private static void print(String n,int k,int e, int total, double avg) {
		System.out.println(n);
		System.out.println(k);
		System.out.println(e);
		System.out.println(total);
		System.out.println(avg);
	}
	

	
	
}
