package day2.lambda;

import java.util.function.Consumer;

@FunctionalInterface
interface MyConsumer<T> {
	void accept(T str);
}

public class MyConsumerTest {
	public static void main(String[] args) {
		
		//1. 지역 내부 클래스, 대부분 익명으로 사용
		class MyConsumerImp implements MyConsumer<Integer>{
			@Override
			public void accept(Integer str) {
				System.out.println(str * str);
			}
		}//
		MyConsumerImp o1 = new MyConsumerImp();
		o1.accept(7);
		
		//2. 익명클래스
		MyConsumer<Integer> o2 = new MyConsumer<>() {
			@Override
			public void accept(Integer str) {
				System.out.println(str * str);
			}
		}; 
		o2.accept(7);
		
		//3. 람다식
		MyConsumer<Integer> o3 = su -> System.out.println(su * su);
		o3.accept(7);
		
		//자바가 제공하는 함수 인터페이스 사용
		Consumer<Integer> consumer = num -> System.out.println(num*10);
		Consumer<String> consumer2 = str -> System.out.println(str+" hi");
		
		consumer.accept(10000);
		consumer2.accept("aa님");
		
	}////

}
