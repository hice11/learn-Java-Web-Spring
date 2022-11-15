package model;

public class Goods {
	
	String goods_code;
	String goods_name;
	String kind;
	String goods_price;
	
	public Goods() {}

	public Goods(String goods_code, String goods_name, String kind, String goods_price) {
		super();
		this.goods_code = goods_code;
		this.goods_name = goods_name;
		this.kind = kind;
		this.goods_price = goods_price;
	}

	public String getGoods_code() {
		return goods_code;
	}

	public String getGoods_name() {
		return goods_name;
	}

	public String getKind() {
		return kind;
	}

	public String getGoods_price() {
		return goods_price;
	}

	@Override
	public String toString() {
		return "Goods [goods_code=" + goods_code + ", goods_name=" + goods_name + ", kind=" + kind + ", goods_price="
				+ goods_price + "]";
	}
	
	
	
	
}
