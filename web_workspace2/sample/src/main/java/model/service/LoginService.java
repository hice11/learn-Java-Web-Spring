package model.service;

import model.dao.MemberDao;

public class LoginService {

	MemberDao dao;
	
	public LoginService() {	}

	public LoginService(MemberDao dao) {
		this.dao = dao;
	}
	
	//회원 확인 (Dao)
	public int checkUser(String id, String pw) {
		int result = dao.confirmUser(id, pw);
		return result;
	}
	
}
