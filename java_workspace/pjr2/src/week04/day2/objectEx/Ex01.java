package week04.day2.objectEx;

public class Ex01 {

	public static void main(String[] args) {

		
		String str="java";
		
		System.out.println(str);
		System.out.println(str.toString());
		
		
		Customer customer = new Customer("k100","1234");
		String result = customer.toString();
		System.out.println(result);
		
		//toString() 메서드는 생략가능
		System.out.println(customer);
		System.out.println(customer.getInfo());
	////	
	}

}
