package week04.day2;

public class Teacher extends Person{

	public void 평가한다() {
		System.out.println("평가한다");
	}
	
	@Override
	public void 일한다() {
		System.out.println("가르친다");
	}
	
}
