package week03.day5.상속;

public class Test {

	public static void main(String[] args) {

		Person person = new Person();
		Student student = new Student();
		StudentWorker studentWorker = new StudentWorker();
		Researcher researcher = new Researcher();
		Professor professor = new Professor();
		
		person.말하기();
		person.먹기();
		person.걷기();
		person.잠자기();
		
		student.말하기();
		student.먹기();
		student.걷기();
		student.잠자기();
		student.공부하기();
		
		studentWorker.말하기();
		studentWorker.먹기();
		studentWorker.걷기();
		studentWorker.잠자기();
		studentWorker.공부하기();
		studentWorker.일하기();
		
		researcher.말하기();
		researcher.먹기();
		researcher.걷기();
		researcher.잠자기();
		researcher.연구하기();
		
		professor.말하기();
		professor.먹기();
		professor.걷기();
		professor.잠자기();
		professor.연구하기();
		professor.가르치기();
		
		
	}

}
