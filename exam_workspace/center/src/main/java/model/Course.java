package model;

public class Course {

	String co_code;
	String co_name;
	String br_code;
	String inst_code;
	String price;
	String start_date;
	String end_date;
	
	public Course() {
		// TODO Auto-generated constructor stub
	}
	

	public Course(String co_code, String co_name, String br_code, String inst_code, String price, String start_date,
			String end_date) {
		super();
		this.co_code = co_code;
		this.co_name = co_name;
		this.br_code = br_code;
		this.inst_code = inst_code;
		this.price = price;
		this.start_date = start_date;
		this.end_date = end_date;
	}


	public String getCo_code() {
		return co_code;
	}

	public String getCo_name() {
		return co_name;
	}

	public String getBr_code() {
		return br_code;
	}

	public String getInst_code() {
		return inst_code;
	}

	public String getPrice() {
		return price;
	}

	public String getStart_date() {
		return start_date;
	}

	public String getEnd_date() {
		return end_date;
	}

	@Override
	public String toString() {
		return "Course [co_code=" + co_code + ", co_name=" + co_name + ", br_code=" + br_code + ", inst_code="
				+ inst_code + ", price=" + price + ", start_date=" + start_date + ", end_date=" + end_date + "]";
	}
	

	
	
	
}
