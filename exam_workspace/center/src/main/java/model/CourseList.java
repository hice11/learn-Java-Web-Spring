package model;

public class CourseList {
	
	String co_code;
	String co_name;
	String inst_name;
	String price;
	String date;
	
	public CourseList() {
		// TODO Auto-generated constructor stub
	}
	public CourseList(String co_code, String co_name, String inst_name, String price, String date) {
		super();
		this.co_code = co_code;
		this.co_name = co_name;
		this.inst_name = inst_name;
		this.price = price;
		this.date = date;
	}
	public String getCo_code() {
		return co_code;
	}
	public String getCo_name() {
		return co_name;
	}
	public String getInst_name() {
		return inst_name;
	}
	public String getPrice() {
		return price;
	}
	public String getDate() {
		return date;
	}
	@Override
	public String toString() {
		return "CourseList [co_code=" + co_code + ", co_name=" + co_name + ", inst_name=" + inst_name + ", price="
				+ price + ", date=" + date + "]";
	}
	
	
	
	

}
