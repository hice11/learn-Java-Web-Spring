package week04.day4.sortAndComparator;

public class MyComparatorImp implements MyComparator{

	@Override
	public int compare(Object o1, Object o2) {
		
		Customer c1= (Customer)o1;
		Customer c2= (Customer)o2;
				
		return c1.age - c2.age;
	}
	
}
