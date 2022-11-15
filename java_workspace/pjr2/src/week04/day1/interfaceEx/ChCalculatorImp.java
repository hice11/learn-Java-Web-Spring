package week04.day1.interfaceEx;

public class ChCalculatorImp implements Calculator{

	@Override
	public int add(int su1, int su2) {
		// TODO Auto-generated method stub
		System.out.println("[Ch더하기]");
		return su1+su2;
	}

	@Override
	public int sub(int su1, int su2) {
		// TODO Auto-generated method stub
		System.out.println("[Ch빼기]");
		return su1-su2;
	}

	@Override
	public int divide(int su1, int su2) {
		// TODO Auto-generated method stub
		System.out.println("[Ch나누기]");
		return su1/su2;
	}

	@Override
	public int multyply(int su1, int su2) {
		// TODO Auto-generated method stub
		System.out.println("[Ch곱하기]");
		return su1*su2;
	}

	
	
	
	
}
