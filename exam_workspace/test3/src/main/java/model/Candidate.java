package model;

public class Candidate {

	int n_no;
	String n_name;
	String n_jumin;
	String n_degree;
	int p_no;
	String p_tel;
	
	public Candidate() {
		// TODO Auto-generated constructor stub
	}

	public Candidate(int n_no, String n_name, String n_jumin, String n_degree, int p_no, String p_tel) {
		super();
		this.n_no = n_no;
		this.n_name = n_name;
		this.n_jumin = n_jumin;
		this.n_degree = n_degree;
		this.p_no = p_no;
		this.p_tel = p_tel;
	}

	public int getN_no() {
		return n_no;
	}

	public String getN_name() {
		return n_name;
	}

	public String getN_jumin() {
		return n_jumin;
	}

	public String getN_degree() {
		return n_degree;
	}

	public int getP_no() {
		return p_no;
	}

	public String getP_tel() {
		return p_tel;
	}

	@Override
	public String toString() {
		return "Candidate [n_no=" + n_no + ", n_name=" + n_name + ", n_jumin=" + n_jumin + ", n_degree=" + n_degree
				+ ", p_no=" + p_no + ", p_tel=" + p_tel + "]";
	}
	
	
}
