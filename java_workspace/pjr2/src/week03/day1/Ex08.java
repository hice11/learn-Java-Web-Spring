package week03.day1;

public class Ex08 {

	public static void main(String[] args) {
		
		
		Score s = new Score();
		
		input(s);	//성적입력
		calc(s);	//성적처리
		print(s);	//성적출력
				
	////	
	}

	public static void input(Score s) {
		s.name = "홍길동";
		s.kor = 90;
		s.eng = 90;
	}

	public static void calc(Score s) {
		s.total = s.kor + s.eng;
		s.avg = s.total/2.0;
	}

	public static void print(Score s) {
		System.out.println(s.name);
		System.out.println(s.kor);
		System.out.println(s.eng);
		System.out.println(s.total);
		System.out.println(s.avg);
	}
	

	
	
}
