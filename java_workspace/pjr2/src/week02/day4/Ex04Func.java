package week02.day4;

public class Ex04Func {

	public static void main(String[] args) {

		// 문자열 배열을 받음
		String[] result = method7();
		System.out.println(result[0]);
		System.out.println(result[1]);
		System.out.println(result[2]);
		
		method1();
		int result2= method2();
		System.out.println(result2);
		
		double result3 = method3();
		System.out.println(result3);
		
		boolean result4 = isAdult(20);
		System.out.println(result4);
		
		String result5 = method4();
		System.out.println(result5);
		
		char result6 = method5();
		System.out.println(result6);
		
		int[] result7 = method6();
		for (int i = 0; i < result7.length; i++) {
			System.out.println(result7[i]);
		}
		
	////
	}
	
	public static void method1 () {
		
		System.out.println("특정기능을 수행합니다");
		
	//	
	}
	
	public static int method2() {
		// int형의 값을 반환하는 메서드
		return 5;		
	//	
	}
	
	public static double method3() {
		// double형의 값을 반환하는 메서드
		return 35.12;
	//	
	}
	
	public static String method4() {
		// 문자열 값을 반환하는 메서드
		return "hello";
	//	
	}
	
	public static char method5() {
		// 문자 값을 반환하는 메서드
		return 'a';
	//	
	}
	
	public static int[] method6() {
		int[] arr = {1,2,3,4,5};
		return arr;
	//	
	}
	
	public static String[] method7() {
		String[] arr = {"one","two","three"};
		return arr;
	//	
	}
	
	public static boolean isAdult(int age) {
		boolean result;
		
		if(age>19) result=true;
		else 	   result=false;
		
		return result;
	//	
	}
	
		
}
