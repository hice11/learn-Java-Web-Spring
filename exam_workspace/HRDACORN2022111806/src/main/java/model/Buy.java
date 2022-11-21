package model;

public class Buy {

	String userid;
	String prodname;
	String groupname;
	String price;
	String amount;
	
	public Buy() {
		// TODO Auto-generated constructor stub
	}

	public Buy(String userid, String prodname, String groupname, String price, String amount) {
		super();
		this.userid = userid;
		this.prodname = prodname;
		this.groupname = groupname;
		this.price = price;
		this.amount = amount;
	}

	public String getUserid() {
		return userid;
	}

	public String getProdname() {
		return prodname;
	}

	public String getGroupname() {
		return groupname;
	}

	public String getPrice() {
		return price;
	}

	public String getAmount() {
		return amount;
	}

	@Override
	public String toString() {
		return "Buy [userid=" + userid + ", prodname=" + prodname + ", groupname=" + groupname + ", price=" + price
				+ ", amount=" + amount + "]";
	}
	
	
	
}
