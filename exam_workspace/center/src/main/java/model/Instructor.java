package model;

public class Instructor {
	
	String inst_code;
	String inst_name;
	String inst_email;
	String co_name;
	
	public Instructor() {
		// TODO Auto-generated constructor stub
	}

	public Instructor(String inst_code, String inst_name, String inst_email, String co_name) {
		super();
		this.inst_code = inst_code;
		this.inst_name = inst_name;
		this.inst_email = inst_email;
		this.co_name = co_name;
	}

	public String getInst_code() {
		return inst_code;
	}

	public String getInst_name() {
		return inst_name;
	}

	public String getInst_email() {
		return inst_email;
	}

	public String getCo_name() {
		return co_name;
	}

	@Override
	public String toString() {
		return "Instructor [inst_code=" + inst_code + ", inst_name=" + inst_name + ", inst_email=" + inst_email
				+ ", co_name=" + co_name + "]";
	}
	
	
	
	
}
