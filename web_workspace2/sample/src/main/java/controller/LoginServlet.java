package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.MemberDao;
import model.service.LoginService;

@WebServlet("/login.do")
public class LoginServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().println("hello get!");
		
		//로그인 페이지로
		request.getRequestDispatcher("WEB-INF/views/login.jsp").forward(request, response);
		
	}
	
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().println("hello post!");
		String id = "test01";
		String pw = "0000";
		
		MemberDao dao = new MemberDao();
		LoginService service = new LoginService(dao);
		int result = service.checkUser(id, pw);
		
		if(result == 1) {
			//성공 -> 메인 화면
			request.getRequestDispatcher("WEB-INF/views/main.jsp").forward(request, response);
		}else if (result == 2) {
			//실패 -> 로그인 화면
			String message = "아이디 없음";
			request.setAttribute("message", message);
			request.getRequestDispatcher("WEB-INF/views/login.jsp").forward(request, response);
		}else if (result == 3) {
			//실패 -> 로그인 화면
			String message = "비밀번호 오류";
			request.setAttribute("message", message);
			request.getRequestDispatcher("WEB-INF/views/login.jsp").forward(request, response);
		}
		
	}
	

}
