package prjDay7.test;

public class Q01 {

	public static void main(String[] args) {

		//문제1)  char 배열을 사용하여 “hello java”를 출력하는 프로그램을 작성하시오   (10점)
		//- char[]을 사용할 수 있다.
		//- char[]을 출력할 수 있다.
		
		printChar();
		
	}////
	
	public static void printChar() {
		String str = "hello java";
		char[] ch = str.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
	}//

}
