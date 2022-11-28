package com.acorn.prj1;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ELController {

	@RequestMapping(value = "/el1",method = RequestMethod.GET)
	public String test1(Model m) {
		m.addAttribute("id", "test");
		
		return "el1" ; //view 이름
	}
	
	@RequestMapping(value = "/el2",method = RequestMethod.GET)
	public String test3(Model m) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		m.addAttribute("list", list);
		
		return "el2" ; //view 이름
	}
	
	@RequestMapping(value = "/para1", method = RequestMethod.GET)
	public String test2(String search) {
		System.out.println("search "+search);
		
		return "para1"; //view 이름
	}
}
