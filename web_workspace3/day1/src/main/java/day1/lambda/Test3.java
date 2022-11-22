package day1.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test3 {

	public static void main(String[] args) {
		
		ArrayList<Student> arrys = new ArrayList<>();
		arrys.add(new Student("가길동", "하남시"));
		arrys.add(new Student("나길동", "부산시"));
		arrys.add(new Student("다길동", "제주도"));
		
		//정렬
		// 1. 인터페이스를 구현한 클래스를 만들어서 (Student) 객체를 생성
		Collections.sort(arrys);
		
		// 2. 인터페이스를 익명으로 작성, 익명객체로 생성
		Collections.sort(arrys, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.address.compareTo(o2.address);
			}
		});
		// 3. 람다식 (익명함수), 익명객체의 메소드가 수행됨
		Collections.sort( arrys, (o1, o2) -> o1.address.compareTo(o2.address) );
		
	}////
	
}
