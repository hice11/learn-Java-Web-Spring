package week04.day2.objectEx;

public class Ex05 {

	public static void main(String[] args) {

		//String은 불변, 완벽하게 캡슐화
		String str = "I like java";
		String str1 = new String("i like java");
		
		String result = str.concat("hello");
		System.out.println(result);
		
		//수정 가능함
		StringBuffer s = new StringBuffer("hello");
		s.setCharAt(0, 'k');
		s.append("java");
		System.out.println(s);
		
	}

}
