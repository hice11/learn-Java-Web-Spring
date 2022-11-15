package week04.day4.sort연습;

public class Dessert implements MyComparable{

	String name;
	int price;
	int sales;
	
	public Dessert() {	}
	public Dessert(String name, int price, int sales) {
		this.name = name;
		this.price = price;
		this.sales = sales;
	}
	
	@Override
	public String toString() {
		return "Dessert [name:" + name + " price:" + price + " sales:" + sales + "]";
	}
	
	@Override
	public int compareTo(Object o) {
		if(o instanceof Dessert) {
			return this.name.compareTo(((Dessert)o).name);
		}
		return 0;
	}
	
}
