package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


// 아이디 -> 서버(응답)  
// 아이디 hi~~~ 출력  //동적

//get, post 요청
@WebServlet("/hi2")
public class HelloController2 extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//입력
		String id = request.getParameter("id");
		
		//처리
		String result = id + "~ hi";
		
		//출력
		PrintWriter out = response.getWriter();
		out.println(result);
		//view로 이동
		request.setAttribute("id", result);
		request.getRequestDispatcher("WEB-INF/view/hi.jsp").forward(request, response);
		
	}//
	
}
