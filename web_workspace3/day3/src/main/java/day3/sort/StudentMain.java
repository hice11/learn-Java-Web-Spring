package day3.sort;

public class StudentMain {

	public static void main(String[] args) {
		 
		
		Student s = new Student(100,100,"원재호");		
		System.out.println( s);
		
		
		
		Student[] students = new Student[3];
		
		
		students[0] =  new Student(100,99,"원재호");	
		students[1] =  new Student(82,97,"김길동");	
		students[2] =  new Student(89,100,"홍길동");	
		

		
		// 정렬하기 		
		for( int  i=0 ;  i< students.length-1 ; i++) {
			for( int j=i+1;  j< students.length; j++) {
				if(  students[i].kor > students[j].kor ) {   //  오름차순
					Student tmp  = students[i];
					students[i] = students[j];
					students[j] = tmp;
					
				}
			}
		}
		
		
		System.out.println("==> 정렬후 ");
		for(Student student : students) {
			System.out.println( student);
			
		}
		
		
		
				
		
	}

}
