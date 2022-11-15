package prjDay3;

public class User {

	String id;
	String name;
	String addr;
	
	public User() {	}
	public User(String id, String name, String addr) {
		super();
		this.id = id;
		this.name = name;
		this.addr = addr;
	}

	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAddr() {
		return addr;
	}
	
	@Override
	public String toString() {
		return "User [id:" + id + " name:" + name + " addr:" + addr + "]";
	}
	
	
	
}
