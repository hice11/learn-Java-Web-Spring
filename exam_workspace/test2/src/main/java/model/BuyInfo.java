package model;

public class BuyInfo {
	
	String userid;
	String prodname;
	String groupname;
	int price;
	int amount;
	
	public BuyInfo() {
		// TODO Auto-generated constructor stub
	}

	public BuyInfo(String userid, String prodname, String groupname, int price, int amount) {
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

	public int getPrice() {
		return price;
	}

	public int getAmount() {
		return amount;
	}

	@Override
	public String toString() {
		return "BuyInfo [userid=" + userid + ", prodname=" + prodname + ", groupname=" + groupname + ", price=" + price
				+ ", amount=" + amount + "]";
	}
	

	
	
	
	
}
