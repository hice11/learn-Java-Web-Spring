package model;

public class Votes {

	int n_no;
	String n_name;
	int n_votes;
	
	public Votes() {
		// TODO Auto-generated constructor stub
	}

	public Votes(int n_no, String n_name, int n_votes) {
		super();
		this.n_no = n_no;
		this.n_name = n_name;
		this.n_votes = n_votes;
	}

	public int getN_no() {
		return n_no;
	}

	public String getN_name() {
		return n_name;
	}

	public int getN_votes() {
		return n_votes;
	}

	@Override
	public String toString() {
		return "Vote [n_no=" + n_no + ", n_name=" + n_name + ", n_votes=" + n_votes + "]";
	}
	
}
