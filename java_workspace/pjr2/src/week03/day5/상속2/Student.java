package week03.day5.상속2;

public class Student extends Person{

	int classNo; //반
	
	public Student(String name, String id, int classNo) {
		//부모의 생성자 호출, 부모의 기본생성자 호출
		super(name,id); //명시적으로 부모의 매개변수있는 생성자 호출
		this.classNo=classNo;
	}
	
	public void printInfo() {
		System.out.println(name); //바로 접근가능함 부모의 멤버가 protected
		System.out.println(id);
		System.out.println(classNo);
	}
	
	public static void main(String[] args) {
		Student student = new Student("홍길동", "000121" ,1);
		student.printInfo();
		
		Person p;
		//상속 관계이면 클래스 타입이 달라도 참조 가능
		//-> 업캐스팅 : 부모형 참조변수에 저장할수 있다
		p=student;
	}
	
	
}
