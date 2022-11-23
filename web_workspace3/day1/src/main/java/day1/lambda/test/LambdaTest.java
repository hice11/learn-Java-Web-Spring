package day1.lambda.test;

@FunctionalInterface
interface FactorialInterface {
	
	int factorial(int n);
	
}

public class LambdaTest {

	public static void main(String[] args) {
		
		//1.
		class FactoImp implements FactorialInterface{

			@Override
			public int factorial(int n) {
				int fac = 1;
				for(int i=1; i<=n; i++) {
					fac *= i ;
				}
				return fac;
			}
			
		}
		FactoImp imp = new FactoImp();
		int result1 = imp.factorial(4);
		
		//2. 익명클래스
		FactorialInterface imp2 = new FactorialInterface() {

			@Override
			public int factorial(int n) {
				int fac = 1;
				for(int i=1; i<=n; i++) {
					fac *= i ;
				}
				return fac;	
			}};
		
		int result2 = imp2.factorial(5);
		
		//3. 람다식
		FactorialInterface imp3 = n -> {
			int fac = 1;
			for(int i=1; i<=n; i++) {
				fac *= i ;
			}
			return fac;	
		};
		int result3 = imp3.factorial(6);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		

	}

}
