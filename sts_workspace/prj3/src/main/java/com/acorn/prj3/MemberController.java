package com.acorn.prj3;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MemberController {
	
	@Autowired
	MemberDao dao;

	@RequestMapping(value = "/member/reg", method = RequestMethod.GET)
	public String memberGET() {
		
		return "reg";
	}
	
	@RequestMapping(value = "/member/reg", method = RequestMethod.POST)
	public String memberPOST(Model m, @RequestParam Member2 member) {
		System.out.println(member);
		dao.insertMember(member);
		
		m.addAttribute("member",member);
		return "complete";
	}
	
	@RequestMapping(value = "/member/list", method = RequestMethod.GET)
	public String memberList(Model m) {
		ArrayList<Member2> list = dao.selectMember();
		
		m.addAttribute("list",list);
		return "list";
	}
	
	@RequestMapping(value = "/member/list2", method = RequestMethod.GET)
	public String memberList2(Model m) {
		ArrayList<Member> list = dao.selectMember2();
		
		m.addAttribute("list",list);
		return "list2";
	}
	
	/*
	@RequestMapping(value = "/member/reg", method = RequestMethod.GET)
	public String member() {
		
		return "reg";
	}
	
	@RequestMapping(value = "/member/reg", method = RequestMethod.POST)
	public String member2(Member2 member) {
		System.out.println(member);
		
		String[] sns = member.getSns().split(",");
		System.out.println(Arrays.toString(sns));
		
		//데이터베이스에 등록
		
		return "complete";
	}
	
	//form 데이터 가져오는 이전 방식
	@RequestMapping(value = "/member/regOld", method = RequestMethod.POST)
	public String member3(HttpServletRequest request) {
		
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String addr = request.getParameter("addr");
		String[] sns = request.getParameterValues("sns");
		
		//
		Member member = new Member(id, name, addr, sns);
		
		//데이터베이스에 등록
		
		return "complete";
	}
	*/
	
	
}
