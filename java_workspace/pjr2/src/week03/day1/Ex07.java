package week03.day1;

public class Ex07 {

	public static void main(String[] args) {
		// 한 학생성적 정보
		// -> 사용자정의 자료형 필요함, 구조적인 데이터, class
		
		
		//자바는 배열부터는 동적메모리 사용하도록 강제함
		//new 사용해야함
		// s는 참조형 변수
		Score s = new Score();
		
		s.name = "홍길동";
		s.kor = 90;
		s.eng = 90;
		s.total = s.kor + s.eng;
		s.avg = s.total/2.0;
		
		print(s);
				
	////	
	}

	public static void print(Score a) {
		System.out.println(a.name);
		System.out.println(a.kor);
		System.out.println(a.eng);
		System.out.println(a.total);
		System.out.println(a.avg);
	}
	

	
	
}
