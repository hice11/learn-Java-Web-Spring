package day1.lambda.test;

@FunctionalInterface
interface FactorialInterface {
	
	int factorial(int n);
	
}

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