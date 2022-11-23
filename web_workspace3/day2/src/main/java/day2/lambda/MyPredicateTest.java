package day2.lambda;

import java.util.function.Predicate;

@FunctionalInterface
interface MyPredicate<T>{
	Boolean test(T t);
}

public class MyPredicateTest {
	
	public static void main(String[] args) {
		
		Predicate<Integer> obj = ran -> ran >= 5 ;
		int ran = (int)( Math.random()*9);
		boolean result = obj.test(ran);
		
		System.out.println(ran);
		System.out.println("Predicate: "+result);
		
		//1. 지역 클래스
		class MyPredicateImp implements MyPredicate<Integer> {
			@Override
			public Boolean test(Integer t) {
				return t>=5;
			}
		}//
		MyPredicateImp imp = new MyPredicateImp();
		System.out.println("1.지역클래스: "+imp.test(ran));
		
		//2. 익명 클래스
		MyPredicate<Integer> obj2 = new MyPredicate<>() {
			@Override
			public Boolean test(Integer t) {
				return t>=5;
			}
		};
		System.out.println("2.익명클래스: "+obj2.test(ran));
		
		//3. 람다식
		MyPredicate<Integer> obj3 = t -> t>=5;
		System.out.println("3.람다식: "+obj3.test(ran));
		
		
		
	}

}
