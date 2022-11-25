package com.acorn.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

	@RequestMapping(value="/hello", method = RequestMethod.GET)
	public String hello() {
		//view 이름
		return "hello";
	}
	
	@RequestMapping(value="/hi", method = RequestMethod.GET)
	public String hi() {
		//view 이름
		return "hi";
	}
	
	@RequestMapping(value="/hi2", method = RequestMethod.GET)
	public void hi2() {
		//반환
	}
	
	@RequestMapping(value="/hi3", method = RequestMethod.GET)
	public String hi3(String id, String pw, Model model) {
		
		System.out.println(id);
		System.out.println(pw);
		
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		
		return "hi3view";
	}
	
}
