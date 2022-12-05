package com.acorn.prj5.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DBCotroller {	
	@Autowired
	TestService service;	
 
	
	@RequestMapping( value="/tran1" , method=RequestMethod.GET)
	public void db1() throws Exception {	 	 		
			String id="a1";
			String pw="1234";
			service.insertdb1WithTx(id, pw);		
	}
	

	@RequestMapping( value="/tranNo1" , method=RequestMethod.GET)
	public void db2() {	 		 			
			String id="a1";
			String pw="1234";
			service.insertdb1(id, pw);		 
	}
	
 

}
