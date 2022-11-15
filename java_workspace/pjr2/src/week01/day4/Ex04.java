package week01.day4;

public class Ex04 {

	public static void main(String[] args) {

		char ch='a'; // 'a' -> 숫자
		System.out.println(ch); // a
		System.out.println((int)ch); // 97
		
		char ch1='h';
		char ch2='e';
		char ch3='l';
		char ch4='l';
		char ch5='o';
		
		System.out.print(ch1);
		System.out.print(ch2);
		System.out.print(ch3);
		System.out.print(ch4);
		System.out.println(ch5);
		
		char[] msg =new char[5];
		// 기억장소크기 + 연속적 0 1 2 (offset) 사용가능
		msg[0]='h';
		msg[1]='e';
		msg[2]='l';
		msg[3]='l';
		msg[4]='o';
		
		for(int i=0; i<msg.length; i++) {
			System.out.print(msg[i]);
		}
		//
		
		
	}

}
