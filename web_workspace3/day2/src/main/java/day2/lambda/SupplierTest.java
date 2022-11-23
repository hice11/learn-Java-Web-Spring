package day2.lambda;

import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String[] args) {

		//supplier 공급 : 입력 없고 반환값이 있는 메서드
		Supplier<Integer> obj = () -> 5;
		int result = obj.get();
		System.out.println(result);
		
		Supplier<String> obj2 = () -> {
			String str = "acorn";
			return str;
		};
		System.out.println(obj2.get());
		
		Supplier<String> obj3 = () -> "acorn2";
		System.out.println(obj3.get());
		
		Supplier<Integer> random = () -> (int)(Math.random()*100);
		System.out.println(random.get());
		
	}

}
