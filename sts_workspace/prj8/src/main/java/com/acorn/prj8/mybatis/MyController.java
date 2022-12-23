package com.acorn.prj8.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	
	
	@Autowired
	BatisDao  repository;

	@ResponseBody
	@GetMapping("/batis")
	public String count() {		
		String result="";
		int count;
		try {
			count = repository.count();
			result = String.valueOf(count) ;     //     4   ="4"
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return   result;
		//return  "4";
	}
	
}
