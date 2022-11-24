package day3.sort;

class A implements  MyComparator{

	@Override
	public int compareTo(Object o1, Object o2) {
		 
		Student so1 = (Student) o1;
		Student so2 = (Student) o2;
		return  so1.eng - so2.eng ;  // 내가크면 양수  , 내가작으면 음수 
	} 
}



public class StudentMain2 {

	public static void main(String[] args) {		 
		
		Student s = new Student(100,100,"원재호");		
		System.out.println( s);	
		
		
		Student[] students = new Student[3];		
		
		students[0] =  new Student(100,99,"원재호");	
		students[1] =  new Student(82,97,"김길동");	
		students[2] =  new Student(89,100,"홍길동");	
		
 
		MyArrays.sort(students,  new A()  );     // 1. 인터페이스를 구현한 객처를 넣어주세요 !!
		
		
		System.out.println("==> 정렬후 ");
		for(Student student : students) {
			System.out.println( student);
			
		} 
		
	}

}
