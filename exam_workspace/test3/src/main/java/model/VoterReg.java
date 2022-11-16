package model;

public class VoterReg {
	String v_jumin;
	String v_name;
	String n_no;
	String v_area;
	String v_time;
	String v_confirm;
	
	public VoterReg() {
		// TODO Auto-generated constructor stub
	}

	public VoterReg(String v_jumin, String v_name, String n_no, String v_area, String v_time, String v_confirm) {
		super();
		this.v_jumin = v_jumin;
		this.v_name = v_name;
		this.n_no = n_no;
		this.v_area = v_area;
		this.v_time = v_time;
		this.v_confirm = v_confirm;
	}

	public String getV_jumin() {
		return v_jumin;
	}

	public String getV_name() {
		return v_name;
	}

	public String getN_no() {
		return n_no;
	}

	public String getV_area() {
		return v_area;
	}

	public String getV_time() {
		return v_time;
	}

	public String getV_confirm() {
		return v_confirm;
	}

	@Override
	public String toString() {
		return "VoterReg [v_jumin=" + v_jumin + ", v_name=" + v_name + ", n_no=" + n_no + ", v_area=" + v_area
				+ ", v_time=" + v_time + ", v_confirm=" + v_confirm + "]";
	}

	
	
	
}
