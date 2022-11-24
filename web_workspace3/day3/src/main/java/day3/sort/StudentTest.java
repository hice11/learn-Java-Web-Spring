package day3.sort;

public class StudentTest {

	public static void main(String[] args) {
		
		Student s = new Student(100,100,"가나다");
		System.out.println(s);
		
		Student[] students = new Student[3];
		
		students[0] = new Student(100,99,"가학생");
		students[1] = new Student(82,98,"나학생");
		students[2] = new Student(89,100,"다학생");
		
		//정렬하기
		for (int i = 0; i < students.length; i++) {
			for (int j = i+1; j < students.length; j++) {
				if (students[i].kor>students[j].kor) {
					Student tmp = students[i];
					students[i]= students[j];
					students[j]= tmp;
				}
			}
		}
		
		
	}

}
