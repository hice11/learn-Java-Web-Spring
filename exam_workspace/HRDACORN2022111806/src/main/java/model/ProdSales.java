package model;

public class ProdSales {
	
	String prodname;
	String groupname;
	String totSales;
	String rank;
	public ProdSales() {
		// TODO Auto-generated constructor stub
	}
	public ProdSales(String prodname, String groupname, String totSales, String rank) {
		super();
		this.prodname = prodname;
		this.groupname = groupname;
		this.totSales = totSales;
		this.rank = rank;
	}
	public String getProdname() {
		return prodname;
	}
	public String getGroupname() {
		return groupname;
	}
	public String getTotSales() {
		return totSales;
	}
	public String getRank() {
		return rank;
	}
	@Override
	public String toString() {
		return "ProdSales [prodname=" + prodname + ", groupname=" + groupname + ", totSales=" + totSales + ", rank="
				+ rank + "]";
	}
	

}
