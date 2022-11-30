package com.acorn.prj2;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DBController {
	
	@Autowired
	MemberDao dao;
	
	@RequestMapping(value = "/db1", method = RequestMethod.GET)
	public String db1(Model m) {
		
		Member member = new Member("aaa","0000");
		m.addAttribute("member",member);
		
		return "db1";
	}
	
	
	@RequestMapping(value = "/db2", method = RequestMethod.GET)
	public String db2(Model m) {
		
		Member member = dao.select("kim");
		m.addAttribute("member",member);
		
		return "db1";
	}
	
	
	@ResponseBody
	@RequestMapping(value = "/js", method = RequestMethod.GET)
	public Member json() {
		Member member = new Member("a01","kkh");
		return member;
	}
	
	@ResponseBody
	@RequestMapping(value = "/js2", method = RequestMethod.GET)
	public ArrayList<Member> json2() {
		ArrayList<Member> members = new ArrayList<Member>();
		members.add(new Member("a01","aaa"));
		members.add(new Member("a02","bbb"));
		members.add(new Member("a03","ccc"));
		
		return members;
	}
	
}
