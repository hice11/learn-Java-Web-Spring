package model;

public class Store {

	String sale_fg;
	String sale_no;
	String sale_ymd;
	String goods_nm;
	int sale_cnt;
	int sales;
	String pay_type;
	
	public Store() {
		// TODO Auto-generated constructor stub
	}

	public Store(String sale_fg, String sale_no, String sale_ymd, String goods_nm, int sale_cnt, int sales,
			String pay_type) {
		super();
		this.sale_fg = sale_fg;
		this.sale_no = sale_no;
		this.sale_ymd = sale_ymd;
		this.goods_nm = goods_nm;
		this.sale_cnt = sale_cnt;
		this.sales = sales;
		this.pay_type = pay_type;
	}

	public String getSale_fg() {
		return sale_fg;
	}

	public String getSale_no() {
		return sale_no;
	}

	public String getSale_ymd() {
		return sale_ymd;
	}

	public String getGoods_nm() {
		return goods_nm;
	}

	public int getSale_cnt() {
		return sale_cnt;
	}

	public int getSales() {
		return sales;
	}

	public String getPay_type() {
		return pay_type;
	}

	@Override
	public String toString() {
		return "Store [sale_fg=" + sale_fg + ", sale_no=" + sale_no + ", sale_ymd=" + sale_ymd + ", goods_nm="
				+ goods_nm + ", sale_cnt=" + sale_cnt + ", sales=" + sales + ", pay_type=" + pay_type + "]";
	}
	
	
	
}
