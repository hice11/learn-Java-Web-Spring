package model;

import java.util.ArrayList;

public class TestService {
	TestDBDAO dao;
	
	public TestService() {	}
	
	public TestService(TestDBDAO dao) {
		this.dao = dao;
	}

	public ArrayList<Member> selectAll() {
		ArrayList<Member> list = dao.members();
		return list;
	}
	
	public String[] randomMessage() {
		
		return new String[] {"one","two","three"};
	}

}
