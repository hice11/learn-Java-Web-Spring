package week04.day2;

public class PersonTest {

	public static void main(String[] args) {

		// upcasting
		Student student = new Student();
		Person person = (Person)student;  //업캐스팅
		
		
		// downcasting
		((Student)person).시험을본다();
		
		
		Object object = new Teacher(); //업캐스팅
		// 다운캐스팅 해야 Teacher의 메서도 사용할수 있다
		((Teacher)object).평가한다(); //다운캐스팅
		
		
		
		
	////	
	}

}
