package day2.lambda;

import java.util.function.Function;

@FunctionalInterface
interface MyFunction<T,R>{
	R apply(T t);
}

public class MyFunctionTest {
	
	public static void main(String[] args) {
		
		Function<Integer, Integer> obj = su -> su*su;
		System.out.println(obj.apply(3));
		
		//1. 지역 내부 클래스
		class MyFunctionImp implements MyFunction<Integer,String> {
			@Override
			public String apply(Integer t) {
				return "커피 "+t+"잔";
			}
		}
		MyFunctionImp imp = new MyFunctionImp();
		System.out.println(imp.apply(3));
		
		//2. 익명 클래스
		MyFunction<Integer,String> obj2 = new MyFunction<>() {
			@Override
			public String apply(Integer t) {
				return "커피 "+t+"잔";
			}
		};
		System.out.println(obj2.apply(3));
		
		//3. 람다식
		MyFunction<Integer,String> obj3 = num -> "커피 "+num+"잔" ;
		System.out.println(obj3.apply(3));
		
	}

}
