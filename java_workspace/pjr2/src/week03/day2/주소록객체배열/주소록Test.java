package week03.day2.주소록객체배열;

public class 주소록Test {

	public static void main(String[] args) {

		주소록 s = new 주소록();
		
		s.input("aa","010-1111-5555","aa@gmail.com","9/20");
		s.input("bb","010-2222-6666","bb@gmail.com","8/20");
		s.input("cc","010-3333-7777","cc@gmail.com","10/20");
		//s.printInfo();
		
		
		주소록2 s2 = new 주소록2();
		
		s2.input("aa","010-1111-5555","aa@gmail.com","9/20");
		s2.input("bb","010-2222-6666","bb@gmail.com","8/20");
		s2.input("cc","010-3333-7777","cc@gmail.com","10/20");
		s2.input("dd","010-3333-7777","cc@gmail.com","10/20");
		s2.input("ee","010-3333-7777","cc@gmail.com","10/20");
		s2.printInfo();
		
		

	}

}
