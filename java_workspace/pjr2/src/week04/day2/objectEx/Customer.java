package week04.day2.objectEx;

public class Customer {

	
	String id;
	String pw;
	
	public Customer() {	}
	public Customer(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	
	public String getInfo() {
		return id+" "+pw;
	}
	
	@Override
	public String toString() {
		return id+" "+pw;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Customer) {
			Customer c = (Customer)obj;  //다운캐스팅
			if(this.id.equals(c.id) && this.pw.equals(c.pw)) {
				return true;
			}else
				return false;
		}
		return false;
	}
	
}
