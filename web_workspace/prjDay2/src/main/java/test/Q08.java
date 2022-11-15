package test;

public class Q08 {

	public static void main(String[] args) {
		//문제8) 위의  Book클래스를 사용하여  책정보 3개를 생성하고 출력하는 프로그램을 작성하시오  (10점)
		//[  책정보 ] 
		//“BA1001” , “Front길잡이” , “김작가”
		//“BC1002”,  “JAVA길잡이” , “이작가”
		//“BD1003” ,  “서블릿길잡이” , “박작가”
		
		Book book1 = new Book(1001 , "Front길잡이" , "김작가");
		Book book2 = new Book(1002 , "JAVA길잡이" , "이작가");
		Book book3 = new Book(1003 , "서블릿길잡이" , "박작가");

		System.out.println(book1);
		System.out.println(book2);
		System.out.println(book3);
		
	}

}
