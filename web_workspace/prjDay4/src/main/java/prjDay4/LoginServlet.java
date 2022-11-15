package prjDay4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		// DB 작업
		
		// 회원인증후 세션에 id를 저장함
		// 세션은 하나의 브라우저에서 유지
		HttpSession session = request.getSession();
		session.setAttribute("userId", id);
		
		out.println("login ok!");
		
		
	}
	
	
}
