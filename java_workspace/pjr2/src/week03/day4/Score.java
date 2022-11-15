package week03.day4;

public class Score {
	// static
	
	//static 변수를 쓰는 이유
	//클래스에서 공통으로 사용하는 변수가 필요할때
	
	//static 메서드
	//인스턴스변수(일반적인 멤버변수)를 다루는 메서드가 아니라면 static 고려함
	//static 멤버변수를 다루는 메서드를 만들 때 사용
	
	//인스턴스 멤버변수
	String name;
	int kor;
	int eng;
	int total;
	
	
	//클래스변수, 클래스내에서 전역변수
	static String teacher;
	
	//생성자
	public Score() {
		
	}
	public Score(String name,int kor,int eng) {
		this.name = name;
		this.kor= kor;
		this.eng= eng;
	}
	
	//매서드, 내부적으로 this가 전달됨
	public void printInfo() {
		System.out.println(name+" "+kor+" "+eng+" "+total);
	}
	
	//this 전달 안함, 과거버전 함수랑 비슷함
	//static은 멤버 데이터를 사용하지 않을때 씀
	public static void printTitle() {
		System.out.println("  < 성적표 >");
		//System.out.println(name);
	}
	
}
