package model;

public class SalesProd {
	
	String prodname;
	String groupname;
	int sales;
	int rank;
	
	public SalesProd() {
		// TODO Auto-generated constructor stub
	}

	public SalesProd(String prodname, String groupname, int sales, int rank) {
		super();
		this.prodname = prodname;
		this.groupname = groupname;
		this.sales = sales;
		this.rank = rank;
	}

	public String getProdname() {
		return prodname;
	}

	public String getGroupname() {
		return groupname;
	}

	public int getSales() {
		return sales;
	}

	public int getRank() {
		return rank;
	}

	@Override
	public String toString() {
		return "SalesProd [prodname=" + prodname + ", groupname=" + groupname + ", sales=" + sales + ", rank=" + rank
				+ "]";
	}
	

}
