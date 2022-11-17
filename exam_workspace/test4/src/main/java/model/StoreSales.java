package model;

public class StoreSales {
	
	String store_nm;
	String store_cd;
	String cash_sales;
	String card_sales;
	String tot_sales;
	
	public StoreSales() {
		// TODO Auto-generated constructor stub
	}
	
	public StoreSales(String store_nm, String store_cd, String cash_sales, String card_sales, String tot_sales) {
		super();
		this.store_nm = store_nm;
		this.store_cd = store_cd;
		this.cash_sales = cash_sales;
		this.card_sales = card_sales;
		this.tot_sales = tot_sales;
	}



	public String getStore_nm() {
		return store_nm;
	}

	public String getStore_cd() {
		return store_cd;
	}

	public String getCash_sales() {
		return cash_sales;
	}

	public String getCard_sales() {
		return card_sales;
	}

	public String getTot_sales() {
		return tot_sales;
	}

	@Override
	public String toString() {
		return "StoreSales [store_nm=" + store_nm + ", store_cd=" + store_cd + ", cash_sales=" + cash_sales
				+ ", card_sales=" + card_sales + ", tot_sales=" + tot_sales + "]";
	}

	
	
	

}
