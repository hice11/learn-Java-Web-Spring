package model;

public class Branch {
	
	String br_code;
	String br_name;
	String br_region;
	String br_tel;
	
	public Branch() {
		// TODO Auto-generated constructor stub
	}

	public Branch(String br_code, String br_name, String br_region, String br_tel) {
		super();
		this.br_code = br_code;
		this.br_name = br_name;
		this.br_region = br_region;
		this.br_tel = br_tel;
	}

	public String getBr_code() {
		return br_code;
	}

	public String getBr_name() {
		return br_name;
	}

	public String getBr_region() {
		return br_region;
	}

	public String getBr_tel() {
		return br_tel;
	}

	@Override
	public String toString() {
		return "Branch [br_code=" + br_code + ", br_name=" + br_name + ", br_region=" + br_region + ", br_tel=" + br_tel
				+ "]";
	}
	

}
