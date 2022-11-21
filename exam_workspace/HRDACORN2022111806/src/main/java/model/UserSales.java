package model;

public class UserSales {

	String userid;
	String name;
	String addr;
	String birthday;
	String totSales;
	public UserSales() {
		// TODO Auto-generated constructor stub
	}
	public UserSales(String userid, String name, String addr, String birthday, String totSales) {
		super();
		this.userid = userid;
		this.name = name;
		this.addr = addr;
		this.birthday = birthday;
		this.totSales = totSales;
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
	public String getBirthday() {
		return birthday;
	}
	public String getTotSales() {
		return totSales;
	}
	@Override
	public String toString() {
		return "UserSales [userid=" + userid + ", name=" + name + ", addr=" + addr + ", birthday=" + birthday
				+ ", totSales=" + totSales + "]";
	}
	
	
}
