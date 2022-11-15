package week04.day2.objectEx;

public class ScoreTest {

	public static void main(String[] args) {

		Score s = new Score("홍길동",100,90);
		Score s2 = new Score("가길동",100,90);
		
		int eng = s.getEng();
		System.out.println(eng);
		
		s.setKor(50);
		System.out.println(s);
		
		//두 객체를 비교하기
		//equals 재정의해서 사용해보기
		boolean result = s.equals(s2);
		System.out.println(result);
		
		//toString 사용하기
		System.out.println(s.toString());
		
		
	}

}
