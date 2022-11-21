package model;

public class TotalSales {

	String num;
	String userid;
	String name;
	String prodname;
	String groupname;
	String price;
	String amount;
	String sales;
	
	public TotalSales() {
		// TODO Auto-generated constructor stub
	}

	public TotalSales(String num, String userid, String name, String prodname, String groupname, String price,
			String amount, String sales) {
		super();
		this.num = num;
		this.userid = userid;
		this.name = name;
		this.prodname = prodname;
		this.groupname = groupname;
		this.price = price;
		this.amount = amount;
		this.sales = sales;
	}

	public String getNum() {
		return num;
	}

	public String getUserid() {
		return userid;
	}

	public String getName() {
		return name;
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

	public String getSales() {
		return sales;
	}

	@Override
	public String toString() {
		return "TotalSales [num=" + num + ", userid=" + userid + ", name=" + name + ", prodname=" + prodname
				+ ", groupname=" + groupname + ", price=" + price + ", amount=" + amount + ", sales=" + sales + "]";
	}
	
	
}
