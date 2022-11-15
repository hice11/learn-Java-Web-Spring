package week04.day4.sortAndComparator;

public class Customer implements MyComparable{

	String name;
	int age;
	
	public Customer() {	}
	public Customer(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Customer [name:" + name + " age:" + age + "]";
	}
	
	@Override
	public int compareTo(Object o) {
		if(o instanceof Customer) {
			Customer c = (Customer)o;
			return this.name.compareTo(c.name);
		}
		return 0;
	}
		
	
	
	
}
