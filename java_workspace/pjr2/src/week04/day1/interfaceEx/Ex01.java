package week04.day1.interfaceEx;

public class Ex01 {

	public static void main(String[] args) {
		
		Calculator calculator=null;
		
		calculator = new ChCalculatorImp();
		int result = calculator.add(5, 3);
		System.out.println(" > "+result);
		
		//바꿔도 정해진 약속이 같아서 변화없음
		calculator = new GyCalculatorImp();
		
		//프로그램 이용
		Program program = new Program();
		program.setCalculator(new ChCalculatorImp());
		program.run();

	}

}
