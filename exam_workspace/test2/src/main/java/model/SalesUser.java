package model;

public class SalesUser {
	
	String userid;
	String name;
	String addr;
	int birthday;
	int sales;
	
	public SalesUser() {
		// TODO Auto-generated constructor stub
	}

	public SalesUser(String userid, String name, String addr, int birthday, int sales) {
		super();
		this.userid = userid;
		this.name = name;
		this.addr = addr;
		this.birthday = birthday;
		this.sales = sales;
	}

	public String getUserid() {
		return userid;
	}

	public String getName() {
		return name;
	}

	public String getAddr() {
		return addr;
	}

	public int getBirthday() {
		return birthday;
	}

	public int getSales() {
		return sales;
	}

	@Override
	public String toString() {
		return "SalesUser [userid=" + userid + ", name=" + name + ", addr=" + addr + ", birthday=" + birthday
				+ ", sales=" + sales + "]";
	}
	

}
