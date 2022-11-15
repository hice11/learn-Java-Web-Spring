package week04.day4.sortAndComparator;

public class Test {

	public static void main(String[] args) {

		Customer[] customers = new Customer[3];
		customers[0] = new Customer("가나",26);
		customers[1] = new Customer("다나",21);
		customers[2] = new Customer("나나",23);
		
		MyArrays.sort(customers);
		
		for(Customer c : customers) {
			System.out.println(c);
		}
		System.out.println("==========================");
		MyArrays.sort(customers, new MyComparatorImp());
		
		for(Customer c : customers) {
			System.out.println(c);
		}
		
		//익명 클래스를 이용해서 객체를 생성, 익명 객체
		MyArrays.sort(customers, new MyComparator() {
			
			@Override
			public int compare(Object o1, Object o2) {
				Customer c1 = (Customer)o1;
				Customer c2 = (Customer)o2;
				return c1.name.compareTo(c2.name);
			}
		});
		
		for (Customer customer : customers) {
			System.out.println(customer);
		}
		
		
	}

}
