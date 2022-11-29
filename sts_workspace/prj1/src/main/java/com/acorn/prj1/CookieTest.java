package com.acorn.prj1;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CookieTest {

	@RequestMapping(value = "/cookieTest", method = RequestMethod.GET)
	public String test(HttpServletResponse response) {
		
		String id = "test01";
		
		Cookie cookie = new Cookie("id", id);
		response.addCookie(cookie);
		cookie = new Cookie("id2", id);
		response.addCookie(cookie);
		cookie = new Cookie("id3", id);
		response.addCookie(cookie);
		
		return "cookie";
	}
	
}
