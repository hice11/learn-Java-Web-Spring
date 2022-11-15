package week01.day4;

public class Ex01 {

	public static void main(String[] args) {

		// 변수 (기억장소 : 메모리블럭) 
		// 공간 : 주소 + 크기
		// 자료형 (변수의 타입을 결정) : 크기 + (저장,해석)
		// 변수선언시 변수타입 변수명
		// 변수명은 최대한 의미있게 부여함, 가독성
		int a;
		a = 10;
		
		/*
		변수의 종류
		1. 기본형변수 : 값자체를 저장합니다. (데이터)
		2. 참조형변수 : 주소를 저장합니다.
		*/
		
		/*
		논리형 : true, false  참 거짓
		숫자형 : 정수, 실수		3, 5, 12.5
		문자 : 'a' , '한'		한 문자
		 */

		
		// byte(1byte), short(2byte), int(4byte 21억), long: 8byte
		// float(4byte), double(8byte 기본)
		int su1 = 10;
		double su2 = 128.56;
		
		// char(2byte)
		char ch='a';
		char ch2='한';
		
		// String s = "hello java";
		// s는 참조형 변수
		
		// false (1byte)
		boolean sw = true;
	}

}
