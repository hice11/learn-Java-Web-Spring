package prjDay2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/s1012")
public class Servlet1 extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//response.setContentType("text/plain;charset=utf-8");
		// text/plain - html태그도 텍스트로 인식
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		response.setCharacterEncoding("UTF-8");
		
		String key = request.getParameter("key");
		System.out.println(key);
		
		System.out.println("start");
		
		PrintWriter out = response.getWriter();
		out.println("hello~ <br><br> web");
		out.println("hi1");
		out.println("hi2");
		
		
		
	}
	
	
	
}
