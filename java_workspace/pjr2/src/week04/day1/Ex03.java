package week04.day1;

public class Ex03 {

	public static void main(String[] args) {

		Score score = new Score("홍길동",100,90);
		String result = score.getInfo();
		System.out.println(result);
		
		Object o = score;
		
		Customer customer = new Customer("victo", "0000", "홍길동");
		String result2 = customer.getInfo();
		System.out.println(result2);
		
		Object o2 = customer;
		
		System.out.println(o.toString());
		System.out.println(o2.toString());
		//toString() 생략가능
		//오버라이딩한 정보가 나온다
		System.out.println(o);
		System.out.println(o2);
		
		System.out.println(score);
		System.out.println(customer);
		
		String test = "I like java";
		
		System.out.println(test.toString());
		System.out.println(test);
		
		
	//	
	}

}
