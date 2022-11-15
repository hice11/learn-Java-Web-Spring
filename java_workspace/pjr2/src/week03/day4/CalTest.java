package week03.day4;

import com.acorn.ch.ChCalculator;

public class CalTest {

	public static void main(String[] args) {
		
		ChCalculator c = new ChCalculator();
		int result = c.addCh(5, 3);
		int result2 = c.subCh(11, 10);
		double result3 = c.divideCh(5, 3);
		
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		
	////	
	}
}
