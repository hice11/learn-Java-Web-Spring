package com.acorn.prj1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DBController {

	@Autowired
	TestDao dao; // injection 주입
	
	@RequestMapping(value = "/dbTest", method = RequestMethod.GET)
	public String dbtest() {
		dao.select();
		return "db";
	}
	
	@RequestMapping(value = "/dbTest2", method = RequestMethod.GET)
	public String dbtest2(String id, String pw) {
		
		//dao.insert("test", "1111");
		dao.insert(id, pw);
		return "db2";
	}
	
}
