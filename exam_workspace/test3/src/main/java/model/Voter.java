package model;

public class Voter {
	String v_name;
	String v_jumin;
	int v_age;
	String v_gender;
	String v_area;
	String v_confirm;
	
	public Voter() {
		// TODO Auto-generated constructor stub
	}

	public Voter(String v_name, String v_jumin, int v_age, String v_gender, String v_area, String v_confirm) {
		super();
		this.v_name = v_name;
		this.v_jumin = v_jumin;
		this.v_age = v_age;
		this.v_gender = v_gender;
		this.v_area = v_area;
		this.v_confirm = v_confirm;
	}

	public String getV_name() {
		return v_name;
	}

	public String getV_jumin() {
		return v_jumin;
	}

	public int getV_age() {
		return v_age;
	}

	public String getV_gender() {
		return v_gender;
	}

	public String getV_area() {
		return v_area;
	}

	public String getV_confirm() {
		return v_confirm;
	}

	@Override
	public String toString() {
		return "Voter [v_name=" + v_name + ", v_jumin=" + v_jumin + ", v_age=" + v_age + ", v_gender=" + v_gender
				+ ", v_area=" + v_area + ", v_confirm=" + v_confirm + "]";
	}
	
	
	
}
