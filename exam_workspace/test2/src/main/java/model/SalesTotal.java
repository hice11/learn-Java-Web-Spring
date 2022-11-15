package model;

public class SalesTotal {
	
	int num;
	String userid;
	String name;
	String prodname;
	String groupname;
	int price;
	int amount;
	int sales;
	
	public SalesTotal() {
		// TODO Auto-generated constructor stub
	}

	public SalesTotal(int num, String userid, String name, String prodname, String groupname, int price, int amount,
			int sales) {
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

	public int getNum() {
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

	public int getPrice() {
		return price;
	}

	public int getAmount() {
		return amount;
	}

	public int getSales() {
		return sales;
	}

	@Override
	public String toString() {
		return "SalesTotal [num=" + num + ", userid=" + userid + ", name=" + name + ", prodname=" + prodname
				+ ", groupname=" + groupname + ", price=" + price + ", amount=" + amount + ", sales=" + sales + "]";
	}
	
	

	
	
	

}
