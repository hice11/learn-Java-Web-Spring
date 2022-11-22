package day1.lambda;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. 클래스 작성, 이름이 있는 클래스
		class MyinterfaceImp implements MyInterface{

			@Override
			public void method() {
				System.out.println("기능을 구현합니다");
			}			
		}//
		
		MyinterfaceImp imp = new MyinterfaceImp();
		imp.method();

		//2. 익명클래스
		MyInterface imp2 = new MyInterface() {
			@Override
			public void method() {
				System.out.println("기능을 구현합니다");
			}
		};
		
		imp2.method();
		
		//3. 람다식
		//구현할 메서드가 한개인 인터페이스 : functional interface
		MyInterface imp3 = () -> System.out.println("기능");
		imp3.method();
		
		
	}////

}
