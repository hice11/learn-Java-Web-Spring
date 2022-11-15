package week03.day2;

//클래스 : 객체를 만들기 위한 설계도, 틀
//객체지향프로그래밍 : 객체를 기반으로 하는 프로그래밍 방식
// 객체는 클래스를 이용해서 만들어짐
// 클래스 type으로 new에 의해 메모리에 생성된 상태 -> 객체, 인스턴스

public class Score2 {
	
	//멤버변수, 인스턴스변수, iv
	String name;
	int kor;
	int eng;
	int total;
	
	//멤버메소드 : 멤버변수를 다루는 기능
	public void printInfo2() {
		
		System.out.println(name);
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(total);

		//int temp; // 지역변수, lv
	}
	
}
