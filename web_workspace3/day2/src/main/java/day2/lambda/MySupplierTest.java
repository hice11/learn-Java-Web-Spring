package day2.lambda;

@FunctionalInterface
interface MySupplier<T>{
	T get();
}

public class MySupplierTest {
	public static void main(String[] args) {
		
		//1. 지역 내부 클래스
		class MySupplierImp implements MySupplier<Integer>{
			@Override
			public Integer get() {
				// TODO Auto-generated method stub
				return null;
			}
		}//
		MySupplierImp imp = new MySupplierImp();
		System.out.println(imp.get());
		
		//2. 익명클래스
		MySupplier<Integer> o1 = new MySupplier<>() {
			@Override
			public Integer get() {
				return 5;
			}
		};
		System.out.println(o1.get());
				
		
		//3. 람다식
		MySupplier<Integer> obj = () -> 5;
		MySupplier<Integer> obj2 = () -> (int)(Math.random()*100) ;
		MySupplier<String> obj3 = () -> "화이팅";
		
		System.out.println(obj.get());
		System.out.println(obj2.get());
		System.out.println(obj3.get());
		
	}
}
