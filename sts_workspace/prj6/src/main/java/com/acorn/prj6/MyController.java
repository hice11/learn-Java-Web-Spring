package com.acorn.prj6;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String main() {
		
		return "index";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginGet() {
		
		return "login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginPost(String id, String pw, HttpServletRequest request) {
		//dao 확인
		
		//세션에 등록
		HttpSession session = request.getSession();
		session.setAttribute("loginID", id);
		
		return "loginOK";
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpServletRequest request) {
		//세션 삭제
		HttpSession session = request.getSession();
		session.invalidate();
		
		return "redirect:/index";
	}
	
	@RequestMapping(value = "/order.do", method = RequestMethod.GET)
	public String order() {
		//세션확인, 로그인 안했으면 로그인으로 -> 인터셉터로 대체할수있다
		
		return "order";
	}
	
	@RequestMapping(value = "/border.do", method = RequestMethod.GET)
	public String border() {
		//세션확인, 로그인 안했으면 로그인으로 -> 인터셉터로 대체할수있다
		
		return "border";
	}
	
	@RequestMapping( value="/modify", method=RequestMethod.GET)
	public String modify(HttpServletRequest request ) {
		//세션 직접 
		HttpSession session = request.getSession();
		String id = (String) session.getAttribute("loginID");		
		System.out.println("인터셉터 로그인여부:" + id);
		if (id !=null){
			 return "modify";	
	    }
		return "redirect:/login";
	}

	
	
}
