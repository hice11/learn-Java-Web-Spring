package week04.day1;

public class Customer {
	String id;
	String pw;
	String name;
	
	public Customer() {}
	public Customer(String id,String pw,String name) {
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
	
	public String getInfo() {
		return id+" "+pw+" "+name;
	}
	
	
	// 부모 Object의 오버라이드 
	@Override
	public String toString() {
		return id+" "+pw+" "+name;
	}
	
}
