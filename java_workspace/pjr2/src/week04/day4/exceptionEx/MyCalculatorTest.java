package week04.day4.exceptionEx;

public class MyCalculatorTest {

	public static void main(String[] args) {
		
		MyCalculator m = new MyCalculator();
		int result=0;
		
		try {
			result = m.add(10,-3);
		} catch (MyException e) {
			System.err.println("둘 중에 음수가 있어요"); //
			//e.printStackTrace();
			System.out.println(e.getMessage()); //
		}
		
		System.out.println("======");
		
		try {
			result= m.add(10, 3);
		} catch (MyException e) {
			System.err.println(e.getMessage());
		}
		System.out.println(result); //
		
		System.out.println("======");
		
		double result2=0;
		result2 = m.divide(10, 3);
		System.out.println(result2);   // 
		System.out.println("======");
		
		try {
			result2 = m.divide(10, -3);
			//try의 문장에서 예외가 발생되면 다음 문장은 실행되지 않고 catch로 넘어간다
			System.out.println(result2);    
		} catch (MyException2 e) {
			System.err.println(e.getMessage());
		}
		
		System.out.println("======");
		System.out.println("정상종료");
		
		
		
		
	}
	
	
}
