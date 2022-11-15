package week04.day2.objectEx;

public class Ex04 {

	public static void main(String[] args) {

		String str="i like java";
		
		char result = str.charAt(0);
		System.out.println(str.charAt(3));
		
		
		
		//힙메모리에 생성
		String str2 = new String("java");
		String str3 = new String("java");
		
		//주소비교
		if(str2 == str3)    // 주소가 다르다
			System.out.println("주소가 같다");
		else System.out.println("주소가 다르다");
		//문자열비교
		if(str2.equals(str3)) {    // 내용이 같다
			System.out.println("내용이 같다");
		}
		
		//상수영역 저장, 같은것을 공유함
		String str4 = "java";
		String str5 = "java";
		
		if(str4 == str5)    // 주소가 같다
			System.out.println("주소가 같다");
		else System.out.println("주소가 다르다");
		
		
		
		
	////	
	}

}
