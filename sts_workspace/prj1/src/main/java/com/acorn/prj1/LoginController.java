package com.acorn.prj1;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginGet() {
		
		return "login/loginForm";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginPost(String id, String pw, boolean rememberId, HttpServletResponse response) {
		System.out.println(id);
		System.out.println(pw);
		System.out.println(rememberId);
		
		//로그인 실패
		if( !loginCheck(id,pw) ) {
			//로그인 실패하면 로그인 화면으로
			return "redirect:/login";
		}
		
		//로그인 성공
		//세션에 id 기억
		
		//아이디 기억 여부
		if (rememberId){
			//쿠키 생성, 저장
			Cookie cookie = new Cookie("id", id);
			response.addCookie(cookie);
		}else {
			//쿠키 삭제
			Cookie cookie = new Cookie("id", id);
			cookie.setMaxAge(0);
			response.addCookie(cookie);
		}
		//  로그인 성공시 메인 페이지로
		return "redirect:/";
	}

	private boolean loginCheck(String id, String pw) {
		//Dao
		
		return "acorn".equals(id) && "1234".equals(pw);
	}
	
}
