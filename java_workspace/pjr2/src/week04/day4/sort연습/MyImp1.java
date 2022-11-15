package week04.day4.sort연습;

public class MyImp1 implements MyComparator{

	@Override
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Dessert && o2 instanceof Dessert) {
			Dessert d1 = (Dessert)o1;
			Dessert d2 = (Dessert)o2;
			return (d1.price-d2.price);
		}
		return 0;
	}
	
}
