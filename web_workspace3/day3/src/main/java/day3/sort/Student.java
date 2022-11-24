package day3.sort;

public class Student {

	int kor;
	int eng;
	String name;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int kor, int eng, String name) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [kor=" + kor + ", eng=" + eng + ", name=" + name + "]";
	} 

}

