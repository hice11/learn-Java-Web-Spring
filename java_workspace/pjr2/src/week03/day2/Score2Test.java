package week03.day2;

public class Score2Test {

	public static void main(String[] args) {

		//int a;
		
		Score2 s = new Score2();
		
		s.name="홍길동";
		s.kor=90;
		s.eng=80;
		s.total=s.kor+s.eng;
		
		s.printInfo2(); // printInfo2(s)
		
	}

}
