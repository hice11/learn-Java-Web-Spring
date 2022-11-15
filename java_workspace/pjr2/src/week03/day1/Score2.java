package week03.day1;


// 사용자정의 자료형
// 데이터+함수 결합된 형태 -> 캡슐화
public class Score2 {

	String name;	//멤버변수
	int kor;
	int eng;
	int total;
	double avg;
	
	
	//멤버메소드
	public void input() {
		name = "홍길동";
		kor = 90;
		eng = 90;
	}

	public void calc() {
		total = kor + eng;
		avg = total/2.0;
	}

	public void print() {
		System.out.println(name);
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(total);
		System.out.println(avg);
	}
	
	
	
}
