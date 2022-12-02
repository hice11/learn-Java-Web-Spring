package com.acorn.prj4;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RequestController {

	//form 화면
	@RequestMapping(value = "/reg", method = RequestMethod.GET)
	public String regGet() {
		
		return "regform";
	}
	
	@RequestMapping(value = "/reg", method = RequestMethod.POST)
	public String regPost(HttpServletRequest request) {
		//클라이언트로부터 넘어오는 데이터
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		
		System.out.println(id+" "+pw+" "+name);
		
		//디비작업
		
		return "complete";
	}
	
	@ResponseBody
	@RequestMapping( value="/body" , method= RequestMethod.POST)
	public void test(HttpServletRequest request) throws IOException { 
		
		BufferedReader r = new BufferedReader( new InputStreamReader( request.getInputStream()));
		String re="";
		while( (re = r.readLine()) != null) {
			System.out.println( re);
		}
		 
	};

	
	
}
